package com.hlic.base.dao;

import com.hlic.base.pojo.po.DctEnum;
import com.hlic.base.pojo.po.DctEnumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DctEnumMapper {
    int countByExample(DctEnumExample example);

    int deleteByExample(DctEnumExample example);

    int insert(DctEnum record);

    int insertSelective(DctEnum record);

    List<DctEnum> selectByExample(DctEnumExample example);

    int updateByExampleSelective(@Param("record") DctEnum record, @Param("example") DctEnumExample example);

    int updateByExample(@Param("record") DctEnum record, @Param("example") DctEnumExample example);
}