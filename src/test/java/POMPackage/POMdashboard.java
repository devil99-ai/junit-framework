package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.baseClass;

public class POMdashboard extends baseClass{
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span") WebElement clickDashboard;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button") WebElement minimize;
	
	public POMdashboard() {
		PageFactory.initElements(driver, this);
	}
	public void clickondashboard() throws InterruptedException {
		clickDashboard.click();
		Thread.sleep(5000);
		minimize.click();
		
	}

}
