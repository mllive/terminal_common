package com.terminal.common.task.entity.base;

import java.util.List;

import com.terminal.common.task.entity.SubscribeEntity;
import com.terminal.common.task.entity.TaskItemEntity;

public abstract class TaskPlatformBase extends TaskBase {

	protected String platform;

	public TaskPlatformBase(String id, String province, String city, String county, String dateTime,
			List<TaskItemEntity> taskItemList) {
		super(id, province, city, county, dateTime, taskItemList);
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * 根据省市县平台匹配终端
	 * 
	 * @param province
	 * @param city
	 * @param county
	 * @param terminalId
	 * @return
	 */
	public abstract SubscribeEntity getPlatformSubscribePattern(String province, String city, String county,
			String platform);
}
