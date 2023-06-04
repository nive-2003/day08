package com.example.SeleniumDay_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task03 {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver(co);
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	  WebElement input = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	  input.sendKeys("401");
	  input.submit();
	  driver.switchTo().alert().dismiss();
	  input.clear();
	  input.sendKeys("402");
	  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	  driver.switchTo().alert().accept();
	  Assert.assertEquals("Customer Successfully Delete!", driver.switchTo().alert().getText());
	  
  }
}
