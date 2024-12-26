package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.baseClass;
import junit.framework.Assert;

public class POMverifyUser extends baseClass {
	
	@FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div") WebElement successfullyaddesuser;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input") WebElement inputUsernameforSearch;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]") WebElement searchbtn;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span") WebElement record;
	
	public POMverifyUser() {
		PageFactory.initElements(driver, this);
	}
	public void AssertUser() {
		boolean useradded=successfullyaddesuser.isDisplayed();
		Assert.assertTrue("user added successfully",useradded);
		
	}
	public void username(String name) {
		inputUsernameforSearch.sendKeys(name);
	}
	public void clickOnSearch() {
		searchbtn.click();
	}
	public void validationUser() {
		String records = record.getText();
		String expectedRecords="(1) Record Found";
		Assert.assertEquals("user available", records, expectedRecords);
	}


}
