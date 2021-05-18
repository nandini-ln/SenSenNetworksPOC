package com.sensen.objectRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sensen.commomutils.BaseClass;

public class LandingPage extends BaseClass{
	
	public LandingPage(WebDriver driver){
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Infringements']")
	private WebElement Infringement;
	
	public void clickOnInfringements(){
		Infringement.click();
	}
	

}
