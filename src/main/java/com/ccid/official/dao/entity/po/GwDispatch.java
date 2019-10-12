package com.ccid.official.dao.entity.po;

import java.util.Date;

public class GwDispatch {
    /**   ID **/
    private Integer id;

    /**   DISPATCH_TYPE **/
    private String dispatchType;

    /**   ORDER_NUM **/
    private Integer orderNum;

    /**   DISPATCH_DATE **/
    private Date dispatchDate;

    /**   TITLE **/
    private String title;

    /**   DRAFT_OFFICE **/
    private Integer draftOffice;

    /**   SIGNER **/
    private String signer;

    /**   DRAFT_MAN **/
    private Integer draftMan;

    /**   SENT_TO_UNIT **/
    private String sentToUnit;

    /**   STATE **/
    private Integer state;

    /**   DOCUMENT_NUM **/
    private String documentNum;

    /**   SECRET_LEVEL **/
    private Integer secretLevel;

    /**   densification basis **/
    private String densificationBasis;

    /**   SEND_OFFICE **/
    private String sendOffice;

    /**   DISPATCH_PROPERTY **/
    private String dispatchProperty;

    /**   COPIES_NUMBER **/
    private Integer copiesNumber;

    /**     ID   **/
    public Integer getId() {
        return id;
    }

    /**     ID   **/
    public void setId(Integer id) {
        this.id = id;
    }

    /**     DISPATCH_TYPE   **/
    public String getDispatchType() {
        return dispatchType;
    }

    /**     DISPATCH_TYPE   **/
    public void setDispatchType(String dispatchType) {
        this.dispatchType = dispatchType == null ? null : dispatchType.trim();
    }

    /**     ORDER_NUM   **/
    public Integer getOrderNum() {
        return orderNum;
    }

    /**     ORDER_NUM   **/
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**     DISPATCH_DATE   **/
    public Date getDispatchDate() {
        return dispatchDate;
    }

    /**     DISPATCH_DATE   **/
    public void setDispatchDate(Date dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    /**     TITLE   **/
    public String getTitle() {
        return title;
    }

    /**     TITLE   **/
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**     DRAFT_OFFICE   **/
    public Integer getDraftOffice() {
        return draftOffice;
    }

    /**     DRAFT_OFFICE   **/
    public void setDraftOffice(Integer draftOffice) {
        this.draftOffice = draftOffice;
    }

    /**     SIGNER   **/
    public String getSigner() {
        return signer;
    }

    /**     SIGNER   **/
    public void setSigner(String signer) {
        this.signer = signer == null ? null : signer.trim();
    }

    /**     DRAFT_MAN   **/
    public Integer getDraftMan() {
        return draftMan;
    }

    /**     DRAFT_MAN   **/
    public void setDraftMan(Integer draftMan) {
        this.draftMan = draftMan;
    }

    /**     SENT_TO_UNIT   **/
    public String getSentToUnit() {
        return sentToUnit;
    }

    /**     SENT_TO_UNIT   **/
    public void setSentToUnit(String sentToUnit) {
        this.sentToUnit = sentToUnit == null ? null : sentToUnit.trim();
    }

    /**     STATE   **/
    public Integer getState() {
        return state;
    }

    /**     STATE   **/
    public void setState(Integer state) {
        this.state = state;
    }

    /**     DOCUMENT_NUM   **/
    public String getDocumentNum() {
        return documentNum;
    }

    /**     DOCUMENT_NUM   **/
    public void setDocumentNum(String documentNum) {
        this.documentNum = documentNum == null ? null : documentNum.trim();
    }

    /**     SECRET_LEVEL   **/
    public Integer getSecretLevel() {
        return secretLevel;
    }

    /**     SECRET_LEVEL   **/
    public void setSecretLevel(Integer secretLevel) {
        this.secretLevel = secretLevel;
    }

    /**     densification basis   **/
    public String getDensificationBasis() {
        return densificationBasis;
    }

    /**     densification basis   **/
    public void setDensificationBasis(String densificationBasis) {
        this.densificationBasis = densificationBasis == null ? null : densificationBasis.trim();
    }

    /**     SEND_OFFICE   **/
    public String getSendOffice() {
        return sendOffice;
    }

    /**     SEND_OFFICE   **/
    public void setSendOffice(String sendOffice) {
        this.sendOffice = sendOffice == null ? null : sendOffice.trim();
    }

    /**     DISPATCH_PROPERTY   **/
    public String getDispatchProperty() {
        return dispatchProperty;
    }

    /**     DISPATCH_PROPERTY   **/
    public void setDispatchProperty(String dispatchProperty) {
        this.dispatchProperty = dispatchProperty == null ? null : dispatchProperty.trim();
    }

    /**     COPIES_NUMBER   **/
    public Integer getCopiesNumber() {
        return copiesNumber;
    }

    /**     COPIES_NUMBER   **/
    public void setCopiesNumber(Integer copiesNumber) {
        this.copiesNumber = copiesNumber;
    }
}