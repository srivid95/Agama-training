package com.testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takesscreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.iedriver().setup();
	WebDriver driver= new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	TakesScreenshot ts =(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source,new File(("src/test/resources/Scrrenshot/sample.png")));


	}

}
