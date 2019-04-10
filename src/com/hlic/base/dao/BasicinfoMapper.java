package com.hlic.base.dao;

import com.hlic.base.pojo.po.Basicinfo;
import com.hlic.base.pojo.po.BasicinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicinfoMapper {
    int countByExample(BasicinfoExample example);

    int deleteByExample(BasicinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Basicinfo record);

    int insertSelective(Basicinfo record);

    List<Basicinfo> selectByExample(BasicinfoExample example);

    Basicinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Basicinfo record, @Param("example") BasicinfoExample example);

    int updateByExample(@Param("record") Basicinfo record, @Param("example") BasicinfoExample example);

    int updateByPrimaryKeySelective(Basicinfo record);

    int updateByPrimaryKey(Basicinfo record);
}