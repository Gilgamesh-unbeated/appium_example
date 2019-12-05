package com.liu.utils;

import java.io.File;

/**
 * 常量
 * @author Administrator
 *
 */
public class Constants {
	
	public static final String SYS_DIR=System.getProperty("user.dir");
	public static final String SC=File.separator;
	public static final String ANDROID_DIR="sdcard";
	public static final String AC="/";
	
	public static final String CONFIG_DIR="config";
	public static final String LOG4J="log4j.properties";
	public static final String CONFIG_PROPERTIES_FILE="config.properties";
	
	public static final String PLATFORM_NAME="platformName";
	public static final String ANDROID="Android";
	
	public static final String DEVICE_NAME="deviceName";
	public static final String DEVICE="dff48a9d";
	public static final String DEVICE_IPHONE="iPhone Simulator";
	
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
	
	//截图相关
	public static final String SCREENSHOT_DIR=SYS_DIR+SC+"screenshot";
	public static final String SCREENSHOT_FILE_NAME="s";
	public static final String SCREENSHOT_FILE_SUFFIC=".png";
	
	//资源文件
	public static final String PULLANDPOLL_FILE=SYS_DIR+SC+"resource"+SC+"test.txt";
	
	//下载文件
	public static final String DOWNLOAD_DIR=SYS_DIR+SC+"download";
	public static final String DOWNLOAD_FILE=DOWNLOAD_DIR+"test.txt";
	
	
	//编码文件
	public static final String UTF8="UTF-8";
	
	//安卓资源文件
	public static final String AD_PULLANDPOLL_FILE=ANDROID_DIR+AC+"test.txt";
	
	
	//常用字符串常量
	public static final String BLANK=" ";
	public static final String HORIZONTAL_LINE="-";
	
	//数字常量
	public static final int ONE=1;
	
	//数字
	public static final long THOUSAND=1000L;
	public static final long SECOND=THOUSAND;
	//小米8手机日期的间距
	public static final int XIAOMI8_DATE_UNIT_LENGTH=85;
	//单位：毫秒，数字太小会出现滑动过头现象
	public static final long OPERATE_WAIT_TIME=1000;
	//出现错误等待时间
	public static final long EXCEPTION_WAIT_TIME=1000;
	//部分操作需要短时间等待
	public static final long SHORT_WAIT_TIME=50L;
	
	//4种日志类型 logcat、bugreport、client、server
	public static final String SERVER="server";
	public static final String CLIENT="client";
	public static final String LOGCAT="logcat";
	public static final String BUGREPORT="bugreport";
	
	
	//登录信息
	public static final String USERNAME="admin";
	public static final String PASSWD="admin123456";
	
	
	//页面最大显示等待时间
	public static final long MAX_PAGE_LOAD_TIMEOUT = 3;
	//页面完全加载时间
	public static final long MAX_PAGE_LOAD = 5;
	//页面进入时的加载等待框
	public static final String LOADING="//*[@text='加载中']";
	//时间控件加载出来的确定、取消
	public static final String CONFIRM="//*[@text='确定']";
	
	//对应homepage的各种进入其他页面的方法
	public static final String JOIN_COPROCESS="joinCoProcess";
	public static final String JOIN_PERMONITOR  ="joinPerMonitor";
	public static final String JOIN_ENVMANAGE  ="joinEnvManage";
	public static final String JOIN_REALMONITOR  ="joinRealMonitor";
	public static final String JOIN_OPERREPORT ="joinOperReport";
	public static final String JOIN_COPROCESSLINKPAR ="joinCoProcessLinkPar";
	public static final String JOIN_PERMONITORLINKPAR  ="joinPerMonitorLinkPar";
	public static final String JOIN_ENVMANAGELINKPAR  ="joinEnvManageLinkPar";
	public static final String JOIN_REALMONITORLINKPAR="joinRealMonitorLinkPar";
	
	//截图文件名称
	public static final String HOME="首页";
	public static final String COPROCESS="协同处理";
	public static final String PERMONITOR="绩效监控";
	public static final String ENVMANAGE="环保管理";
	public static final String REALMONITOR="实时监控";
	public static final String OPERREPORT="运营报表";

	public static final String BACK_LINK="//*[@text='arrow back']";
	//感叹号
	public static final String EXCLAMATORY_MARK="！";
	
	
	
	
	
}
