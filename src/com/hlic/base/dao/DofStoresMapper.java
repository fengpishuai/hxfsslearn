package com.hlic.base.dao;

import com.hlic.base.pojo.po.DofStores;
import com.hlic.base.pojo.po.DofStoresExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DofStoresMapper {
    int countByExample(DofStoresExample example);

    int deleteByExample(DofStoresExample example);

    int insert(DofStores record);

    int insertSelective(DofStores record);

    List<DofStores> selectByExample(DofStoresExample example);

    int updateByExampleSelective(@Param("record") DofStores record, @Param("example") DofStoresExample example);

    int updateByExample(@Param("record") DofStores record, @Param("example") DofStoresExample example);
}