package com.cmig.magtask.service.impl;

import com.cmig.magtask.dao.JobAndTriggerMapper;
import com.cmig.magtask.dao.TbBatchOrderMapper;
import com.cmig.magtask.entity.JobAndTrigger;
import com.cmig.magtask.entity.TbBatchOrder;
import com.cmig.magtask.service.IJobAndTriggerService;
import com.cmig.magtask.service.ITbBatchOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TbBatchOrderImpl implements ITbBatchOrderService {

	@Autowired
	private TbBatchOrderMapper tbBatchOrderMapper;
	
	public TbBatchOrder getFirstUnDealBatch() {
		return   tbBatchOrderMapper.getFirstUnDealBatch();
	}

}