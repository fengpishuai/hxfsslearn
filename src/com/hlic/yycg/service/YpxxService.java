package com.hlic.yycg.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.hlic.yycg.pojo.po.HxQuertionMx;
import com.hlic.yycg.pojo.po.HxQuestion;
import com.hlic.yycg.pojo.po.YpxxCustom;
import com.hlic.yycg.pojo.vo.YPxxQueryVo;

public interface YpxxService {

    List<YpxxCustom> findYpxxList(YPxxQueryVo ypxxQueryVo) throws Exception;
    /**
     * @Title: insertQuestion 
     * @Description: 插入提问问题
     * @param @param inputJson
     * @param @return
     * @param @throws Exception    设定文件 
     * @return int    返回类型 
     * @throws 
     */
    int insertQuestion(String inputJson, String userId) throws Exception;
    /**
     * @Title: insertQuestionMx 
     * @Description: 插入回答的问题
     * @param @param inputJson
     * @param @param userId
     * @param @return
     * @param @throws Exception    设定文件 
     * @return int    返回类型 
     * @throws 
     *
     */
    int insertQuestionMx(String inputJson, String userId) throws Exception;
    
    /**
     * @Title: queryHxQuestionList 
     * @Description: 查询提问问题
     * @param @param inputJson
     * @param @return    设定文件 
     * @return List<HxQuestion>    返回类型 
     * @throws 
     */
    List<HxQuestion> queryHxQuestionList(String inputJson);
    /**
     * @Title: queryHxQuestionMxList 
     * @Description: 查询回答内容
     * @param @param inputJson
     * @param @return    设定文件 
     * @return List<HxQuertionMx>    返回类型 
     * @throws 
     */
    List<HxQuertionMx> queryHxQuestionMxList(String inputJson);
    /**
     * @Title: queryHxQuertionMxPkey 
     * @Description: 根据pkey查询回答问题
     * @param @return    设定文件 
     * @return HxQuertionMx    返回类型 
     * @throws 
     *
     */
    List<HxQuertionMx> queryHxQuertionMxPkey(String inputJson);
    /**
     * @Title: updateHxQuestionMx 
     * @Description: 更新回答内容 
     * @param @param inputJson
     * @param @return    设定文件 
     * @return int    返回类型 
     * @throws 
     *
     */
    int updateHxQuestionMx(String inputJson, String userId);
    /**
     * @Title: queryHotHxQuestionList 
     * @Description: 查询热点问题 
     * @param @param inputJson
     * @param @return    设定文件 
     * @return PageInfo<Map<String,Object>>    返回类型 
     * @throws 
     *
     */
    PageInfo<Map<String,Object>> queryHotHxQuestionList(String inputJson);
}
