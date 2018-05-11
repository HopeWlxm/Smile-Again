package com.lx.service;

import com.lx.po.ActiveUser;
import com.lx.po.SysPermission;
import com.lx.po.SysUser;

import java.util.List;

/**
 * <B>系统名称: </B><BR>
 * <B>模块名称: </B><BR>
 * <B>概要说明: </B><BR>
 *
 * @author MR.Administrator
 * @since 2018年05月10日
 */
public interface UserService {



    //根据用户的身份和密码进行认证，如果认证成功，返回用户信息
    //ActiveUser authenticat(String userCode,String password) throws Exception;

    //根据用户账号查询用户信息
    SysUser querySysUserByUserCode(String userCode) throws Exception;

    //根据用户id查询菜单列表
    List<SysPermission> queryMenuListByUserId(String userId) throws Exception;

    //根据用户的id查询权限范围的url
    List<SysPermission> findPermissionListByUserId(String userId) throws Exception;

}
