package com.cmig.magtask.dao;

import com.cmig.magtask.entity.JobAndTrigger;
import com.cmig.magtask.entity.TbBatchOrder;

import java.util.List;

public interface TbBatchOrderMapper {
	public TbBatchOrder getFirstUnDealBatch();
}
