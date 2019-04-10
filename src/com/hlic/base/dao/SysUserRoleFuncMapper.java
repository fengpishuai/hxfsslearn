package com.hlic.base.dao;

import com.hlic.base.pojo.po.SysUserRoleFunc;
import com.hlic.base.pojo.po.SysUserRoleFuncExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysUserRoleFuncMapper {
    int countByExample(SysUserRoleFuncExample example);

    int deleteByExample(SysUserRoleFuncExample example);

    int insert(SysUserRoleFunc record);

    int insertSelective(SysUserRoleFunc record);

    List<SysUserRoleFunc> selectByExample(SysUserRoleFuncExample example);
    
    List<SysUserRoleFunc> selectByUserIdInFuncId(Map map);

    int updateByExampleSelective(@Param("record") SysUserRoleFunc record, @Param("example") SysUserRoleFuncExample example);

    int updateByExample(@Param("record") SysUserRoleFunc record, @Param("example") SysUserRoleFuncExample example);
}