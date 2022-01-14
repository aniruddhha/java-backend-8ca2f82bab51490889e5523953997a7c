package com.ani.testing.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class App {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appId;
    private String appNm;
    private Date pubDt;
    private Boolean isFree;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getAppNm() {
        return appNm;
    }

    public void setAppNm(String appNm) {
        this.appNm = appNm;
    }

    public Date getPubDt() {
        return pubDt;
    }

    public void setPubDt(Date pubDt) {
        this.pubDt = pubDt;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }
}
