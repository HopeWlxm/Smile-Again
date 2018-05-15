package com.lx.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lx.common.DataTable;
import com.lx.admin.mapper.SysPermissionMapperSysUser;
import com.lx.admin.mapper.SysUserMapper;
import com.lx.admin.po.SysPermission;
import com.lx.admin.po.SysUser;
import com.lx.admin.po.SysUserExample;
import com.lx.admin.service.UserService;
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

    public DataTable queryUserList(int page, int rows , Integer draw) {
        //分页处理
        PageHelper.startPage(page,rows);
        SysUserExample example = new SysUserExample();
        List<SysUser> list = sysUserMapper.selectByExample(example);
        //取分页信息
        PageInfo<SysUser> pageInfo = new PageInfo<SysUser>(list);

        DataTable result = new DataTable();
        result.setDraw(draw);
        result.setRecordsTotal((int) pageInfo.getTotal());
        result.setRecordsFiltered((int) pageInfo.getTotal());
        result.setData(list);
        return result;
    }


}
