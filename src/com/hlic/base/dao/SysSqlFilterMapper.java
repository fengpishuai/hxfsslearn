package com.hlic.base.dao;

import com.hlic.base.pojo.po.SysSqlFilter;
import com.hlic.base.pojo.po.SysSqlFilterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSqlFilterMapper {
    int countByExample(SysSqlFilterExample example);

    int deleteByExample(SysSqlFilterExample example);

    int insert(SysSqlFilter record);

    int insertSelective(SysSqlFilter record);

    List<SysSqlFilter> selectByExample(SysSqlFilterExample example);

    int updateByExampleSelective(@Param("record") SysSqlFilter record, @Param("example") SysSqlFilterExample example);

    int updateByExample(@Param("record") SysSqlFilter record, @Param("example") SysSqlFilterExample example);
}