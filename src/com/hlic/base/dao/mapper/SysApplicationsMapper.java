package com.hlic.base.dao.mapper;

import com.hlic.base.pojo.po.SysApplications;
import com.hlic.base.pojo.po.SysApplicationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysApplicationsMapper {
    int countByExample(SysApplicationsExample example);

    int deleteByExample(SysApplicationsExample example);

    int insert(SysApplications record);

    int insertSelective(SysApplications record);

    List<SysApplications> selectByExample(SysApplicationsExample example);

    int updateByExampleSelective(@Param("record") SysApplications record, @Param("example") SysApplicationsExample example);

    int updateByExample(@Param("record") SysApplications record, @Param("example") SysApplicationsExample example);
}