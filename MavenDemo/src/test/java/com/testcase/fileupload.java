package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.iedriver().setup();
	WebDriver driver= new FirefoxDriver();
		driver.get("https://filebin.net");
		driver.findElement(By.xpath("//input[@id='fileField']")).sendKeys("‪C:\\Users\\Vidya\\Desktop\\Agama\\homework.txt");
	}

}
