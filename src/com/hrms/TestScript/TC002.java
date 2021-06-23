package com.hrms.TestScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC002 {
//public static void main(String args) throws Exception {
@Test
public void tc002() throws Exception {
DOMConfigurator.configure("Log4j.xml");
General obj=new General();
obj.OpenApplication();
obj.Login();
obj.AddEmp();
obj.DelEmp();
obj.Logout();
obj.CloseApplication();
}
}