package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.DriverBase;

public class PersonlDetailPage {
	
	@FindBy(id="personal_txtLicenNo")
	public WebElement LicenNo;
	
	@FindBy(id="personal_txtNICNo")
	public WebElement SSN;
	
	@FindBy(id="personal_txtSINNo")
	public WebElement SIN;
	
	@FindBy(id="btnSave")
	public WebElement editSave;
	
	@FindBy(id="personal_txtMilitarySer")
	public WebElement Military;
	
	@FindBy(id="personal_cmbMarital")
	public WebElement MarigStatus;
	
	@FindBy(name="personal[optGender]")
	public List<WebElement> Gender;
	
	@FindBy(id="personal_chkSmokeFlag")
	public WebElement SmokChekBox;
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement profPicName;
	
	@FindBy(id="personal_cmbNation")
	public WebElement Nationality;
	
	@FindBy(id="personal_txtEmpNickName")
	public WebElement NickName;
	
	
	public PersonlDetailPage() {
		PageFactory.initElements(DriverBase.driver, this);
	}
	
	
	

}
