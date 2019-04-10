package com.hlic.base.dao;

import com.hlic.base.pojo.po.DofSn;
import com.hlic.base.pojo.po.DofSnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DofSnMapper {
    int countByExample(DofSnExample example);

    int deleteByExample(DofSnExample example);

    int deleteByPrimaryKey(String snId);

    int insert(DofSn record);

    int insertSelective(DofSn record);

    List<DofSn> selectByExample(DofSnExample example);

    DofSn selectByPrimaryKey(String snId);

    int updateByExampleSelective(@Param("record") DofSn record, @Param("example") DofSnExample example);

    int updateByExample(@Param("record") DofSn record, @Param("example") DofSnExample example);

    int updateByPrimaryKeySelective(DofSn record);

    int updateByPrimaryKey(DofSn record);
}