package com.terminal.common;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.alibaba.fastjson.JSONObject;
import com.terminal.common.task.entity.TaskItemEntity;
import com.terminal.common.task.entity.TaskTerminalEntity;
import com.terminal.common.task.utils.TaskType;
import com.terminal.common.utils.DateUtil;

public class Main {
	public static void main(String[] args) {

		List<TaskItemEntity> taskItemList = new ArrayList<TaskItemEntity>();
		TaskItemEntity taskItem = new TaskItemEntity(TaskType.Exec_Cmd, null, null, "java -version");
		taskItemList.add(taskItem);

		TaskTerminalEntity taskTerminal = new TaskTerminalEntity(UUID.randomUUID().toString(), "hebei", "chengde",
				"luanping", DateUtil.getCurrentDateTimeString(), taskItemList, "sms");

		System.out.println(JSONObject.toJSONString(taskTerminal));

	}
}
