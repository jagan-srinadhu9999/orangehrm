package com.orange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Objects {

	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement uname;
	@FindBy(xpath="//*[@type='password']")
	private WebElement passwd;
	@FindBy(xpath="//button[(text()=' Login ')]")
    private	WebElement loginbutton;
	@FindBy(xpath="//p[(text()='Forgot your password? ')]")
	private WebElement forgotpwdlink;
	
	
	public Login_Page_Objects(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getUname()
	{
		return uname;
	}

     public void setUname(WebElement uname) {
    	 this.uname=uname;
     }
	public WebElement getPasswd() {
		return passwd;
	}


	public void setPasswd(WebElement passwd) {
		this.passwd = passwd;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}


	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}


	public WebElement getForgotpwdlink() {
		return forgotpwdlink;
	}


	public void setForgotpwdlink(WebElement forgotpwdlink) {
		this.forgotpwdlink = forgotpwdlink;
	}
	
	//declaration
	//initialization
	//implementation
	
	
}
