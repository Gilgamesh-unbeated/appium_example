package com.liu.utils;

import java.io.File;

/**
 * 常量
 * @author Administrator
 *
 */
public class Constants
{
	public static final String SYS_DIR=System.getProperty("user.dir");
	public static final String SC=File.separator;
	public static final String LOG4J="log4j.properties";


	// ------程序常用配置-----
	public static final String CONFIG_DIR = "config";
	public static final String CONFIG_PROPERTIES_FILE = "config.properties";
	
	public static final long THOUSAND = 1000L;
	
	//启动参数
	public static final String PLATFORM_NAME="platformName";
	public static final String ANDROID="Android";
	public static final String DEVICE_NAME="deviceName";
	public static final String DEVICE="dff48a9d";
	public static final String PLATFORM_VERSION="platformVersion";
	public static final String VERSION9="9";
	public static final String APP="app";
 	public static final String APP_FILE=SYS_DIR+SC+"app"+SC+"起点读书.apk";
	public static final String UNICODEKEYBOARD="unicodekeyboard";
	public static final String RESETKEYBOARD="resetKeyboard";
	public static final String SESSION_OVERRIDE="sessionOverride";
	public static final String APP_PACKAGE="appPackage";
	public static final String APP_ACTIVITY="appActivity";
	public static final String APP_WAITACTIVITY="appWaitActivity";
	public static final String ANDROID_URL="http://127.0.0.1:4723/wd/hub";
	
	public static final String TRUE="true";
	public static final String FALSE="false";

}
