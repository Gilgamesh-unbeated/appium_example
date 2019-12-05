package com.liu.test;

import org.testng.annotations.Test;

import com.liu.parents.ParentTest;

public class LoginTest extends  ParentTest
{
	/**
	 *  进入登录页面的前期工作，关闭警告之类的
	 */
	@Test
	public void before() 
	{
		find("//*[@text='我知道了']").click();
		autoWait("//*[@text='第1项权限(共2项)']");
		find("//*[@text='允许']").click();
		autoWait("//*[@text='第2项权限(共2项)']");
		find("//*[@text='允许']").click();
		
	}

	

}
