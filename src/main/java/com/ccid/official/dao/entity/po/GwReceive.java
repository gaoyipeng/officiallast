package com.ccid.official.dao.entity.po;

import java.util.Date;

public class GwReceive {
    /**   ID **/
    private Integer id;

    /**   RECEIVE_YEAR **/
    private Date receiveYear;

    /**   SERIAL_NUMBER **/
    private Integer serialNumber;

    /**   RECEIVE_ORIGIN **/
    private String receiveOrigin;

    /**   RECEIVE_DATE **/
    private Date receiveDate;

    /**   RECEIVE_NUMBER **/
    private String receiveNumber;

    /**   SECRET_LEVEL **/
    private Integer secretLevel;

    /**   TITLE **/
    private String title;

    /**   COPIES_NUMBER **/
    private Integer copiesNumber;

    /**   ATTRIBUTE **/
    private String attribute;

    /**   DESCRIBE **/
    private String describe;

    /**   FEEDBACK_DATE **/
    private Date feedbackDate;

    /**   INSTRUCTOR **/
    private String instructor;

    /**   INSTRUCTION_DATE **/
    private Date instructionDate;

    /**   INSTRUCTION_CONTENT **/
    private String instructionContent;

    /**   OFFICE_ID **/
    private String officeId;

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

    /**     RECEIVE_YEAR   **/
    public Date getReceiveYear() {
        return receiveYear;
    }

    /**     RECEIVE_YEAR   **/
    public void setReceiveYear(Date receiveYear) {
        this.receiveYear = receiveYear;
    }

    /**     SERIAL_NUMBER   **/
    public Integer getSerialNumber() {
        return serialNumber;
    }

    /**     SERIAL_NUMBER   **/
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**     RECEIVE_ORIGIN   **/
    public String getReceiveOrigin() {
        return receiveOrigin;
    }

    /**     RECEIVE_ORIGIN   **/
    public void setReceiveOrigin(String receiveOrigin) {
        this.receiveOrigin = receiveOrigin == null ? null : receiveOrigin.trim();
    }

    /**     RECEIVE_DATE   **/
    public Date getReceiveDate() {
        return receiveDate;
    }

    /**     RECEIVE_DATE   **/
    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    /**     RECEIVE_NUMBER   **/
    public String getReceiveNumber() {
        return receiveNumber;
    }

    /**     RECEIVE_NUMBER   **/
    public void setReceiveNumber(String receiveNumber) {
        this.receiveNumber = receiveNumber == null ? null : receiveNumber.trim();
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

    /**     ATTRIBUTE   **/
    public String getAttribute() {
        return attribute;
    }

    /**     ATTRIBUTE   **/
    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    /**     DESCRIBE   **/
    public String getDescribe() {
        return describe;
    }

    /**     DESCRIBE   **/
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    /**     FEEDBACK_DATE   **/
    public Date getFeedbackDate() {
        return feedbackDate;
    }

    /**     FEEDBACK_DATE   **/
    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    /**     INSTRUCTOR   **/
    public String getInstructor() {
        return instructor;
    }

    /**     INSTRUCTOR   **/
    public void setInstructor(String instructor) {
        this.instructor = instructor == null ? null : instructor.trim();
    }

    /**     INSTRUCTION_DATE   **/
    public Date getInstructionDate() {
        return instructionDate;
    }

    /**     INSTRUCTION_DATE   **/
    public void setInstructionDate(Date instructionDate) {
        this.instructionDate = instructionDate;
    }

    /**     INSTRUCTION_CONTENT   **/
    public String getInstructionContent() {
        return instructionContent;
    }

    /**     INSTRUCTION_CONTENT   **/
    public void setInstructionContent(String instructionContent) {
        this.instructionContent = instructionContent == null ? null : instructionContent.trim();
    }

    /**     OFFICE_ID   **/
    public String getOfficeId() {
        return officeId;
    }

    /**     OFFICE_ID   **/
    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
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