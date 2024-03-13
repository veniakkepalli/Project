package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;

	@Parameters({"browserName","url"})
	@BeforeMethod
	public void configBeforeMathod(String browserName,String url) {
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}else if(browserName.equals("safari")) {
			driver=new SafariDriver();
		}else if(browserName.equals("internet explorer")) {
			driver=new InternetExplorerDriver();
		}else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterMethod
	public void configAfterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
