package com.cmig.magtask.service;


import com.cmig.magtask.entity.JobAndTrigger;
import com.cmig.magtask.entity.TbBatchOrder;
import com.github.pagehelper.PageInfo;

public interface ITbBatchOrderService {
	public TbBatchOrder getFirstUnDealBatch();
}
