package com.hlic.yycg.dao.mapper;

import com.hlic.yycg.pojo.po.HxQuestion;
import com.hlic.yycg.pojo.po.HxQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HxQuestionMapper {
    int countByExample(HxQuestionExample example);

    int deleteByExample(HxQuestionExample example);

    int insert(HxQuestion record);

    int insertSelective(HxQuestion record);

    List<HxQuestion> selectByExampleWithBLOBs(HxQuestionExample example);

    List<HxQuestion> selectByExample(HxQuestionExample example);

    int updateByExampleSelective(@Param("record") HxQuestion record, @Param("example") HxQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") HxQuestion record, @Param("example") HxQuestionExample example);

    int updateByExample(@Param("record") HxQuestion record, @Param("example") HxQuestionExample example);
}