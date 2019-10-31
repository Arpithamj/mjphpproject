package Automationtest.phptravelsproject;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class flight extends Launch{
	   static Logger log=Logger.getLogger("flight");
       static By flightsbutton=By.xpath("//a[contains(@class,'text-center flights')]");
       static By from=By.xpath("//div[@id='s2id_location_from']");
       static By from1=By.xpath("//div[@id='s2id_location_from']//a[@class='select2-choice']");
       static By to=By.xpath("//div[@id='s2id_location_to']");
       static By to1=By.xpath("//div[@id='s2id_location_to']//a[@class='select2-choice']");
       static By checkin=By.xpath("//input[@id='departure']");
       static By guest=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
       
       public static void flightsearch() throws InterruptedException
       {
    	   PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\Phpproject\\phptravelsproject\\test-output\\log4j1.properties");
    	   //fromcity
           driver.findElement(flightsbutton).click();
           driver.findElement( from).click();
           
           driver.findElement( from1).sendKeys(prop.getProperty("fromcity"));
           driver.findElement(from1).sendKeys((Keys.DOWN));
           Thread.sleep(1000);
           driver.findElement(from1).sendKeys(Keys.ENTER);
           
           
           //tocity
           driver.findElement(to).click();
           driver.findElement(to1).sendKeys(prop.getProperty("tocity"));
           driver.findElement(to1).sendKeys((Keys.DOWN));
           Thread.sleep(1000);
   		   //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
           driver.findElement(to1).sendKeys(Keys.ENTER);
           //date
           driver.findElement(By.xpath("//input[@id='FlightsDateStart']")).click();
           driver.findElement(By.xpath("//div[7]//nav[1]//div[2]")).click();
           driver.findElement(By.xpath("//div[contains(text(),'Nov')]")).click();
           for(int i = 1 ; i<=35 ; i++) {             
                String str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+i+"]")).getText();             
                if(str1.equals("1")) {                 
                    for(int j = i ; j<=35 ; j++) {                     
                        str1 = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).getText();                                         
                        if(str1.equals(prop.getProperty("checkinday"))) {                         
                            driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).click();                         
                            break;
                            
                        }
                    }
                        }
                }
           //adults
           
           driver.findElement(By.xpath("//div[@id='flights']//div[contains(@class,'row gap-5')]//div[1]//div[1]//div[2]//div[1]//span[3]//button[1]")).click(); 
          
           //child
           driver.findElement(By.xpath("//div[@id='flights']//div[contains(@class,'row gap-10 mb-15 align-items-end')]//div[2]//div[1]//div[2]//div[1]//span[3]//button[1]")).click();     
           //infant
           driver.findElement(By.xpath("//div[contains(@class,'col-md-3 col-xs-12')]//div[3]//div[1]//div[2]//div[1]//span[3]//button[1]")).click();     
           //search
           driver.findElement(By.xpath("//div[contains(@class,'col-xs-12 col-md-1')]//button[contains(@class,'btn-primary btn btn-block')][contains(text(),'Search')]")).click();
           String title=driver.getTitle();
           log.info(title);
       }
       /*public static void main(String[] args) throws IOException  {
       	Launchbrowser();
       	flightsearch();
       }*/
}