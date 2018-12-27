package com.terminal.common.task.entity;

import java.util.List;

import com.terminal.common.task.entity.base.TaskTerminalBase;
import com.terminal.common.task.utils.SubscribeType;
import com.terminal.common.utils.StringUtil;

public class TaskTerminalEntity extends TaskTerminalBase {

	public TaskTerminalEntity(String id, String province, String city, String county, String dateTime,
			List<TaskItemEntity> taskItemList) {
		super(id, province, city, county, dateTime, taskItemList);
	}

	public TaskTerminalEntity(String id, String province, String city, String county, String dateTime,
			List<TaskItemEntity> taskItemList, String terminalId) {
		super(id, province, city, county, dateTime, taskItemList);
		this.id = id;
		this.province = province;
		this.city = city;
		this.county = county;
		this.dateTime = dateTime;
		this.taskItemList = taskItemList;
		this.terminalId = terminalId;
	}

	@Override
	public SubscribeEntity getTerminalSubscribePattern(String province, String city, String county, String terminalId) {
		return new SubscribeEntity(
				getStringPattern(province, 1) + getStringPattern(city, 2) + getStringPattern(county, 2)
						+ getStringPattern(terminalId, 3),
				true == StringUtil.isEmptyOne(province, city, county, terminalId) ? SubscribeType.PSubscribe
						: SubscribeType.Subscribe);
	}
}
