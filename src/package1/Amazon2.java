package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\selenium\\chromeexe\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in//");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement ele= driver.findElement(By.id("nav-link-accountList"));
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		WebElement ele1=driver.findElement(By.id("nav_prefetch_yourorders"));
		wait.until(ExpectedConditions.visibilityOf(ele1));
		 Actions action=new Actions(driver);
		 
		 action.moveToElement(ele).build().perform();
		 action.moveToElement(ele1).build().perform();
		 ele1.click();
		 Thread.sleep(4000);
		 WebElement ele2=driver.findElement(By.xpath("//input[@id='ap_email']"));
		 wait.until(ExpectedConditions.visibilityOf(ele2));
		 ele2.sendKeys("9067190535");
		 //Thread.sleep(4000);
		 WebElement ele3=driver.findElement(By.xpath("//span[@id='continue']"));
		 wait.until(ExpectedConditions.visibilityOf(ele3));
		 ele3.click();
		//Thread.sleep(4000);
		 WebElement ele4=driver.findElement(By.xpath("//input[@id='ap_password']"));
		 wait.until(ExpectedConditions.visibilityOf(ele4));
		 ele4.sendKeys("prafbundele@88");
		 //Thread.sleep(4000);
		 WebElement ele5=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		 wait.until(ExpectedConditions.visibilityOf(ele5));
		 ele5.click();
		 Thread.sleep(4000);
		 action.moveToElement(ele).build().perform();
		 action.moveToElement(ele1).build().perform();
		 ele1.click();
		
	}

}
