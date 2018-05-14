package com.lx.shiro;

import com.lx.po.ActiveUser;
import com.lx.po.SysPermission;
import com.lx.po.SysUser;
import com.lx.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class SysUserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;


    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        //token是用户输入的,根据这个token取出身份信息
        String userCode = (String) token.getPrincipal();
        //System.out.println(userCode);
        //根据userCode查询数据库
        SysUser sysUser = null;
        try {
            sysUser = userService.querySysUserByUserCode(userCode);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //判断是否从数据库查到sysUser
        if (sysUser == null) {
            return null;
        }

        //密码
        String password = sysUser.getPassword();
        //盐
        String salt = sysUser.getSalt();


        //activeUser就是用户的身份信息
        ActiveUser activeUser = new ActiveUser();
        activeUser.setUserCode(sysUser.getUsercode());
        activeUser.setUserName(sysUser.getUsername());
        activeUser.setUserId(sysUser.getId());
        //通过userId取出菜单
        List<SysPermission> menus = null;
        try {
            menus = userService.queryMenuListByUserId(sysUser.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        activeUser.setMenus(menus);

        SimpleAuthenticationInfo simpleAuthenticationInfo =
                new SimpleAuthenticationInfo(activeUser, password, ByteSource.Util.bytes(salt), this.getName());

        return simpleAuthenticationInfo;
    }

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //从principals获取主身份信息
        //将getPrimaryPrincipal方法返回值转为真实身份类型(在上边的goGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo)
        ActiveUser activeUser = (ActiveUser) principals.getPrimaryPrincipal();

        //从数据库中取出权限信息
        List<SysPermission> list = null;
        try {
            list = userService.findPermissionListByUserId(activeUser.getUserId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<String> permissions = new ArrayList<String>();
        if (list != null){
            for (SysPermission sysPermission : list) {
                permissions.add(sysPermission.getPercode());
            }
        }
        //查询到权限信息，返回授权信息(包括上边的permissions)
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }

}
