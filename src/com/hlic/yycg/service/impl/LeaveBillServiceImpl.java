package com.hlic.yycg.service.impl;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hlic.base.bill.ActivitiConsoleUtils;
import com.hlic.base.service.impl.BaseServiceImpl;
import com.hlic.utils.paginator.domain.PageList;
import com.hlic.yycg.dao.mapper.LeavebillMapper;
import com.hlic.yycg.pojo.po.Leavebill;
import com.hlic.yycg.pojo.po.LeavebillExample;
import com.hlic.yycg.pojo.po.LeavebillExample.Criteria;
import com.hlic.yycg.service.LeaveBillService;

public class LeaveBillServiceImpl extends BaseServiceImpl implements LeaveBillService {

    @Resource(name="activitiConsoleUtils")
    private ActivitiConsoleUtils activitiConsoleUtils;
    
    @Autowired
    private LeavebillMapper leavebillMapper;
    
    @Transactional
    public int insertSelective(Leavebill leavebill) {
        return leavebillMapper.insertSelective(leavebill);
    }

    /**
     * 根据单据编号查询单据
     */
    public Leavebill findLeaveBillByID(String id) {
        return this.leavebillMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据用户ID查询我的单据
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<Leavebill> findLeaveBillListByID(String userId) {
        List wddj = this.activitiConsoleUtils.queryWDDB(userId);
        LeavebillExample leavebillExaple = new LeavebillExample();
        if(wddj.size()>0){
            Criteria criteria =leavebillExaple.createCriteria();
            criteria.andIdIn(wddj);
            return this.leavebillMapper.selectByExample(leavebillExaple);
        }else{
            return null;
        }
    }
	/*
	 * 启动请假申请流程
	 * @param jsonObject flowName:流程名称leavebill; pdid:流程定义id leavebill:2:104
	 * @param userId 用户id
	 */
	public int startLeaveBillFlow(String jsonObject, String userId) {
		String classType = "";
		String businessKey = "";
		JSONObject saveData = JSONObject.fromObject(jsonObject);
        //流程名称 例如leavebill
        String flowName = saveData.getString("flowName");
        //pdid 流程定义id 例如leavebill:2:104
        String fdjbh = saveData.getString("F_DJBH");
        Leavebill leaveBill = leavebillMapper.selectByPrimaryKey(fdjbh);
        if(leaveBill != null){
            classType =leaveBill.getClass().getSimpleName();
        	businessKey = classType + ":" + fdjbh;
        	this.activitiConsoleUtils.startPI(flowName,businessKey,userId);
        	return 1;
        }else{
        	return 0;
        }
	}

	public PageList<Leavebill> getAll(int pageIndex, int pageSize,
			Object sqlParameter) throws Exception {
		return (PageList<Leavebill>) getPageList(LeavebillMapper.class, "leavebillList",sqlParameter, pageIndex, pageSize);
	}
}
