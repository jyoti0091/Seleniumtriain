package com.driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement okAl1 = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK ')]"));
		okAl1.click();
		WebElement okAl2 = driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]"));
		okAl2.click();
		
		Alert obj = driver.switchTo().alert();
		obj.accept();
	}

}


    