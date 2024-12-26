package testLayer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import POMPackage.POMDeleteUser;
import POMPackage.POMaddUser;
import POMPackage.POMdashboard;
import POMPackage.POMlogout;
import POMPackage.POMverifyUser;
import POMPackage.POmLogin;
import basePackage.baseClass;
import junit.framework.Assert;

public class loginTest extends baseClass {
	POmLogin login;
	POMdashboard dashboard;
	POMaddUser add;
	POMverifyUser user;
	POMDeleteUser delete;
	POMlogout logout;
	public loginTest() {
		super();
	}
	
	
	@Before
	public void initSetup() {
		initiation();
		login = new POmLogin();
		add = new POMaddUser();
		user= new POMverifyUser();
		delete = new POMDeleteUser();
		dashboard= new POMdashboard();
		logout= new POMlogout();
		screenshot("login");
	}
	@Test
	public void testLogin() throws InterruptedException {
		//screenshot("login");
		Thread.sleep(10000);
		login.enterUsername(prop.getProperty("username"));
		login.enterPassword(prop.getProperty("password"));
		login.clickLogin();
		Thread.sleep(10000);
		String actualUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		Thread.sleep(10000);
		add.clickAdminTab();
		Thread.sleep(10000);
		add.add();
		Thread.sleep(10000);
		add.addUsername(prop.getProperty("newuser"));
		Thread.sleep(10000);
		add.employeeadd(prop.getProperty("employeeName"));
		Thread.sleep(10000);
		add.addPassword(prop.getProperty("newPassword"));
		Thread.sleep(10000);
		add.confirmpassword(prop.getProperty("newPassword"));
		Thread.sleep(10000);
		add.selectRole();
		Thread.sleep(10000);
		add.statusChange();
		Thread.sleep(10000);
		add.saveUser();
		//user.AssertUser();
		Thread.sleep(15000);
		user.username(prop.getProperty("newuser"));
		user.clickOnSearch();
		Thread.sleep(3000);
		user.validationUser();
		delete.scrollTouser();
		delete.clickAndDelete();
		Thread.sleep(5000);
		delete.confrimDelete();
		dashboard.clickondashboard();
		Thread.sleep(5000);
		screenshot("dashboard");
		logout.logout();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
