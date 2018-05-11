package com.lx.po;

import java.io.Serializable;
import java.util.List;

/**
 * <B>系统名称: </B><BR>
 * <B>模块名称: </B><BR>
 * <B>概要说明: </B><BR>
 *  用户身份信息，存入session 由于tomcat将session会序列化在本地硬盘上，所以使用Serializable接口
 * @author MR.Administrator
 * @since 2018年05月10日
 */
public class ActiveUser implements Serializable{

    private String userId;//用户id

    private String userCode;//用户账号

    private String userName;//用户名称

    private List<SysPermission> menus;//菜单

    private List<SysPermission> permissions;//权限

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<SysPermission> getMenus() {
        return menus;
    }

    public void setMenus(List<SysPermission> menus) {
        this.menus = menus;
    }

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }
}
