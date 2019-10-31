package Automationtest.phptravelsproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testcase3 extends Launch{
	Launch la=new Launch();
	Homepage h2=new Homepage();
	Hotelsearch h1=new Hotelsearch();
	
	@Test
	public void method1() throws IOException, InterruptedException{
		la.Launchbrowser();
		h1.hotels();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\arpithamj\\hotel"));
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
