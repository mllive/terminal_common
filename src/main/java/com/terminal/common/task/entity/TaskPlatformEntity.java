package com.terminal.common.task.entity;

import java.util.List;

import com.terminal.common.task.entity.base.TaskPlatformBase;
import com.terminal.common.task.utils.SubscribeType;
import com.terminal.common.utils.StringUtil;

public class TaskPlatformEntity extends TaskPlatformBase {

	public TaskPlatformEntity(String id, String province, String city, String county, String dateTime,
			List<TaskItemEntity> taskItemList) {
		super(id, province, city, county, dateTime, taskItemList);
	}

	public TaskPlatformEntity(String id, String province, String city, String county, String dateTime,
			List<TaskItemEntity> taskItemList, String platform) {
		super(id, province, city, county, dateTime, taskItemList);
		this.id = id;
		this.province = province;
		this.city = city;
		this.county = county;
		this.dateTime = dateTime;
		this.taskItemList = taskItemList;
		this.platform = platform;
	}

	@Override
	public SubscribeEntity getPlatformSubscribePattern(String province, String city, String county, String platform) {
		return new SubscribeEntity(
				getStringPattern(province, 1) + getStringPattern(city, 2) + getStringPattern(county, 2)
						+ getStringPattern(platform, 3),
				true == StringUtil.isEmptyOne(province, city, county, platform) ? SubscribeType.PSubscribe
						: SubscribeType.Subscribe);
	}
}
