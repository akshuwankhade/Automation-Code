package com.YouTube.TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.YouTube.POM.YoutubePOM;

public class TestClassYoutube {
	WebDriver driver;
	YoutubePOM song;
	
		@BeforeClass
		public void SetupBrowser() throws InterruptedException {
			
														
			System.setProperty("webdriver.chrome.driver","F:\\Study material\\Automation\\Selenium Jar\\chromedriver_win32\\a\\chromedriver.exe");
															
														
			driver=new ChromeDriver();
			Thread.sleep(5000);
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
		}
		@Test
		public void setYoutube() throws InterruptedException {
		song=new YoutubePOM(driver);
		song.TypeSong();
		song.SearchSong();
		song.PlaySong();
		}
		
}
