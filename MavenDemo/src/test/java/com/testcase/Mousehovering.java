package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehovering {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id = \'txtUsername\']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name=\'Submit\' and @id=\'btnLogin\']")).click();
		
	WebElement	 admin=driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
	admin.click();
	WebElement qualification=driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']"));
	qualification.click();
	WebElement language=driver.findElement(By.xpath("//a[@id='menu_admin_viewLanguages']"));
	language.click();	
			
	Actions action=new Actions(driver);
	action.moveToElement(admin).perform();
	Thread.sleep(1000);
	action.moveToElement(qualification).perform();
	action.moveToElement(language).click().build().perform();
			
			
					
	}

}
