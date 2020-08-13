package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbuskeyboard {

	public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver= new FirefoxDriver();
			driver.get("https://www.redbus.in/");
			driver.findElement(By.xpath("//label[contains(text(),'FROM')]")).sendKeys("Chennai");
			
	}

}
