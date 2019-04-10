package com.hlic.gools.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlic.base.pojo.vo.GridVo;
import com.hlic.gools.pojo.po.GoolsPools;
import com.hlic.gools.service.QueryGoolsBusinessService;

@Controller
@RequestMapping("goolsBusiness")
public class QueryGoolsBusinessAction {

	@Autowired
	private QueryGoolsBusinessService queryGoolsBusinessService;
	
	@RequestMapping("/queryGoolsPools")
    public @ResponseBody List<GoolsPools> queryGoolsPools(@RequestBody String inputJson) throws Exception{
        return queryGoolsBusinessService.queryGoolsPools(inputJson);
    }
}
