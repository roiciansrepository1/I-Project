package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.HRMBaseClass;

public class POMLogin extends HRMBaseClass {
@FindBy(css="#divUsername> span:nth-child(2)")
WebElement Username;
@FindBy(id="txtPassword")WebElement Password;
@FindBy(id="btnLogin")WebElement Loginbtn;

	public POMLogin() {
		PageFactory.initElements(driver, this);}
	
public void typeusername(String name) {
Username.sendKeys(name);
}
public void typePassword(String pass) {
Password.sendKeys(pass);
}
public void clickbtn() {
	Loginbtn.click();
}
}