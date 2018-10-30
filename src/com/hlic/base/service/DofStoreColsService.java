package com.hlic.base.service;

import java.util.List;

import com.hlic.base.pojo.po.BaseCommonGrid;
import com.hlic.base.pojo.po.DofStoreCols;
import com.hlic.utils.paginator.domain.PageList;

public interface DofStoreColsService {
	PageList<DofStoreCols> getAll(int pageIndex, int pageSize,Object sqlParameter) throws Exception;
	int upDataDofStoreColsGrid(String jsonObject) throws Exception;
}
