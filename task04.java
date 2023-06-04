package com.example.SeleniumDay_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task04 {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement leaving = driver.findElement(By.xpath("//*[@id=\"source\"]"));
	  leaving.sendKeys("Coimbatore");
	  WebElement desti = driver.findElement(By.xpath("//*[@id=\"destination\"]"));
	  desti.sendKeys("Madurai");
	  Select date = new Select(driver.findElement(By.id("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[3]/a")));
	  date.selectByVisibleText("17");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver(co);
	  driver.get("https://www.abhibus.com/bus-ticket-booking?utm_source=google&utm_medium=cpc&utm_campaign=Sitelink&gclid=Cj0KCQjwuLShBhC_ARIsAFod4fIlAbpvmeIK2iHqmR3pv6Nw6yrdf1cEBr7-u3XKuvWjJmbTiLdF1roaAgi_EALw_wcB");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }


  }

