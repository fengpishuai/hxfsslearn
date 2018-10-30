package com.hlic.base.dao.mapper;

import com.hlic.base.pojo.po.WdRptqueryFilter;
import com.hlic.base.pojo.po.WdRptqueryFilterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WdRptqueryFilterMapper {
    int countByExample(WdRptqueryFilterExample example);

    int deleteByExample(WdRptqueryFilterExample example);

    int deleteByPrimaryKey(String fPkey);

    int insert(WdRptqueryFilter record);

    int insertSelective(WdRptqueryFilter record);

    List<WdRptqueryFilter> selectByExample(WdRptqueryFilterExample example);

    WdRptqueryFilter selectByPrimaryKey(String fPkey);

    int updateByExampleSelective(@Param("record") WdRptqueryFilter record, @Param("example") WdRptqueryFilterExample example);

    int updateByExample(@Param("record") WdRptqueryFilter record, @Param("example") WdRptqueryFilterExample example);

    int updateByPrimaryKeySelective(WdRptqueryFilter record);

    int updateByPrimaryKey(WdRptqueryFilter record);
}