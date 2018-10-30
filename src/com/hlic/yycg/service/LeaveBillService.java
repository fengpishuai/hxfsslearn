package com.hlic.yycg.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.hlic.base.pojo.po.SysFunc;
import com.hlic.utils.paginator.domain.PageList;
import com.hlic.yycg.pojo.po.Leavebill;
import com.hlic.yycg.pojo.po.LeavebillExample;

public interface LeaveBillService {

    int insertSelective(Leavebill leavebill);
    
    Leavebill findLeaveBillByID(String id);
    
    List<Leavebill> findLeaveBillListByID(String userId);
    
    int startLeaveBillFlow(String jsonObject, String userId);
    
    PageList<Leavebill> getAll(int pageIndex, int pageSize,Object sqlParameter) throws Exception;
}
