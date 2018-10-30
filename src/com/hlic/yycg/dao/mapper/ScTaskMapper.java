package com.hlic.yycg.dao.mapper;

import com.hlic.yycg.pojo.po.ScTask;
import com.hlic.yycg.pojo.po.ScTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScTaskMapper {
    int countByExample(ScTaskExample example);

    int deleteByExample(ScTaskExample example);

    int deleteByPrimaryKey(String fPkey);

    int insert(ScTask record);

    int insertSelective(ScTask record);

    List<ScTask> selectByExample(ScTaskExample example);

    ScTask selectByPrimaryKey(String fPkey);

    int updateByExampleSelective(@Param("record") ScTask record, @Param("example") ScTaskExample example);

    int updateByExample(@Param("record") ScTask record, @Param("example") ScTaskExample example);

    int updateByPrimaryKeySelective(ScTask record);

    int updateByPrimaryKey(ScTask record);
}