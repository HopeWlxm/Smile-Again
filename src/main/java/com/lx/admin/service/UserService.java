package com.lx.admin.service;

import com.lx.common.DataTable;
import com.lx.admin.po.SysPermission;
import com.lx.admin.po.SysUser;

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

    //根据username查询用户信息
    SysUser querySysUserByUserCode(String userCode) throws Exception;

    //根据用户id查询菜单列表
    List<SysPermission> queryMenuListByUserId(String userId) throws Exception;

    //根据用户的id查询权限范围的url
    List<SysPermission> findPermissionListByUserId(String userId) throws Exception;

    DataTable queryUserList(int page, int rows ,Integer draw);

    //分页查询DetailUser
    //DataTable queryDetailUserList(int page,int rows,Integer draw);

}
