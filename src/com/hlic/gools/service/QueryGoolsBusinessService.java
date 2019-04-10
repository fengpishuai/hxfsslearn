package com.hlic.gools.service;

import java.util.List;

import com.hlic.gools.pojo.po.GoolsPools;

public interface QueryGoolsBusinessService {

	public List<GoolsPools> queryGoolsPools(String inputJson);
}
