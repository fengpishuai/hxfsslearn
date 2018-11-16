package com.hlic.base.dao.mapper;

import com.hlic.base.pojo.po.ScAttach;
import com.hlic.base.pojo.po.ScAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScAttachMapper {
    int countByExample(ScAttachExample example);

    int deleteByExample(ScAttachExample example);

    int insert(ScAttach record);

    int insertSelective(ScAttach record);

    List<ScAttach> selectByExample(ScAttachExample example);

    int updateByExampleSelective(@Param("record") ScAttach record, @Param("example") ScAttachExample example);

    int updateByExample(@Param("record") ScAttach record, @Param("example") ScAttachExample example);
}