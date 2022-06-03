package com.e2etests.automation.aleatoire.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.BasePage;
import com.e2etests.automation.utils.CommonUtils;
import com.e2etests.automation.utils.Setup;

public class AleatoirePage extends BasePage {
	
	CommonUtils commonUtils;
	public AleatoirePage() {

		PageFactory.initElements(driver, this);
		this.commonUtils = new CommonUtils();

	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"centered_nav\"]/a[3]")
	public static WebElement aléatoire;
		
	@FindBy(how = How.XPATH, using = "//*[@title='Twitter']")
	public static WebElement widgetsTwitter;
	
	@FindBy(how = How.XPATH, using = "//*[@title='Facebook']")
	public static WebElement widgetsFacebook;
	
	@FindBy(how = How.XPATH, using = "//*[@title='Share on Tumblr']")
	public static WebElement widgetsTumblr ;
	
	public void clickOnAléatoire() {
		aléatoire.click();
	}  	
	
	public String urlExtraction() {
		return Setup.driver.getCurrentUrl();
	}

}
