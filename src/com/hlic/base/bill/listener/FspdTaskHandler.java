package com.hlic.base.bill.listener;

import org.activiti.engine.delegate.DelegateTask;

//初审派单
public class FspdTaskHandler {
	public void callMethod(DelegateTask delegateTask,String eventName) {
		delegateTask.setAssignee("100002");
	}
}
