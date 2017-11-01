package com.cmig.magtask.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TbBatchPayment {
    private Long id;

    private String memberId;

    private String batchNo;

    private String batchInnerSeq;

    private String subBatchNo;

    private String paymentOrderNo;

    private Date tradeDate;

    private String tradeType;

    private BigDecimal amount;

    private BigDecimal fee;

    private String bankName;

    private String accNo;

    private String moble;

    private String accName;

    private String bizRemark;

    private String certType;

    private String cardType;

    private String cardAttr;

    private String mark;

    private String status;

    private Date gmtModify;

    private Date gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getBatchInnerSeq() {
        return batchInnerSeq;
    }

    public void setBatchInnerSeq(String batchInnerSeq) {
        this.batchInnerSeq = batchInnerSeq == null ? null : batchInnerSeq.trim();
    }

    public String getSubBatchNo() {
        return subBatchNo;
    }

    public void setSubBatchNo(String subBatchNo) {
        this.subBatchNo = subBatchNo == null ? null : subBatchNo.trim();
    }

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo == null ? null : paymentOrderNo.trim();
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo == null ? null : accNo.trim();
    }

    public String getMoble() {
        return moble;
    }

    public void setMoble(String moble) {
        this.moble = moble == null ? null : moble.trim();
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName == null ? null : accName.trim();
    }

    public String getBizRemark() {
        return bizRemark;
    }

    public void setBizRemark(String bizRemark) {
        this.bizRemark = bizRemark == null ? null : bizRemark.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getCardAttr() {
        return cardAttr;
    }

    public void setCardAttr(String cardAttr) {
        this.cardAttr = cardAttr == null ? null : cardAttr.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public String toString() {
        return "TbBatchPayment{" +
                "id=" + id +
                ", memberId='" + memberId + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", batchInnerSeq='" + batchInnerSeq + '\'' +
                ", subBatchNo='" + subBatchNo + '\'' +
                ", paymentOrderNo='" + paymentOrderNo + '\'' +
                ", tradeDate=" + tradeDate +
                ", tradeType='" + tradeType + '\'' +
                ", amount=" + amount +
                ", fee=" + fee +
                ", bankName='" + bankName + '\'' +
                ", accNo='" + accNo + '\'' +
                ", moble='" + moble + '\'' +
                ", accName='" + accName + '\'' +
                ", bizRemark='" + bizRemark + '\'' +
                ", certType='" + certType + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardAttr='" + cardAttr + '\'' +
                ", mark='" + mark + '\'' +
                ", status='" + status + '\'' +
                ", gmtModify=" + gmtModify +
                ", gmtCreate=" + gmtCreate +
                '}';
    }
}