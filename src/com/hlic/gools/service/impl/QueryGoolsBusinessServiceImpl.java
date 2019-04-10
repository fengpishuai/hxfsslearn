package com.hlic.gools.service.impl;

import java.util.List;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.hlic.gools.dao.GoolsPoolsMapper;
import com.hlic.gools.pojo.po.GoolsPools;
import com.hlic.gools.pojo.po.GoolsPoolsExample;
import com.hlic.gools.service.QueryGoolsBusinessService;

public class QueryGoolsBusinessServiceImpl implements QueryGoolsBusinessService {

	@Autowired
	private GoolsPoolsMapper goolsPoolsMapper;

	@Override
	public List<GoolsPools> queryGoolsPools(String inputJson) {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String fSpbh = (String) inputData.get("fSpbh");
		GoolsPoolsExample goolsPoolsExample = new GoolsPoolsExample();
		com.hlic.gools.pojo.po.GoolsPoolsExample.Criteria criteria = goolsPoolsExample.createCriteria();
		criteria.andFSpbhLike(fSpbh);
		List<GoolsPools> goolsPools = goolsPoolsMapper.selectByExample(goolsPoolsExample);
		return goolsPools;
	}
}
