package com.hlic.test;

import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;

public class TestProcessDefinitionEntity {

	@Test
	public void testGetActivityImpl(){
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		/**
		 * 根据pdid得到ProcessDefinitionEntry
		 */
		ProcessDefinitionEntity processDefinitionEntity = (ProcessDefinitionEntity)processEngine.getRepositoryService()
		.getProcessDefinition("leavebill:1:2004");
		
		/**
		 * ActivityImpl是一个对象
		 * 一个activityImpl代表processDefinitionEntity中的一个节点
		 */
		List<ActivityImpl> activityImpls = processDefinitionEntity.getActivities();
		for (ActivityImpl activityImpl : activityImpls) {
			System.out.println(activityImpl.getId());
			System.out.print("hegiht:"+activityImpl.getHeight());
			System.out.print("width:"+activityImpl.getWidth());
			System.out.print(" x:"+activityImpl.getX());
			System.out.println(" y:"+activityImpl.getY());
		}
	}
}
