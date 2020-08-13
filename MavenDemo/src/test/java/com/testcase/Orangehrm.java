package com.testcase;

//import java.sql.Driver;

import org.omg.CORBA.OMGVMCID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;

public class Orangehrm {
	
 WebDriver driver;
	public static void main(String[]args) {
		
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.iedriver().setup();
	WebDriver driver= new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id = \'txtUsername\']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name=\'Submit\' and @id=\'btnLogin\']")).click();
				//contains and text 
		driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).click();
				
				//starts-with
		driver.findElement(By.xpath("//input[starts-with(@name,'assign')]")).sendKeys("sree");
			}

	}

