package com.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		
		
		driver.findElement(By.xpath("//div[@id='cookie-law-info-bar']//a[contains(text(),'ACCEPT')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='content']//button[contains(text(),'New Browser Tab')]")).click();
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div/div/div/div/p[5]/button")).click();

		Set<String> set = driver.getWindowHandles();
		System.out.println(set);
		List<String> list = new ArrayList<String>(set);
		
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.xpath("//span[contains(text(),'Selenium Training')]")).click();
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//span[contains(text(),'Selenium Training')]")).click();
	}

}
