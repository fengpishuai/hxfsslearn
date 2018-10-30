package com.hlic.base.dao.mapper;

import com.hlic.base.pojo.po.DofDctCols;
import com.hlic.base.pojo.po.DofDctColsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DofDctColsMapper {
    int countByExample(DofDctColsExample example);

    int deleteByExample(DofDctColsExample example);

    int insert(DofDctCols record);

    int insertSelective(DofDctCols record);

    List<DofDctCols> selectByExample(DofDctColsExample example);

    int updateByExampleSelective(@Param("record") DofDctCols record, @Param("example") DofDctColsExample example);

    int updateByExample(@Param("record") DofDctCols record, @Param("example") DofDctColsExample example);
}