package com.hlic.base.dao;

import com.hlic.base.pojo.po.SysFunc;
import com.hlic.base.pojo.po.SysFuncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFuncMapper {
    int countByExample(SysFuncExample example);

    int deleteByExample(SysFuncExample example);

    int deleteByPrimaryKey(Integer fBh);

    int insert(SysFunc record);

    int insertSelective(SysFunc record);

    List<SysFunc> selectByExample(SysFuncExample example);

    SysFunc selectByPrimaryKey(Integer fBh);

    int updateByExampleSelective(@Param("record") SysFunc record, @Param("example") SysFuncExample example);

    int updateByExample(@Param("record") SysFunc record, @Param("example") SysFuncExample example);

    int updateByPrimaryKeySelective(SysFunc record);

    int updateByPrimaryKey(SysFunc record);
    
    int insertByBatch(List<SysFunc> sysfunclist);
    
    int addSysFuncRecordBatch(List<SysFunc> list);
}