package com.hlic.yycg.dao.mapper;

import com.hlic.yycg.pojo.po.HxQuertionMx;
import com.hlic.yycg.pojo.po.HxQuertionMxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HxQuertionMxMapper {
    int countByExample(HxQuertionMxExample example);

    int deleteByExample(HxQuertionMxExample example);

    int insert(HxQuertionMx record);

    int insertSelective(HxQuertionMx record);

    List<HxQuertionMx> selectByExampleWithBLOBs(HxQuertionMxExample example);

    List<HxQuertionMx> selectByExample(HxQuertionMxExample example);

    int updateByExampleSelective(@Param("record") HxQuertionMx record, @Param("example") HxQuertionMxExample example);

    int updateByExampleWithBLOBs(@Param("record") HxQuertionMx record, @Param("example") HxQuertionMxExample example);

    int updateByExample(@Param("record") HxQuertionMx record, @Param("example") HxQuertionMxExample example);
}