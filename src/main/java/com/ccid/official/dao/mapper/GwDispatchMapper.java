package com.ccid.official.dao.mapper;

import com.ccid.official.dao.entity.po.GwDispatch;

public interface GwDispatchMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GwDispatch record);

    int insertSelective(GwDispatch record);

    GwDispatch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GwDispatch record);

    int updateByPrimaryKey(GwDispatch record);
}