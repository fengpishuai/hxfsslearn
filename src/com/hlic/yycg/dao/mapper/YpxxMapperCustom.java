package com.hlic.yycg.dao.mapper;

import com.hlic.yycg.pojo.po.YpxxCustom;
import com.hlic.yycg.pojo.vo.YPxxQueryVo;

import java.util.List;


public interface YpxxMapperCustom {
    public List<YpxxCustom> findYpxxList(YPxxQueryVo ypxxQueryVo) throws Exception;
}