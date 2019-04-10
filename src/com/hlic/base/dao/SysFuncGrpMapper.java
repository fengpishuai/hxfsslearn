package com.hlic.base.dao;

import com.hlic.base.pojo.po.SysFuncGrp;
import com.hlic.base.pojo.po.SysFuncGrpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFuncGrpMapper {
    int countByExample(SysFuncGrpExample example);

    int deleteByExample(SysFuncGrpExample example);

    int insert(SysFuncGrp record);

    int insertSelective(SysFuncGrp record);

    List<SysFuncGrp> selectByExample(SysFuncGrpExample example);

    int updateByExampleSelective(@Param("record") SysFuncGrp record, @Param("example") SysFuncGrpExample example);

    int updateByExample(@Param("record") SysFuncGrp record, @Param("example") SysFuncGrpExample example);
}