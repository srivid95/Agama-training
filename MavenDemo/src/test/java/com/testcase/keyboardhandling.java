package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.iedriver().setup();
	WebDriver driver= new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Actions action= new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("admin123").perform();
		action.sendKeys(Keys.ENTER).perform();
	}

}
 