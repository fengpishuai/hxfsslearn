package com.hlic.yycg.dao.mapper;

import com.hlic.yycg.pojo.po.Leavebill;
import com.hlic.yycg.pojo.po.LeavebillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeavebillMapper {
    int countByExample(LeavebillExample example);

    int deleteByExample(LeavebillExample example);

    int deleteByPrimaryKey(String id);

    int insert(Leavebill record);

    int insertSelective(Leavebill record);

    List<Leavebill> selectByExample(LeavebillExample example);

    Leavebill selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Leavebill record, @Param("example") LeavebillExample example);

    int updateByExample(@Param("record") Leavebill record, @Param("example") LeavebillExample example);

    int updateByPrimaryKeySelective(Leavebill record);

    int updateByPrimaryKey(Leavebill record);
}