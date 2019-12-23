package com.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities SSLCertificate = DesiredCapabilities.chrome();
		SSLCertificate.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);s
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement srcEle=  driver.findElement(By.id("src"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("src")));
		
	//	FluentWait<WebDriver> fwait1= new FluentWait<WebDriver>(TimeUnit.SECONDS, 20, 5);
		
		//sWait<WebDriver> fwaait = new FluentWait(driver).withTimeout(20,TimeUnit.SECONDS).pollingEvery(4,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		
		
	}

}
