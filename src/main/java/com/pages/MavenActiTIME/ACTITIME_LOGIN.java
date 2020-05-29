package com.pages.MavenActiTIME;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenActiTIME.AutoConstant_Actitime;
import com.generics.MavenActiTIME.BasePage;
import com.generics.MavenActiTIME.ExcelLibrary_Actitime;

public class ACTITIME_LOGIN extends BasePage implements AutoConstant_Actitime{
//	public WebDriver driver;
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//input[@id='keepLoggedInCheckBox']")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[@id='toPasswordRecoveryPageLink']")
	private WebElement forgotYourPasswordlink;
	
	@FindBy(xpath="//a[contains(text(),'actiTIME Inc.')]")
	private WebElement actiTimelink;
	
	public ACTITIME_LOGIN(WebDriver driver) {
	//	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginMethod() throws InterruptedException, IOException {
		usernameTextfield.sendKeys(ExcelLibrary_Actitime.getcellvalue(excel_path, sheetname, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary_Actitime.getcellvalue(excel_path, sheetname, 1, 1));
		keepmeloggedinCheckbox.click();
		loginButton.click();
	}
	public void forgotpassword() {
		forgotYourPasswordlink.click();
	}
	public void actitimelink() {
		actiTimelink.click();
	}
	


}
