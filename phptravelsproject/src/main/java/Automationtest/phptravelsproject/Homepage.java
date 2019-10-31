package Automationtest.phptravelsproject;

import java.io.IOException;

import org.openqa.selenium.By;

public class Homepage extends Launch{
	static By MyAccount=By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	static By SignUp=By.xpath("//a[@class='dropdown-item tr']");
    static By Login=By.xpath("//a[@class='dropdown-item active tr']");
public static void SignUp() {
	driver.findElement(MyAccount).click();
	driver.findElement(SignUp).click();
}
public static void login() {
	driver.findElement(MyAccount).click();
	driver.findElement(Login).click();
}
public static void main(String args[]) throws IOException
{
	Launchbrowser();
	SignUp();
	//login();
}

}
                                      