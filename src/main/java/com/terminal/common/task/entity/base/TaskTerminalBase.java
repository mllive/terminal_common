package com.terminal.common.task.entity.base;

import java.util.List;

import com.terminal.common.task.entity.SubscribeEntity;
import com.terminal.common.task.entity.TaskItemEntity;

public abstract class TaskTerminalBase extends TaskBase {

	protected String terminalId;

	public TaskTerminalBase(String id, String province, String city, String county, String dateTime,
			List<TaskItemEntity> taskItemList) {
		super(id, province, city, county, dateTime, taskItemList);
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	/**
	 * 根据省市县终端ID匹配终端
	 * 
	 * @param p
	 * @param city
	 * @param county
	 * @param terminalId
	 * @return
	 */
	public abstract SubscribeEntity getTerminalSubscribePattern(String province, String city, String county,
			String terminalId);
}
