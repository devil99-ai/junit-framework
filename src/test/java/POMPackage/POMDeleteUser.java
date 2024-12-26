package POMPackage;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.baseClass;

public class POMDeleteUser extends baseClass {
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div/label/span/i") WebElement userList;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button") WebElement deleteBtn;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]") WebElement confirmDelete;
	@FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]") WebElement SuccessDelete;
	
	
	public POMDeleteUser() {
		PageFactory.initElements(driver, this);
	}
	public void scrollTouser() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", userList);
	}
	public void clickAndDelete() {
		userList.click();
		deleteBtn.click();
		confirmDelete.click();
		
	}
	public void confrimDelete() {
		boolean success= SuccessDelete.isDisplayed();
		Assert.assertTrue("Deleted successfully", success);
	}
	
}
