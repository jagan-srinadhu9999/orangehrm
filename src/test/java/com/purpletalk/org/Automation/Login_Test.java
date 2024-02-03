package com.purpletalk.org.Automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orange.pages.Login_Page_Objects;

public class Login_Test {

	WebDriver driver;
	Login_Page_Objects obj;
	
	@Test
	public void get_Login()
	{
		obj= new Login_Page_Objects(driver);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		obj.getUname().sendKeys("Admin");
		obj.getPasswd().sendKeys("admin123");
		obj.getLoginbutton().click();
		
		
	}
	
}
