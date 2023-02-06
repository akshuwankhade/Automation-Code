package com.YouTube.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubePOM {
	
	WebDriver driver;
	
	@FindBy (xpath="//input[@id='search']")
	private WebElement Song;
	
	@FindBy (xpath="//button[@id='search-icon-legacy']")
	private WebElement Submit;
	
	@FindBy (xpath="(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")
	private WebElement Play;
	
	
	public YoutubePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void TypeSong() throws InterruptedException {
		Thread.sleep(7000);
		Song.sendKeys("THE PUNJAABBAN SONG");
	}
	
	public void SearchSong() throws InterruptedException {
		Thread.sleep(6000);
		Submit.click();
	}
	
	public void PlaySong() throws InterruptedException {
		Thread.sleep(9000);
		Play.click();
	}

}
