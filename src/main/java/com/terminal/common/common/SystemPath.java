package com.terminal.common.common;

import java.io.File;

public class SystemPath {

	// 分隔符
	static final String FILE_SEPARATOR = File.separator;

	// 用户主目录
	static final String USER_HOME = System.getProperties().getProperty("user.home");

	// Java实时运行环境的安装目录
	static final String JAVA_PATH = System.getProperties().getProperty("java.home");

	// 操作系统名称
	static final String OS_NAME = System.getProperties().getProperty("os.name");

	// 当前用户程序所在目录
	static final String USER_DIR = System.getProperties().getProperty("user.dir");

	// JDK的安装目录
	static final String JDK_DIR = System.getProperties().getProperty("java.ext.dirs");
}
