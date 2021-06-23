package com.hrms.lib;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
public void OpenApplication() throws Exception {
System.setProperty("webdriver.gecko.driver", "D:\\Selenium Naresh IT\\SELENIUM ALL NOTES\\Softwares\\geckodriver.exe");
driver=new FirefoxDriver();
driver.navigate().to(url);
System.out.println("Application Open");
Reporter.log("Application open");
Log.info("Application open");
Thread.sleep(3000);
}
public void CloseApplication() throws Exception {
	driver.close();
System.out.println("Application Closed");
Reporter.log("Application close");
Log.info("Application Close");
Thread.sleep(3000);
}
public void Login() throws Exception {
	driver.findElement(By.name(txt_Loginname)).sendKeys(un);
	driver.findElement(By.name(txt_Password)).sendKeys(pw);
	driver.findElement(By.name(Btn_Login)).click();
	System.out.println("Login Completed");
	Log.info("Login Completed");
Thread.sleep(3000);
}
public void Logout() throws Exception {
	driver.findElement(By.id("welcome")).click();
	driver.findElement(By.linkText(link_Logout)).click();
	System.out.println("Logout Completed");
	Log.info("Logout Completed");
Thread.sleep(3000);
}
public void AddEmp() throws Exception {
	System.out.println("Add New Employee");
	Log.info("Add New Employee");
	Thread.sleep(3000);
}
public void DelEmp() throws Exception {
	System.out.println("Delete An Employee");
	Log.info("Delete An Employee");
	Thread.sleep(3000);
}
}
