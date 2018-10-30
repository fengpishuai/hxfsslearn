package com.hlic.base.dao.mapper;

import com.hlic.base.pojo.po.SysMenus;
import com.hlic.base.pojo.po.SysMenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenusMapper {
    int countByExample(SysMenusExample example);

    int deleteByExample(SysMenusExample example);

    int deleteByPrimaryKey(String fMenuId);

    int insert(SysMenus record);

    int insertSelective(SysMenus record);

    List<SysMenus> selectByExample(SysMenusExample example);

    SysMenus selectByPrimaryKey(String fMenuId);

    int updateByExampleSelective(@Param("record") SysMenus record, @Param("example") SysMenusExample example);

    int updateByExample(@Param("record") SysMenus record, @Param("example") SysMenusExample example);

    int updateByPrimaryKeySelective(SysMenus record);

    int updateByPrimaryKey(SysMenus record);
    List<SysMenus> querymenusList();
    int addSysMenusRecordBatch(List<SysMenus> sysMenus);
}