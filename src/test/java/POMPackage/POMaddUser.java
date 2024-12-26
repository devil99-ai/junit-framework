package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.baseClass;

public class POMaddUser extends baseClass{
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a") WebElement clickAdmin;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input") WebElement Username;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]") WebElement roleDropdown;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]") WebElement roleSelect;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input") WebElement employeeName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]") WebElement status;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]") WebElement selectStatus;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button") WebElement add;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input") WebElement password;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input") WebElement confirmpassword;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]") WebElement saveUser;
	
	public POMaddUser() {
		PageFactory.initElements(driver, this);
	}
	public void clickAdminTab() {
		clickAdmin.click();
	}
	public void add() {
		add.click();
	}
	public void addUsername(String name) {
		Username.sendKeys(name);
	}
	public void selectRole() {
		roleDropdown.click();
		roleSelect.click();
	}
	public void employeeadd(String employee) {
		employeeName.sendKeys(employee);
	}
	public void statusChange() {
		status.click();
		selectStatus.click();
	}
	public void addPassword(String pass) {
		password.sendKeys(pass);
	}
	public void confirmpassword(String pass) {
		confirmpassword.sendKeys(pass);
	}
	public void saveUser() {
		saveUser.click();
	}
	

}
