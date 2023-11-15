package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.Timeouts;

public class HRMBaseClass {
public static Properties prop=new Properties();
public static WebDriver driver;

public HRMBaseClass()
{
	try {
	FileInputStream file=new FileInputStream("C:\\Users\\inder\\OneDrive\\Desktop\\Roicians Software\\workspace_eclipse\\HRManagement\\src\\test\\java\\environmentvariables\\Config.properties");
	prop.load(file);}
	catch(FileNotFoundException e) 
	{e.printStackTrace();}
	catch(IOException a)
	{a.printStackTrace();}}
	public static void initiation(){
		String browsername=prop.getProperty("browser");
		if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver=new FirefoxDriver();}
			else if (browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				driver=new ChromeDriver();}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Timeouts.timepage,TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
			}
		
	}
		


