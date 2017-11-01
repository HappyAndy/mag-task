package com.cmig.magtask.entity;

import java.util.Date;

public class TbBatchCallbackHis {
    private Long id;

    private String memberId;

    private String batchNo;

    private String callbackAddr;

    private Integer callCount;

    private String status;

    private Date callTime;

    private String sendMsg;

    private String retMsg;

    private String remark;

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

    public String getCallbackAddr() {
        return callbackAddr;
    }

    public void setCallbackAddr(String callbackAddr) {
        this.callbackAddr = callbackAddr == null ? null : callbackAddr.trim();
    }

    public Integer getCallCount() {
        return callCount;
    }

    public void setCallCount(Integer callCount) {
        this.callCount = callCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCallTime() {
        return callTime;
    }

    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    public String getSendMsg() {
        return sendMsg;
    }

    public void setSendMsg(String sendMsg) {
        this.sendMsg = sendMsg == null ? null : sendMsg.trim();
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg == null ? null : retMsg.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "TbBatchCallbackHis{" +
                "id=" + id +
                ", memberId='" + memberId + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", callbackAddr='" + callbackAddr + '\'' +
                ", callCount=" + callCount +
                ", status='" + status + '\'' +
                ", callTime=" + callTime +
                ", sendMsg='" + sendMsg + '\'' +
                ", retMsg='" + retMsg + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}