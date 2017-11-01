package com.cmig.magtask.job;

import com.cmig.magtask.dao.JobAndTriggerMapper;
import com.cmig.magtask.dao.TbBatchOrderMapper;
import com.cmig.magtask.entity.TbBatchOrder;
import com.cmig.magtask.service.IJobAndTriggerService;
import com.cmig.magtask.service.ITbBatchOrderService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Component
public class BcPaymentJob implements BaseJob {


    private static Logger _log = LoggerFactory.getLogger(BcPaymentJob.class);


    @Autowired
    private ITbBatchOrderService iTbBatchOrderService;

    public void execute(JobExecutionContext context) throws JobExecutionException {
        _log.info("info");
        _log.debug("debug");
        _log.error("error");

        _log.error("代扣定时批量下单交易: " + new Date());
//        读取待发送批量大批次 first one
//                获取当前批次下所有交易订单
//                单笔逐发
//                修改单笔状态为已发送。

        TbBatchOrder batchOrder =  iTbBatchOrderService.getFirstUnDealBatch();
        _log.info("当前处理批量商户号：{},商户名：{} ，批次号：{} " ,batchOrder.getMemberId(),batchOrder.getMemberName(), batchOrder.getBatchNo());

    }

    public BcPaymentJob() {
    }
}  
