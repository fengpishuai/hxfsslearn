package com.hlic.base.dao;

import com.hlic.base.pojo.po.SysRoles;
import com.hlic.base.pojo.po.SysRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolesMapper {
    int countByExample(SysRolesExample example);

    int deleteByExample(SysRolesExample example);

    int deleteByPrimaryKey(String fRoleid);

    int insert(SysRoles record);

    int insertSelective(SysRoles record);

    List<SysRoles> selectByExample(SysRolesExample example);

    SysRoles selectByPrimaryKey(String fRoleid);

    int updateByExampleSelective(@Param("record") SysRoles record, @Param("example") SysRolesExample example);

    int updateByExample(@Param("record") SysRoles record, @Param("example") SysRolesExample example);

    int updateByPrimaryKeySelective(SysRoles record);

    int updateByPrimaryKey(SysRoles record);
}