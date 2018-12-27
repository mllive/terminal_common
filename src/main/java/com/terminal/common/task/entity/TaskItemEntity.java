package com.terminal.common.task.entity;

import com.terminal.common.task.utils.TaskType;

public class TaskItemEntity {
	TaskType type;
	String srcPath;
	String destPath;
	String cmdStr;

	public TaskItemEntity(TaskType type, String srcPath, String destPath, String cmdStr) {
		super();
		this.type = type;
		this.srcPath = srcPath;
		this.destPath = destPath;
		this.cmdStr = cmdStr;
	}

	public TaskType getType() {
		return type;
	}

	public void setType(TaskType type) {
		this.type = type;
	}

	public String getSrcPath() {
		return srcPath;
	}

	public void setSrcPath(String srcPath) {
		this.srcPath = srcPath;
	}

	public String getDestPath() {
		return destPath;
	}

	public void setDestPath(String destPath) {
		this.destPath = destPath;
	}

	public String getCmdStr() {
		return cmdStr;
	}

	public void setCmdStr(String cmdStr) {
		this.cmdStr = cmdStr;
	}

}
