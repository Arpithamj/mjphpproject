package Automationtest.phptravelsproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testcase1 extends Registration{
	Launch l1=new Launch();
	Homepage h1=new Homepage();
	Registration r1=new Registration();
	
	@Test
	public void method() throws IOException {
		l1.Launchbrowser();
		h1.SignUp();
		r1.registrationpage();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\arpithamj\\signupscreenshot"));
		
		
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
	
