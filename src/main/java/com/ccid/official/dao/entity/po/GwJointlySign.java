package com.ccid.official.dao.entity.po;

import java.util.Date;

public class GwJointlySign {
    /**   ID **/
    private Integer id;

    /**   JOINTLY_SIGN_ORDER_NUM **/
    private Integer jointlySignOrderNum;

    /**   JOINTLY_SIGN_DATE **/
    private Date jointlySignDate;

    /**   RECEIVE_ORIGIN **/
    private String receiveOrigin;

    /**   SECRET_LEVEL **/
    private Integer secretLevel;

    /**   TITLE **/
    private String title;

    /**   COPIES_NUMBER **/
    private Integer copiesNumber;

    /**   UNDERTAKE_OFFICE **/
    private String undertakeOffice;

    /**   INSTRUCTIONAL_STATUS **/
    private String instructionalStatus;

    /**     ID   **/
    public Integer getId() {
        return id;
    }

    /**     ID   **/
    public void setId(Integer id) {
        this.id = id;
    }

    /**     JOINTLY_SIGN_ORDER_NUM   **/
    public Integer getJointlySignOrderNum() {
        return jointlySignOrderNum;
    }

    /**     JOINTLY_SIGN_ORDER_NUM   **/
    public void setJointlySignOrderNum(Integer jointlySignOrderNum) {
        this.jointlySignOrderNum = jointlySignOrderNum;
    }

    /**     JOINTLY_SIGN_DATE   **/
    public Date getJointlySignDate() {
        return jointlySignDate;
    }

    /**     JOINTLY_SIGN_DATE   **/
    public void setJointlySignDate(Date jointlySignDate) {
        this.jointlySignDate = jointlySignDate;
    }

    /**     RECEIVE_ORIGIN   **/
    public String getReceiveOrigin() {
        return receiveOrigin;
    }

    /**     RECEIVE_ORIGIN   **/
    public void setReceiveOrigin(String receiveOrigin) {
        this.receiveOrigin = receiveOrigin == null ? null : receiveOrigin.trim();
    }

    /**     SECRET_LEVEL   **/
    public Integer getSecretLevel() {
        return secretLevel;
    }

    /**     SECRET_LEVEL   **/
    public void setSecretLevel(Integer secretLevel) {
        this.secretLevel = secretLevel;
    }

    /**     TITLE   **/
    public String getTitle() {
        return title;
    }

    /**     TITLE   **/
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**     COPIES_NUMBER   **/
    public Integer getCopiesNumber() {
        return copiesNumber;
    }

    /**     COPIES_NUMBER   **/
    public void setCopiesNumber(Integer copiesNumber) {
        this.copiesNumber = copiesNumber;
    }

    /**     UNDERTAKE_OFFICE   **/
    public String getUndertakeOffice() {
        return undertakeOffice;
    }

    /**     UNDERTAKE_OFFICE   **/
    public void setUndertakeOffice(String undertakeOffice) {
        this.undertakeOffice = undertakeOffice == null ? null : undertakeOffice.trim();
    }

    /**     INSTRUCTIONAL_STATUS   **/
    public String getInstructionalStatus() {
        return instructionalStatus;
    }

    /**     INSTRUCTIONAL_STATUS   **/
    public void setInstructionalStatus(String instructionalStatus) {
        this.instructionalStatus = instructionalStatus == null ? null : instructionalStatus.trim();
    }
}