package testLayer;

import org.apache.commons.math3.analysis.function.Log;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import basePackage.HRMBaseClass;
import pomPackage.POMLogin;

public class LoginTest extends HRMBaseClass {
	POMLogin log;

public LoginTest() {
	super();}

@BeforeMethod
public void initsetup()
{
	initiation();
	 log=new POMLogin();}
public void Title() {
	String actual=Log.verify();
	System.out.println(actual);
	Assert.assertEquals(actual, "OrangeHRM");
}
@AfterMethod
public void close() {
	driver.close();
}
}
