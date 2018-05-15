package com.lx.admin.mapper;

import com.lx.admin.po.SysPermission;
import com.lx.admin.po.SysPermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysPermissionMapper {
    int countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Long perid);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Long perid);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}