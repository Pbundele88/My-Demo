package package1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabEx {
	 WebDriver driver;
	 Utils util;

	 @BeforeTest
	 public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromeexe\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	 }

	 
	 
	 @Test
	 public void testOpenYoutube() {
	  driver.get("https://www.youtube.com");
	
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	 }
	        @Test
	 public void testOpenGmail() {
	  switchToNewTab();
	  driver.get("http://www.gmail.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	       public void openNewTab() {
	  ((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
	 }

	 public void switchToNewTab() {
	  openNewTab();
	  String subWindowHandler = null;

	  Set<String> handles = driver.getWindowHandles();
	  Iterator<String> iterator = handles.iterator();
	  while (iterator.hasNext()) {
	   subWindowHandler = iterator.next();
	  }
	  driver.switchTo().window(subWindowHandler);
	 }

	 @AfterClass
	 public void tearDown() {
	  driver.quit();
	 }
	 

	}

