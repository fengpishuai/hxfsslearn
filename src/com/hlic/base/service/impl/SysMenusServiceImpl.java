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

import com.hlic.base.dao.SysMenusMapper;
import com.hlic.base.pojo.po.Employee;
import com.hlic.base.pojo.po.EmployeeExample;
import com.hlic.base.pojo.po.SysMenus;
import com.hlic.base.pojo.po.SysMenusExample;
import com.hlic.base.pojo.po.SysRoles;
import com.hlic.base.pojo.po.EmployeeExample.Criteria;
import com.hlic.base.service.SysMenusService;
import com.hlic.utils.RedisUtil;
import com.hlic.utils.paginator.domain.PageList;

public class SysMenusServiceImpl extends BaseServiceImpl implements SysMenusService {
	private static Pattern linePattern = Pattern.compile("_(\\w)");
	// 注入 mapper
	@Autowired
	private SysMenusMapper sysMenusMapper;
	
	@Autowired
	private RedisUtil redisUtil;
	
	public List<SysMenus> querymenusList() throws Exception{
		SysMenus sysMenus = null;
		if(redisUtil.exists("1001")){
			/*sysMenus = (SysMenus) redisUtil.get("1001");
			System.out.println(sysMenus);*/
		}else{
			sysMenus = sysMenusMapper.selectByPrimaryKey("1001");
			//redisUtil.set("1001", sysMenus); 
		}
		return sysMenusMapper.querymenusList();
	}
	
	@SuppressWarnings("unchecked")
    public PageList<SysMenus> getAll(int pageIndex, int pageSize,Object sqlParameter) throws Exception {
        return (PageList<SysMenus>) getPageList(SysMenusMapper.class, "querymenusListA",sqlParameter, pageIndex, pageSize);
    }
	
	public List<SysMenus> findSysMenusList() {
		SysMenusExample sysMenusExample = new SysMenusExample();
        return  this.sysMenusMapper.selectByExample(sysMenusExample);
    }

	public int insertSysMenus(SysMenus sysMenus) {
		return  this.sysMenusMapper.insertSelective(sysMenus);
	}

	@SuppressWarnings("unchecked")
	public int upDataSysMenusGrid(String jsonObject) throws Exception{
		int F_CODE = 0;
		List<SysMenus> list = new ArrayList<SysMenus>();
		JSONObject saveData = JSONObject.fromObject(jsonObject);
		if(saveData.get("editSave") != null){
			JSONArray preEditSave = (JSONArray) saveData.get("editSave");
			JSONArray editSave = keyNameToHump(preEditSave);
			//更新行
			list = (List<SysMenus>) JSONArray.toCollection(editSave,SysMenus.class);
			if(list.size() > 0){
				for(SysMenus sysMenus : list){
					F_CODE = sysMenusMapper.updateByPrimaryKeySelective(sysMenus);
				}
			}
		}
		if(saveData.get("newSave") != null){
			JSONArray preNewSave = (JSONArray) saveData.get("newSave");
			JSONArray newSave = keyNameToHump(preNewSave);
			list = (List<SysMenus>) JSONArray.toCollection(newSave,SysMenus.class);
			//新增行
			if(list.size() > 0){
				for(SysMenus sysMenus : list){
					F_CODE = sysMenusMapper.insertSelective(sysMenus);
				}
			}
		}
		if(saveData.get("delSave") != null){
			JSONArray preDelSave = (JSONArray) saveData.get("delSave");
			JSONArray delSave = keyNameToHump(preDelSave);
			//删除行
			list = (List<SysMenus>) JSONArray.toCollection(delSave,SysMenus.class);
			if(list.size() > 0){
				Iterator item = list.iterator();
				while(item.hasNext()){
					F_CODE = sysMenusMapper.deleteByPrimaryKey(item.next().toString());
				}
			}
		}
		return F_CODE;
	}

	public int addSysMenusRecordBatch(List<SysMenus> sysMenus) {
		return 0;
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
}
