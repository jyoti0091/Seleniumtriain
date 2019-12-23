package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement srcEle=  driver.findElement(By.id("src"));
		
		
		Actions act = new Actions(driver);
		Action act1= act.keyDown(Keys.SHIFT).moveToElement(srcEle).sendKeys("uhi").keyUp(Keys.SHIFT).build();
		
		act1.perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		act.contextClick().build().perform();
	}

}
