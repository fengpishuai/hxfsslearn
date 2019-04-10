package com.hlic.base.dao;

import com.hlic.base.pojo.po.SysUserRoleOrg;
import com.hlic.base.pojo.po.SysUserRoleOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleOrgMapper {
    int countByExample(SysUserRoleOrgExample example);

    int deleteByExample(SysUserRoleOrgExample example);

    int deleteByPrimaryKey(String fPkey);

    int insert(SysUserRoleOrg record);

    int insertSelective(SysUserRoleOrg record);

    List<SysUserRoleOrg> selectByExample(SysUserRoleOrgExample example);
    
    List<SysUserRoleOrg> selectUserAndRoleByExample(SysUserRoleOrgExample example);

    SysUserRoleOrg selectByPrimaryKey(String fPkey);

    int updateByExampleSelective(@Param("record") SysUserRoleOrg record, @Param("example") SysUserRoleOrgExample example);

    int updateByExample(@Param("record") SysUserRoleOrg record, @Param("example") SysUserRoleOrgExample example);

    int updateByPrimaryKeySelective(SysUserRoleOrg record);

    int updateByPrimaryKey(SysUserRoleOrg record);
}