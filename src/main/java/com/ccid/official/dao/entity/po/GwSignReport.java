package com.ccid.official.dao.entity.po;

import java.util.Date;

public class GwSignReport {
    /**   ID **/
    private Integer id;

    /**   SIGN_REPORT_DATE **/
    private Date signReportDate;

    /**   SIGN_REPORT_NUM **/
    private String signReportNum;

    /**   SIGN_REPORT_TITLE **/
    private String signReportTitle;

    /**   SECRET_LEVEL **/
    private Integer secretLevel;

    /**   SIGNER **/
    private String signer;

    /**   DRAFT_OFFICE **/
    private String draftOffice;

    /**   DRAFT_MAN **/
    private String draftMan;

    /**   SEND_OFFICE **/
    private String sendOffice;

    /**   STATE **/
    private String state;

    /**     ID   **/
    public Integer getId() {
        return id;
    }

    /**     ID   **/
    public void setId(Integer id) {
        this.id = id;
    }

    /**     SIGN_REPORT_DATE   **/
    public Date getSignReportDate() {
        return signReportDate;
    }

    /**     SIGN_REPORT_DATE   **/
    public void setSignReportDate(Date signReportDate) {
        this.signReportDate = signReportDate;
    }

    /**     SIGN_REPORT_NUM   **/
    public String getSignReportNum() {
        return signReportNum;
    }

    /**     SIGN_REPORT_NUM   **/
    public void setSignReportNum(String signReportNum) {
        this.signReportNum = signReportNum == null ? null : signReportNum.trim();
    }

    /**     SIGN_REPORT_TITLE   **/
    public String getSignReportTitle() {
        return signReportTitle;
    }

    /**     SIGN_REPORT_TITLE   **/
    public void setSignReportTitle(String signReportTitle) {
        this.signReportTitle = signReportTitle == null ? null : signReportTitle.trim();
    }

    /**     SECRET_LEVEL   **/
    public Integer getSecretLevel() {
        return secretLevel;
    }

    /**     SECRET_LEVEL   **/
    public void setSecretLevel(Integer secretLevel) {
        this.secretLevel = secretLevel;
    }

    /**     SIGNER   **/
    public String getSigner() {
        return signer;
    }

    /**     SIGNER   **/
    public void setSigner(String signer) {
        this.signer = signer == null ? null : signer.trim();
    }

    /**     DRAFT_OFFICE   **/
    public String getDraftOffice() {
        return draftOffice;
    }

    /**     DRAFT_OFFICE   **/
    public void setDraftOffice(String draftOffice) {
        this.draftOffice = draftOffice == null ? null : draftOffice.trim();
    }

    /**     DRAFT_MAN   **/
    public String getDraftMan() {
        return draftMan;
    }

    /**     DRAFT_MAN   **/
    public void setDraftMan(String draftMan) {
        this.draftMan = draftMan == null ? null : draftMan.trim();
    }

    /**     SEND_OFFICE   **/
    public String getSendOffice() {
        return sendOffice;
    }

    /**     SEND_OFFICE   **/
    public void setSendOffice(String sendOffice) {
        this.sendOffice = sendOffice == null ? null : sendOffice.trim();
    }

    /**     STATE   **/
    public String getState() {
        return state;
    }

    /**     STATE   **/
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}