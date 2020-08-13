package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[]args) {
	WebDriverManager.firefoxdriver().setup();
	//WebDriverManager.iedriver().setup();
WebDriver driver= new FirefoxDriver();
driver.get("https://www.redbus.in/");
driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
//driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[6]/td[2]")).click();
driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[1]/td[3]/button")).click();
driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[5]/td[1]")).click();
}

	
	
	
	}

