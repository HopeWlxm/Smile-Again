package com.lx.service.impl;

import com.lx.mapper.SysPermissionMapperSysUser;
import com.lx.mapper.SysUserMapper;
import com.lx.po.ActiveUser;
import com.lx.po.SysPermission;
import com.lx.po.SysUser;
import com.lx.po.SysUserExample;
import com.lx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysPermissionMapperSysUser sysPermissionMapperSysUser;



    public SysUser querySysUserByUserCode(String userCode) throws Exception {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsercodeEqualTo(userCode);
        List<SysUser> list = sysUserMapper.selectByExample(example);

        if (list != null && list.size()==1){
           return list.get(0);
        }

        return null;
    }

    public List<SysPermission> queryMenuListByUserId(String userId) throws Exception {
        return sysPermissionMapperSysUser.findMenuListByUserId(userId);
    }

    public List<SysPermission> findPermissionListByUserId(String userId) throws Exception {
        return sysPermissionMapperSysUser.findPermissionListByUserId(userId);
    }
}
