package com.cmig.magtask.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class BpPaymentJob implements BaseJob {

    private static Logger _log = LoggerFactory.getLogger(BpPaymentJob.class);

    public BpPaymentJob() {

    }

    public void execute(JobExecutionContext context) throws JobExecutionException {
        _log.error("代付定时批量下单交易: " + new Date());
          
    }  
}  
