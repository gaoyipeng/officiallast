package com.ccid.official.dao.mapper;

import com.ccid.official.dao.entity.po.GwMeetingActivity;

public interface GwMeetingActivityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GwMeetingActivity record);

    int insertSelective(GwMeetingActivity record);

    GwMeetingActivity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GwMeetingActivity record);

    int updateByPrimaryKey(GwMeetingActivity record);
}