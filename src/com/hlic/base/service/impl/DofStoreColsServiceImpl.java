package com.hlic.base.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.hlic.base.dao.mapper.DofStoreColsMapper;
import com.hlic.base.pojo.po.DofStoreCols;
import com.hlic.base.pojo.po.DofStoreColsExample;
import com.hlic.base.pojo.po.DofStoreColsExample.Criteria;
import com.hlic.base.service.DofStoreColsService;
import com.hlic.utils.paginator.domain.PageList;

public class DofStoreColsServiceImpl extends BaseServiceImpl  implements DofStoreColsService {
	
	private static Pattern humpPattern = Pattern.compile("[A-Z]"); 
	private static Pattern linePattern = Pattern.compile("_(\\w)");  
	
	@Autowired
	private DofStoreColsMapper dofStoreColsMapper;

	@Override
	public PageList<DofStoreCols> getAll(int pageIndex, int pageSize,
			Object sqlParameter) throws Exception {
		return (PageList<DofStoreCols>) getPageList(DofStoreColsMapper.class, "queryDofStoreColsList",sqlParameter, pageIndex, pageSize);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int upDataDofStoreColsGrid(String jsonObject) throws Exception {
		int F_CODE = 0;
		List<DofStoreCols> list = new ArrayList<DofStoreCols>();
		JSONObject saveData = JSONObject.fromObject(jsonObject);
		if(saveData.get("editSave") != null){
			JSONArray preEditSave = (JSONArray) saveData.get("editSave");
			JSONArray editSave = keyNameToHump(preEditSave);
			//更新行
			list = (List<DofStoreCols>) JSONArray.toCollection(editSave,DofStoreCols.class);
			if(list.size() > 0){
				for(DofStoreCols dofStoreCols : list){
					DofStoreColsExample dofStoreColsExample = new DofStoreColsExample();
					Criteria criteria = dofStoreColsExample.createCriteria();
					criteria.andColPkEqualTo(dofStoreCols.getColPk());
					F_CODE = dofStoreColsMapper.updateByExampleSelective(dofStoreCols, dofStoreColsExample);
				}
			}
		}
		if(saveData.get("newSave") != null){
			JSONArray preNewSave = (JSONArray) saveData.get("newSave");
			JSONArray newSave = keyNameToHump(preNewSave);
			list = (List<DofStoreCols>) JSONArray.toCollection(newSave,DofStoreCols.class);
			//新增行
			if(list.size() > 0){
				for(DofStoreCols dofStoreCols : list){
					F_CODE = dofStoreColsMapper.insertSelective(dofStoreCols);
				}
			}
		}
		if(saveData.get("delSave") != null){
			JSONArray preDelSave = (JSONArray) saveData.get("delSave");
			JSONArray delSave = keyNameToHump(preDelSave);
			//删除行
			list = (List<DofStoreCols>) JSONArray.toCollection(delSave,DofStoreCols.class);
			if(list.size() > 0){
				Iterator item = list.iterator();
				while(item.hasNext()){
					//F_CODE = dofStoreColsMapper.deleteByPrimaryKey(item.next().toString());
				}
			}
		}
		return F_CODE;
	}
	/**下划线转驼峰*/  
    public static String lineToHump(String str){  
        str = str.toLowerCase();  
        Matcher matcher = linePattern.matcher(str);  
        StringBuffer sb = new StringBuffer();  
        while(matcher.find()){  
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());  
        }  
        matcher.appendTail(sb);  
        return sb.toString();  
    } 
	 /**驼峰转下划线,效率比上面高*/  
    public static String humpToLine2(String str){  
        Matcher matcher = humpPattern.matcher(str);  
        StringBuffer sb = new StringBuffer();  
        while(matcher.find()){  
            matcher.appendReplacement(sb, "_"+matcher.group(0).toLowerCase());  
        }  
        matcher.appendTail(sb);  
        return sb.toString();  
    }  
    /**
     * @Title: keyNameToHump 
     * @Description: 把带下划线的key转换成驼峰 
     * @param @param preData
     * @param @return    设定文件 
     * @return JSONArray    返回类型 
     * @throws 
     */
    private static JSONArray keyNameToHump(JSONArray preData){
    	JSONArray formatSave = new JSONArray();
    	@SuppressWarnings("unchecked")
		Iterator<Object> it = preData.iterator();
		while (it.hasNext()) {
			JSONObject obj = (JSONObject) it.next();
			JSONObject inObj = new JSONObject();
			@SuppressWarnings("unchecked")
			Map<String, Object> map = obj;
			for (Entry<String, Object> entry : map.entrySet()) {
				String keyName = entry.getKey();
				keyName = lineToHump(keyName);
				inObj.put(keyName, entry.getValue());
			}
			formatSave.add(inObj);
		}
		return formatSave;
    }
}
