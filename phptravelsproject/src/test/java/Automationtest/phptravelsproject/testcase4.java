package Automationtest.phptravelsproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testcase4 extends Launch {
 Launch l1=new Launch();
 flight f1=new flight();
 
 @Test
 public void method() throws IOException, InterruptedException {
	 l1.Launchbrowser();
	 f1.flightsearch();
	 
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\arpithamj\\flight"));
 }
 @AfterTest
	public void close() {
		driver.close();
	}
}
