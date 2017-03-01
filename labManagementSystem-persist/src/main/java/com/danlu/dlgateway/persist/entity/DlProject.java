package com.danlu.dlgateway.persist.entity;

import java.util.Date;

public class DlProject {
    private String id;

    private String projectName;

    private String domain;

    private String status;

    private String whiteipStatus;

    private String denyipStatus;

    private String uriStatus;

    private String desc;

    private String createPerson;

    private Date gmtCreate;

    private Date gmtUpdate;

    private String updatePerson;

    private Integer logicDeleteFlag;

    public String getId() {
        return id;
    }

    public String getWhiteipStatus() {
        return whiteipStatus;
    }

    public void setWhiteipStatus(String whiteipStatus) {
        this.whiteipStatus = whiteipStatus;
    }

    public String getDenyipStatus() {
        return denyipStatus;
    }

    public void setDenyipStatus(String denyipStatus) {
        this.denyipStatus = denyipStatus;
    }

    public String getUriStatus() {
        return uriStatus;
    }

    public void setUriStatus(String uriStatus) {
        this.uriStatus = uriStatus;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson == null ? null : updatePerson.trim();
    }

    public Integer getLogicDeleteFlag() {
        return logicDeleteFlag;
    }

    public void setLogicDeleteFlag(Integer logicDeleteFlag) {
        this.logicDeleteFlag = logicDeleteFlag;
    }

}