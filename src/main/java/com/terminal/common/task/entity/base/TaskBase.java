package com.terminal.common.task.entity.base;

import java.util.List;

import com.terminal.common.task.entity.SubscribeEntity;
import com.terminal.common.task.entity.TaskItemEntity;
import com.terminal.common.task.utils.SubscribeType;
import com.terminal.common.utils.StringUtil;

public abstract class TaskBase {
	protected String id;
	protected String province;
	protected String city;
	protected String county;
	protected String dateTime;
	protected List<TaskItemEntity> taskItemList;

	public TaskBase(String id, String province, String city, String county, String dateTime,
			List<TaskItemEntity> taskItemList) {
		this.id = id;
		this.province = province;
		this.city = city;
		this.county = county;
		this.dateTime = dateTime;
		this.taskItemList = taskItemList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public List<TaskItemEntity> getTaskItemList() {
		return taskItemList;
	}

	public void setTaskItemList(List<TaskItemEntity> taskItemList) {
		this.taskItemList = taskItemList;
	}

	/**
	 * 根据省市县匹配终端
	 * 
	 * @param province
	 * @param city
	 * @param county
	 * @return
	 */
	protected SubscribeEntity getTerminalSubscribePattern(String province, String city, String county) {
		return new SubscribeEntity(
				getStringPattern(province, 1) + getStringPattern(city, 2) + getStringPattern(county, 3),
				true == StringUtil.isEmptyOne(province, city, county) ? SubscribeType.PSubscribe
						: SubscribeType.Subscribe);
	}

	protected String getStringPattern(String value, int type) {
		String pattern = "";
		if (1 == type) {
			if (StringUtil.isEmpty(value)) {
				pattern = "*.";
			} else {
				pattern = value + ".";
			}
		} else if (2 == type) {
			if (StringUtil.isEmpty(value)) {
				pattern = ".*.";
			} else {
				pattern = "." + value + ".";
			}
		} else if (3 == type) {
			if (StringUtil.isEmpty(value)) {
				pattern = "*.";
			} else {
				pattern = "." + value;
			}
		}
		return pattern;
	}
}
