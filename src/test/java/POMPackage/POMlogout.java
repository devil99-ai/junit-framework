package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.baseClass;

public class POMlogout extends baseClass{
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i") WebElement expand;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a") WebElement logout;
	
	public POMlogout() {
		PageFactory.initElements(driver, this);
	}
	public void logout() {
		expand.click();
		logout.click();
	}

}
