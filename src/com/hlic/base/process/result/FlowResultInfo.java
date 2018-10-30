package com.hlic.base.process.result;

import java.util.List;

import org.activiti.engine.impl.persistence.entity.DeploymentEntity;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;

import com.hlic.base.pojo.vo.DeployVo;

public class FlowResultInfo {
    //操作结果信息
    private ResultInfo resultInfo;
    //部署信息
    private List<DeployVo> deployment;
    //流程定义的信息
    private List<ProcessDefinition> processDefinition;

    public ResultInfo getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(ResultInfo resultInfo) {
        this.resultInfo = resultInfo;
    }

    public List<DeployVo> getDeployment() {
        return deployment;
    }

    public void setDeployment(List<DeployVo> deployment) {
        this.deployment = deployment;
    }

    public List<ProcessDefinition> getProcessDefinition() {
        return processDefinition;
    }

    public void setProcessDefinition(List<ProcessDefinition> processDefinition) {
        this.processDefinition = processDefinition;
    }

}
