package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathFDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.xpath("//input[@id='u_0_m']"));
		
		from.sendKeys("Fira");
		
		String date = "12-Dec-2020";
		String[] str = date.split("-");
		
		String day1 = str[0]; 
		String month = str[1]; 
		String year = str[2]; 
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select obj = new Select(day);
		
		obj.selectByVisibleText(day1);
	}

}
