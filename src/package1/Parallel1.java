package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel1 {
	WebDriver driver;
	@Parameters("browserFlag")
	@Test
	public void m1() throws InterruptedException{
	System.out.println("I am in m1");
	Thread.sleep(2000);
	driver.get("https://www.google.com");
}@BeforeTest
public void m2(){
	System.out.println("I am in beforetest");
}
@AfterTest 
public void m3(){
	System.out.println("I am in aftertest");
}
@BeforeClass
public void m4(){
	System.out.println("I am in beforeclass");
}
@AfterClass
public void m5(){
	System.out.println("I am in afterclass");
	
}
@BeforeMethod
public void m6(){
	System.out.println("I am in beforemethod");
	String path="C:\\selenium\\chromeexe\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver= new ChromeDriver();
}
@AfterMethod
public void m7(){
	System.out.println("I am in aftermethod");
}
}



