package com.ccid.official.dao.mapper;

import com.ccid.official.dao.entity.po.GwJointlySign;

public interface GwJointlySignMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GwJointlySign record);

    int insertSelective(GwJointlySign record);

    GwJointlySign selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GwJointlySign record);

    int updateByPrimaryKey(GwJointlySign record);
}