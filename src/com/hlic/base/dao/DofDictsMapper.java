package com.hlic.base.dao;

import com.hlic.base.pojo.po.DofDicts;
import com.hlic.base.pojo.po.DofDictsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DofDictsMapper {
    int countByExample(DofDictsExample example);

    int deleteByExample(DofDictsExample example);

    int insert(DofDicts record);

    int insertSelective(DofDicts record);

    List<DofDicts> selectByExample(DofDictsExample example);

    int updateByExampleSelective(@Param("record") DofDicts record, @Param("example") DofDictsExample example);

    int updateByExample(@Param("record") DofDicts record, @Param("example") DofDictsExample example);
}