package com.driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();

			Alert alert = driver.switchTo().alert();
			
			alert.accept();
			
			driver.navigate().refresh();
			driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
			Alert alert1=driver.switchTo().alert();
			alert1.dismiss();
			driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
			Alert alert3 =driver.switchTo().alert();
			String value = alert3.getText();
			System.out.println(value);
			alert3.dismiss();
			
	}

}


    