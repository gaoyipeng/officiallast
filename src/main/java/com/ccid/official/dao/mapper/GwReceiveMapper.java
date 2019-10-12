package com.ccid.official.dao.mapper;

import com.ccid.official.dao.entity.po.GwReceive;

public interface GwReceiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GwReceive record);

    int insertSelective(GwReceive record);

    GwReceive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GwReceive record);

    int updateByPrimaryKey(GwReceive record);
}