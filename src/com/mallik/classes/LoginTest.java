package com.mallik.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void beforeTest(){
		System.setProperty("WebDriver.chrome.driver","browser-utils\\chromedriver.exe");

		//maximize the window
		driver.manage().window().maximize();
		//open the application
		driver.get("http://google.com");
		
	}
	
	@AfterTest
	public void afterTest(){
		//logout from application
		
		driver.close();
		//close all instance browsers
		driver.quit();
	}
	
	@Test
	public void mainTest(){
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String caption = driver.findElement(By.id("hplogo")).getText();
		System.out.println("Caption of Applicat is "+ caption);
	}

}
