package com.hlic.base.dao.mapper;

import com.hlic.base.pojo.po.Approve;
import com.hlic.base.pojo.po.ApproveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApproveMapper {
    int countByExample(ApproveExample example);

    int deleteByExample(ApproveExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Approve record);

    int insertSelective(Approve record);

    List<Approve> selectByExample(ApproveExample example);

    Approve selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Approve record, @Param("example") ApproveExample example);

    int updateByExample(@Param("record") Approve record, @Param("example") ApproveExample example);

    int updateByPrimaryKeySelective(Approve record);

    int updateByPrimaryKey(Approve record);
}