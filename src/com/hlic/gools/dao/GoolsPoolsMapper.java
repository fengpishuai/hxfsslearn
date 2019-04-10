package com.hlic.gools.dao;

import com.hlic.gools.pojo.po.GoolsPools;
import com.hlic.gools.pojo.po.GoolsPoolsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoolsPoolsMapper {
    int countByExample(GoolsPoolsExample example);

    int deleteByExample(GoolsPoolsExample example);

    int insert(GoolsPools record);

    int insertSelective(GoolsPools record);

    List<GoolsPools> selectByExample(GoolsPoolsExample example);

    int updateByExampleSelective(@Param("record") GoolsPools record, @Param("example") GoolsPoolsExample example);

    int updateByExample(@Param("record") GoolsPools record, @Param("example") GoolsPoolsExample example);
}