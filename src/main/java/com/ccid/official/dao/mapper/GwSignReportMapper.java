package com.ccid.official.dao.mapper;

import com.ccid.official.dao.entity.po.GwSignReport;

public interface GwSignReportMapper {
    int insert(GwSignReport record);

    int insertSelective(GwSignReport record);
}