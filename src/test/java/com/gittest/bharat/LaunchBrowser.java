package com.gittest.bharat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
WebDriver dr;
	
	@Test
	public void newTest() throws InterruptedException{
	 	   
	   System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\geckodriver\\geckodriver.exe");
	   dr=new FirefoxDriver();
	   dr.manage().window().maximize();
	   dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   dr.get("http://album.alexflueras.ro/galleries/landscapes.html");
	   System.out.println("browser launched");
	   
	}

}
