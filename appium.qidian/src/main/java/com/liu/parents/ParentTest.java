package com.liu.parents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.liu.utils.Constants;
import com.liu.utils.LogUtils;

import io.appium.java_client.TouchAction;
/**
 * 所有测试类的父类
 * @author Administrator
 *
 */
public abstract class ParentTest  
{
	protected static WebDriver driver;
	protected static TouchAction ta;
	

	protected void sleep(long n) {
		try {
			Thread.sleep(n*Constants.THOUSAND);
		} catch (InterruptedException e) {
			LogUtils.error(e.getMessage());
		}
	}
	
	protected void sleep() {
		sleep(1);
	} 
	
	/**
	 * 等待某个元素出现
	 * @param xpath
	 */
	protected void autoWait(String xpath) 
	{
		try
		{
			new WebDriverWait(driver,Constants.MAX_PAGE_LOAD_TIMEOUT).
			until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		}
		catch (Exception e) 
		{
			LogUtils.error(e.getMessage());
			sleep(Constants.EXCEPTION_WAIT_TIME);
		}
	}
	
	/**
	 * 等待元素消失不见，用于加载中消失不见
	 * @param xpath
	 */
	protected void autoWaitInVisiable(String xpath) 
	{
		try 
		{
			new WebDriverWait(driver,Constants.MAX_PAGE_LOAD_TIMEOUT).
			until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath(xpath))));
		}
		catch (Exception e) 
		{
			LogUtils.warn(e.getMessage());
			sleep(Constants.EXCEPTION_WAIT_TIME);
		}
		
	}
	
	protected WebElement find(String xpath) 
	{
		autoWait(xpath);
		return driver.findElement(By.xpath(xpath));
		
	}
	
	protected List<WebElement> finds(String xpath) 
	{
		return driver.findElements(By.xpath(xpath));
	}

} 
