package com.hlic.yycg.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hlic.base.dao.BaseCommonGridMapper;
import com.hlic.utils.RandomUtils;
import com.hlic.yycg.dao.mapper.HxQuertionMxMapper;
import com.hlic.yycg.dao.mapper.HxQuestionMapper;
import com.hlic.yycg.dao.mapper.YpxxMapperCustom;
import com.hlic.yycg.pojo.po.HxQuertionMx;
import com.hlic.yycg.pojo.po.HxQuertionMxExample;
import com.hlic.yycg.pojo.po.HxQuestion;
import com.hlic.yycg.pojo.po.HxQuestionExample;
import com.hlic.yycg.pojo.po.HxQuestionExample.Criteria;
import com.hlic.yycg.pojo.po.YpxxCustom;
import com.hlic.yycg.pojo.vo.YPxxQueryVo;
import com.hlic.yycg.service.YpxxService;

public class YpxxServiceImpl implements YpxxService {

    @Autowired
    private YpxxMapperCustom ypxxMapperCustom;
    
    @Autowired
    private HxQuestionMapper hxQuestionMapper;
    
    @Autowired
    private HxQuertionMxMapper hxQuestionMxMapper;
    
	@Autowired
	private BaseCommonGridMapper baseCommonGridMapper;
	
    public List<YpxxCustom> findYpxxList(YPxxQueryVo ypxxQueryVo) throws Exception {
        return ypxxMapperCustom.findYpxxList(ypxxQueryVo);
    }


	@Override
	public int insertQuestion(String inputJson, String userId) throws Exception {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String title = (String) inputData.get("title");
		String content = (String) inputData.get("content");
		String project = (String) inputData.get("project");
		SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String createtime = sdt.format(new Date());
		HxQuestion hxQuestion = new HxQuestion();
		String pkey = RandomUtils.generateID("QT");
		hxQuestion.setfPkey(pkey);
		hxQuestion.setfZdr(userId);
		hxQuestion.setfZdsj(createtime);
		hxQuestion.setfWttitle(title);
		hxQuestion.setfDisable("0");
		hxQuestion.setfProject(project);
		HxQuertionMx hxQuertionMx = new HxQuertionMx();
		hxQuertionMx.setfPkey(RandomUtils.generateID("QTMX"));
		hxQuertionMx.setfSsdjbh(pkey);
		hxQuertionMx.setfHdr(userId);
		hxQuertionMx.setfHdsj(createtime);
		hxQuertionMx.setfHdnr(content.getBytes());
		hxQuertionMx.setfDisable("0");
		hxQuestionMxMapper.insertSelective(hxQuertionMx);
		return hxQuestionMapper.insertSelective(hxQuestion);
	}

	@Override
	public List<HxQuestion> queryHxQuestionList(String inputJson) {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String title = (String) inputData.get("title");
		String project = (String) inputData.get("project");
		HxQuestionExample questionExample = new HxQuestionExample();
		Criteria criteria = questionExample.createCriteria();
		criteria.andFWttitleLike("%"+title+"%");
		if(!"".equals(project)){
			criteria.andFProjectEqualTo(project);
		}
		return hxQuestionMapper.selectByExample(questionExample);
	}


	@Override
	public List<HxQuertionMx> queryHxQuestionMxList(String inputJson) {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String ssdjbh = (String) inputData.get("ssdjbh");
		int fClick = (Integer) inputData.get("fClick");
		HxQuertionMxExample hxQuertionMxExample = new HxQuertionMxExample();
		com.hlic.yycg.pojo.po.HxQuertionMxExample.Criteria criteria = hxQuertionMxExample.createCriteria();
		criteria.andFSsdjbhEqualTo(ssdjbh);
		
		HxQuestionExample hxQuestionExample = new HxQuestionExample();
		Criteria criteria1 = hxQuestionExample.createCriteria();
		criteria1.andFPkeyEqualTo(ssdjbh);
		HxQuestion hxQuestion = new HxQuestion();
		hxQuestion.setfClick(fClick);
		hxQuestionMapper.updateByExampleSelective(hxQuestion, hxQuestionExample);
		return hxQuestionMxMapper.selectByExampleWithBLOBs(hxQuertionMxExample);
	}


	@Override
	public int insertQuestionMx(String inputJson, String userId)
			throws Exception {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String pkey = (String) inputData.get("pkey");
		String content = (String) inputData.get("content");
		SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String createtime = sdt.format(new Date());
		
		HxQuertionMx hxQuertionMx = new HxQuertionMx();
		hxQuertionMx.setfPkey(RandomUtils.generateID("QTMX"));
		hxQuertionMx.setfSsdjbh(pkey);
		hxQuertionMx.setfHdr(userId);
		hxQuertionMx.setfHdsj(createtime);
		hxQuertionMx.setfHdnr(content.getBytes());
		hxQuertionMx.setfDisable("0");
		return hxQuestionMxMapper.insertSelective(hxQuertionMx);
	}


	@Override
	public List<HxQuertionMx> queryHxQuertionMxPkey(String inputJson) {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String pkey = (String) inputData.get("pkey");
		HxQuertionMxExample hxQuertionMxExample = new HxQuertionMxExample();
		com.hlic.yycg.pojo.po.HxQuertionMxExample.Criteria criteria = hxQuertionMxExample.createCriteria();
		criteria.andFPkeyEqualTo(pkey);
		return hxQuestionMxMapper.selectByExampleWithBLOBs(hxQuertionMxExample);
	}


	@Override
	public int updateHxQuestionMx(String inputJson, String userId) {
		JSONObject inputData = JSONObject.fromObject(inputJson);
		String pkey = (String) inputData.get("pkey");
		String content = (String) inputData.get("content");
		String ssdjbh = (String) inputData.get("ssdjbh");
		SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String createtime = sdt.format(new Date());
		HxQuertionMx hxQuertionMx = new HxQuertionMx();
		hxQuertionMx.setfPkey(pkey);
		hxQuertionMx.setfSsdjbh(ssdjbh);
		hxQuertionMx.setfHdr(userId);
		hxQuertionMx.setfHdsj(createtime);
		hxQuertionMx.setfHdnr(content.getBytes());
		hxQuertionMx.setfDisable("0");
		HxQuertionMxExample hxQuertionMxExample = new HxQuertionMxExample();
		com.hlic.yycg.pojo.po.HxQuertionMxExample.Criteria criteria = hxQuertionMxExample.createCriteria();
		criteria.andFPkeyEqualTo(pkey);
		return hxQuestionMxMapper.updateByExampleWithBLOBs(hxQuertionMx, hxQuertionMxExample);
	}

	@Override
	public PageInfo<Map<String,Object>> queryHotHxQuestionList(String inputJson) {
		List<Map<String, Object>> retData = new ArrayList<Map<String, Object>>();
		Map<String, Object> sqlMapper = new HashMap<String, Object>();
		sqlMapper.put("sql", "SELECT * FROM hx_question  ORDER BY f_click DESC");
		PageHelper.startPage(1, 20);
		retData = baseCommonGridMapper.executeSql(sqlMapper);
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(retData);
		
		return pageInfo;
	}

}
