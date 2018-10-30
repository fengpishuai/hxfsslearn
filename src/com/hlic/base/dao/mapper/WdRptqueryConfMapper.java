package com.hlic.base.dao.mapper;

import com.hlic.base.pojo.po.WdRptqueryConf;
import com.hlic.base.pojo.po.WdRptqueryConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WdRptqueryConfMapper {
    int countByExample(WdRptqueryConfExample example);

    int deleteByExample(WdRptqueryConfExample example);

    int deleteByPrimaryKey(String fPkey);

    int insert(WdRptqueryConf record);

    int insertSelective(WdRptqueryConf record);

    List<WdRptqueryConf> selectByExample(WdRptqueryConfExample example);

    WdRptqueryConf selectByPrimaryKey(String fPkey);

    int updateByExampleSelective(@Param("record") WdRptqueryConf record, @Param("example") WdRptqueryConfExample example);

    int updateByExample(@Param("record") WdRptqueryConf record, @Param("example") WdRptqueryConfExample example);

    int updateByPrimaryKeySelective(WdRptqueryConf record);

    int updateByPrimaryKey(WdRptqueryConf record);
}