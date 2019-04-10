package com.hlic.base.service;

import java.util.List;

import com.hlic.base.pojo.vo.FlowVo;

public interface IWorkFlowService {
    void completeTask(String taskId, String userId,String comment);
    //查询我的待办
    List<FlowVo> queryWDDBList(String userId);
    void jumpTask(String inputJson);
}
