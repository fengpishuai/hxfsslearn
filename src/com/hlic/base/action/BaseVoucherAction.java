package com.hlic.base.action;

import java.util.List;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlic.base.dao.DofStoreColsMapper;
import com.hlic.base.dao.SysBxDjlxMapper;
import com.hlic.base.pojo.po.DofStoreCols;
import com.hlic.base.pojo.po.DofStoreColsExample;
import com.hlic.base.pojo.po.SysBxDjlx;
import com.hlic.base.pojo.po.SysBxDjlxExample;
import com.hlic.base.pojo.po.SysMenus;
import com.hlic.base.pojo.po.SysBxDjlxExample.Criteria;

@Controller
@RequestMapping("voucher")
public class BaseVoucherAction {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SysBxDjlxMapper sysBxDjlxMapper;
	
	@Autowired
	private DofStoreColsMapper dofStoreColsMapper;
	
	//凭据公共页面
	@RequestMapping("/mkcommonvchr")
    public String mkcommonvchr(Model model, String fDjlxId){
		if(!"".equals("fDjlxId")){
			SysBxDjlxExample sysBxDjlxExample = new SysBxDjlxExample();
			Criteria criteria = sysBxDjlxExample.createCriteria();
			criteria.andFBhEqualTo(fDjlxId);
			List<SysBxDjlx> SysBxDjlxList = sysBxDjlxMapper.selectByExample(sysBxDjlxExample);
			model.addAttribute("SysBxDjlx", SysBxDjlxList.get(0));
		}else{
			logger.error("凭据公共页面必须在（功能管理、单据类型）中配置单据类型");
		}
		
        return "/project/base/mkcommonvchr";
    }
	
	//查询单据布局数据
	@RequestMapping("/queryDofStoreCols")
    public @ResponseBody List<DofStoreCols> querySysMenusListB(@RequestBody String inputJson) throws Exception{
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String stoId = (String) inputData.get("stoId");
		DofStoreColsExample dofStoreColsExample = new DofStoreColsExample();
		com.hlic.base.pojo.po.DofStoreColsExample.Criteria criteria = dofStoreColsExample.createCriteria();
		criteria.andStoIdEqualTo(stoId);
		List<DofStoreCols> list = dofStoreColsMapper.selectByExample(dofStoreColsExample);
        return list;
    }
}
