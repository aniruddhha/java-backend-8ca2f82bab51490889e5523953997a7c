package com.weektwo.casestudy.dto;

public class AmountTransferDto {
    private Long srcAc;
    private Long dstAc;
    private Double amt;

    public Long getSrcAc() {
        return srcAc;
    }

    public void setSrcAc(Long srcAc) {
        this.srcAc = srcAc;
    }

    public Long getDstAc() {
        return dstAc;
    }

    public void setDstAc(Long dstAc) {
        this.dstAc = dstAc;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }
}
