package com.example.SeleniumDay_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;

public class task05 {
	WebDriver driver;
  @Test
  public void launch01() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver(co);
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	  search.sendKeys("Apple");
	  search.sendKeys(Keys.ENTER);
	  System.out.println(driver.getTitle());
  }
  @Test
  public void launch02() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver(co);
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	  search.sendKeys("Selenium");
	  search.sendKeys(Keys.ENTER);
	  System.out.println(driver.getTitle());
  }
  @Test
  public void launch03() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver(co);
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	  search.sendKeys("Cucumber");
	  search.sendKeys(Keys.ENTER);
	  System.out.println(driver.getTitle());
  }
  

}
