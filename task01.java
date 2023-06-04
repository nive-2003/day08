package com.example.SeleniumDay_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task01 {
	
	WebDriver driver;
  @Test
  public void task() {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver(co);
	  driver.get("https://demoqa.com/droppable/");
	  driver.manage().window().maximize();
	  WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  WebElement destination = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  
	  Actions a = new Actions(driver);
	  a.dragAndDrop(source, destination).build().perform();
	  
  }
}
