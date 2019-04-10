package com.hlic.base.dao;

import com.hlic.base.pojo.po.SysBxDjlx;
import com.hlic.base.pojo.po.SysBxDjlxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBxDjlxMapper {
    int countByExample(SysBxDjlxExample example);

    int deleteByExample(SysBxDjlxExample example);

    int insert(SysBxDjlx record);

    int insertSelective(SysBxDjlx record);

    List<SysBxDjlx> selectByExample(SysBxDjlxExample example);

    int updateByExampleSelective(@Param("record") SysBxDjlx record, @Param("example") SysBxDjlxExample example);

    int updateByExample(@Param("record") SysBxDjlx record, @Param("example") SysBxDjlxExample example);
}