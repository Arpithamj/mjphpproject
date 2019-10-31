package Automationtest.phptravelsproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testcase2 extends Launch {
	Launch l2=new Launch();
	Homepage h2=new Homepage();
	Login r2=new Login();
	@Test
	public void method1() throws IOException {
		l2.Launchbrowser();
		h2.login();
		r2.loginpage();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\arpithamj\\loginscreenshot"));
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	

}
