package com.tydic.bean;

import java.math.BigDecimal;
import java.util.Date;

public class InfoUser {
    private String userId;

    private String teleType;

    private String deviceNumber;

    private String userPwd;

    private String userStatus;

    private Date createDate;

    private Date activeDate;

    private String userType;

    private String prepayFlag;

    private String localNet;

    private String developChannelId;

    private String protoFlag;

    private String subUserStatus;

    private Date stopDate;

    private String validFlag;

    private String productId;

    private String operatorsType;

    private String mainOfrId;

    private String brandCode;

    private String flag4g;

    private String developNumber;

    private String thirdChannelCode;

    private BigDecimal userMonLimit;

    private String monLimitFlag;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTeleType() {
        return teleType;
    }

    public void setTeleType(String teleType) {
        this.teleType = teleType == null ? null : teleType.trim();
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber == null ? null : deviceNumber.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getPrepayFlag() {
        return prepayFlag;
    }

    public void setPrepayFlag(String prepayFlag) {
        this.prepayFlag = prepayFlag == null ? null : prepayFlag.trim();
    }

    public String getLocalNet() {
        return localNet;
    }

    public void setLocalNet(String localNet) {
        this.localNet = localNet == null ? null : localNet.trim();
    }

    public String getDevelopChannelId() {
        return developChannelId;
    }

    public void setDevelopChannelId(String developChannelId) {
        this.developChannelId = developChannelId == null ? null : developChannelId.trim();
    }

    public String getProtoFlag() {
        return protoFlag;
    }

    public void setProtoFlag(String protoFlag) {
        this.protoFlag = protoFlag == null ? null : protoFlag.trim();
    }

    public String getSubUserStatus() {
        return subUserStatus;
    }

    public void setSubUserStatus(String subUserStatus) {
        this.subUserStatus = subUserStatus == null ? null : subUserStatus.trim();
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag == null ? null : validFlag.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getOperatorsType() {
        return operatorsType;
    }

    public void setOperatorsType(String operatorsType) {
        this.operatorsType = operatorsType == null ? null : operatorsType.trim();
    }

    public String getMainOfrId() {
        return mainOfrId;
    }

    public void setMainOfrId(String mainOfrId) {
        this.mainOfrId = mainOfrId == null ? null : mainOfrId.trim();
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode == null ? null : brandCode.trim();
    }

    public String getFlag4g() {
        return flag4g;
    }

    public void setFlag4g(String flag4g) {
        this.flag4g = flag4g == null ? null : flag4g.trim();
    }

    public String getDevelopNumber() {
        return developNumber;
    }

    public void setDevelopNumber(String developNumber) {
        this.developNumber = developNumber == null ? null : developNumber.trim();
    }

    public String getThirdChannelCode() {
        return thirdChannelCode;
    }

    public void setThirdChannelCode(String thirdChannelCode) {
        this.thirdChannelCode = thirdChannelCode == null ? null : thirdChannelCode.trim();
    }

    public BigDecimal getUserMonLimit() {
        return userMonLimit;
    }

    public void setUserMonLimit(BigDecimal userMonLimit) {
        this.userMonLimit = userMonLimit;
    }

    public String getMonLimitFlag() {
        return monLimitFlag;
    }

    public void setMonLimitFlag(String monLimitFlag) {
        this.monLimitFlag = monLimitFlag == null ? null : monLimitFlag.trim();
    }
}