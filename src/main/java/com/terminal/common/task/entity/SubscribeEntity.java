package com.terminal.common.task.entity;

import com.terminal.common.task.utils.SubscribeType;

public class SubscribeEntity {
	String pattern;
	SubscribeType subscribeType;

	public SubscribeEntity(String pattern, SubscribeType subscribeType) {
		super();
		this.pattern = pattern;
		this.subscribeType = subscribeType;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public SubscribeType getSubscribeType() {
		return subscribeType;
	}

	public void setSubscribeType(SubscribeType subscribeType) {
		this.subscribeType = subscribeType;
	}

}
