package com.hrms.TestScript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC001 {
//public static void main (String args[]) throws Exception {
	@Test
	public void tc001() throws Exception {
    DOMConfigurator.configure("Log4j.xml");
	General obj=new General();
	obj.OpenApplication();
	obj.Login();
	obj.Logout();
	obj.CloseApplication();
}
}
