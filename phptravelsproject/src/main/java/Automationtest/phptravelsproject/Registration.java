package Automationtest.phptravelsproject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class Registration extends Homepage {
	static Logger log=Logger.getLogger("Registration");
	static By firstname=By.xpath("//input[@placeholder='First Name']");
	static By lastname=By.xpath("//input[@placeholder='Last Name']");
	static By mobilenum=By.xpath("//input[@placeholder='Mobile Number']");
	static By email=By.xpath("//input[@placeholder='Email']");
	static By password=By.xpath("//input[@placeholder='Password']");
	static By confirmpassword=By.xpath("//input[@placeholder='Confirm Password']");
	static By cookies=By.xpath("//button[@onclick='cookyGotItBtn()']");
	static By accept=By.xpath("//div[@id='usertrack-consent__button']");
	static By signupbutton=By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']");
	
	
	public static void registrationpage() {
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\Phpproject\\phptravelsproject\\test-output\\log4j1.properties");
		driver.findElement(firstname).sendKeys(prop.getProperty("firstname"));
		driver.findElement(lastname).sendKeys(prop.getProperty("lastname"));
		driver.findElement(mobilenum).sendKeys(prop.getProperty("mobilenum"));
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		driver.findElement(password).sendKeys(prop.getProperty("password"));
		driver.findElement(confirmpassword).sendKeys(prop.getProperty("confirmpassword"));
		driver.manage().window().maximize();
		driver.findElement(signupbutton).sendKeys(Keys.ENTER);
		String title=driver.getTitle();
		 log.info(title);
	    
	}
	
	
	public static void main(String[] args) throws IOException {
		//TODO Auto-generated method stub
        Launchbrowser();
        SignUp();
		registrationpage();
	}

}
