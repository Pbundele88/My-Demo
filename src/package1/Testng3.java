package package1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng3 {
	WebDriver driver;
	 @Test
	  public void openSameUrlInMultipleTab() throws InterruptedException {
		 String path="C:\\selenium\\chromeexe\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver= new ChromeDriver();
		  String pageUrl = "http://www.bing.com";
		  this.driver.get(pageUrl);
		  
		  String currWindowHandleStr = this.driver.getWindowHandle();
		  System.out.println("Current windowhandler before create tab : " + currWindowHandleStr);
		  
		  /* Get html body webelement. */
		  WebElement bodyElement = this.driver.findElement(By.cssSelector("body"));
		  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		  /* Send Ctrl+t to create newtab. */
		 /* for(int i=0;i<6;i++)
		  {
			  bodyElement.sendKeys(Keys.CONTROL + "\t");
			  Thread.sleep(2000);
			  System.out.println("Open a newtab.");
		  }*/
		  
		  driver.switchTo().window(tabs.get(0));
		 
		  /* Change tab 2 's page url tp http://www.google.com */
		  //bodyElement.sendKeys(Keys.CONTROL+"2");
		  driver.switchTo().window(tabs.get(1));
		  this.driver.get("http://www.google.com");
		  Thread.sleep(3000);
		  
		  currWindowHandleStr = this.driver.getWindowHandle();
		  System.out.println("Current windowhandler after go to tab 2 : " + currWindowHandleStr);
		  
		  /* Close tab 3.*/
		  /* First need to find the body web element in currenttab. */
		  //bodyElement = this.driver.findElement(By.tagName("body"));
		  /* Go to tab 3. */
		  //bodyElement.sendKeys(Keys.CONTROL+"3");
		  driver.switchTo().window(tabs.get(1));
		  this.driver.get("http://www.twitter.com");
		  Thread.sleep(3000);
		  currWindowHandleStr = this.driver.getWindowHandle();
		  /* Close currenttab. */
		  //bodyElement.sendKeys(Keys.CONTROL+"w");
		  Thread.sleep(3000);
	  }
}
