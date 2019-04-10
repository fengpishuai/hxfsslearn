package com.hlic.base.dao;

import com.hlic.base.pojo.po.DofStoreCols;
import com.hlic.base.pojo.po.DofStoreColsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DofStoreColsMapper {
    int countByExample(DofStoreColsExample example);

    int deleteByExample(DofStoreColsExample example);

    int insert(DofStoreCols record);

    int insertSelective(DofStoreCols record);

    List<DofStoreCols> selectByExample(DofStoreColsExample example);

    int updateByExampleSelective(@Param("record") DofStoreCols record, @Param("example") DofStoreColsExample example);

    int updateByExample(@Param("record") DofStoreCols record, @Param("example") DofStoreColsExample example);
}