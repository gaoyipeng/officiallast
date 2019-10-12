package com.ccid.official.dao.entity.po;

import java.util.Date;

public class GwMeetingActivity {
    /**   ID **/
    private Integer id;

    /**   ACTIVITY_NAME **/
    private String activityName;

    /**   ORGANIZERS **/
    private String organizers;

    /**   ACTIVITY_TIME **/
    private Date activityTime;

    /**   REGISTRATION_TIME **/
    private Date registrationTime;

    /**   ACTIVITY_PLACE **/
    private String activityPlace;

    /**   MEETING_PEOPLES **/
    private String meetingPeoples;

    /**   ACCOMPANY_PEOPLES **/
    private String accompanyPeoples;

    /**   REMARKS **/
    private String remarks;

    /**     ID   **/
    public Integer getId() {
        return id;
    }

    /**     ID   **/
    public void setId(Integer id) {
        this.id = id;
    }

    /**     ACTIVITY_NAME   **/
    public String getActivityName() {
        return activityName;
    }

    /**     ACTIVITY_NAME   **/
    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    /**     ORGANIZERS   **/
    public String getOrganizers() {
        return organizers;
    }

    /**     ORGANIZERS   **/
    public void setOrganizers(String organizers) {
        this.organizers = organizers == null ? null : organizers.trim();
    }

    /**     ACTIVITY_TIME   **/
    public Date getActivityTime() {
        return activityTime;
    }

    /**     ACTIVITY_TIME   **/
    public void setActivityTime(Date activityTime) {
        this.activityTime = activityTime;
    }

    /**     REGISTRATION_TIME   **/
    public Date getRegistrationTime() {
        return registrationTime;
    }

    /**     REGISTRATION_TIME   **/
    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    /**     ACTIVITY_PLACE   **/
    public String getActivityPlace() {
        return activityPlace;
    }

    /**     ACTIVITY_PLACE   **/
    public void setActivityPlace(String activityPlace) {
        this.activityPlace = activityPlace == null ? null : activityPlace.trim();
    }

    /**     MEETING_PEOPLES   **/
    public String getMeetingPeoples() {
        return meetingPeoples;
    }

    /**     MEETING_PEOPLES   **/
    public void setMeetingPeoples(String meetingPeoples) {
        this.meetingPeoples = meetingPeoples == null ? null : meetingPeoples.trim();
    }

    /**     ACCOMPANY_PEOPLES   **/
    public String getAccompanyPeoples() {
        return accompanyPeoples;
    }

    /**     ACCOMPANY_PEOPLES   **/
    public void setAccompanyPeoples(String accompanyPeoples) {
        this.accompanyPeoples = accompanyPeoples == null ? null : accompanyPeoples.trim();
    }

    /**     REMARKS   **/
    public String getRemarks() {
        return remarks;
    }

    /**     REMARKS   **/
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}