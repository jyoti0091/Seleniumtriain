package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement srcEle=  driver.findElement(By.id("src"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String url = js.executeScript("return document.URL;").toString();
		js.executeScript("arguments[0].click();", srcEle);
		
		js.executeScript("window.scrollBy(0,600)");
		//js.executeScript("alert('dioj');");
		
		System.out.println(url);
		
	}

}
