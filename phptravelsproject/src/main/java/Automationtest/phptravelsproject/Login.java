package Automationtest.phptravelsproject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Login extends Homepage{
	   static Logger log=Logger.getLogger("Login");
 static By email=By.xpath("//input[@placeholder='Email']");
 static By password=By.xpath("//input[@placeholder='Password']");
 static By login=By.xpath("//button[.='Login']");
 public static void loginpage()
 {
	 PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\Phpproject\\phptravelsproject\\test-output\\log4j1.properties");
	 driver.findElement(email).sendKeys(prop.getProperty("email1"));
	 driver.findElement(password).sendKeys(prop.getProperty("password"));
	 driver.findElement(login).click();
	 String title=driver.getTitle();
	 log.info(title);
     System.out.println(title);
    
 }
 public static void main(String[] args) throws IOException  {
	 Launchbrowser();
	 login();
	 loginpage();
	 
 }
}
