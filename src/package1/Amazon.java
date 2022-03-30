
package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\selenium\\chromeexe\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in//");
		driver.manage().window().maximize();
		
		WebElement ele= driver.findElement(By.xpath("//div[@id='nav-shop']"));
		Thread.sleep(4000);
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(ele));
		WebElement ele1=driver.findElement(By.xpath("//span[contains(text(),'Fire TV Stick')]"));
		//wait.until(ExpectedConditions.visibilityOf(ele1));
		WebElement ele2=driver.findElement(By.xpath("//span[contains(text(),'Fire TV Stick with all-new Alexa Voice Remote')]"));
		//wait.until(ExpectedConditions.visibilityOf(ele2));
		 Actions action=new Actions(driver);
		 
		 action.moveToElement(ele).build().perform();
		 action.moveToElement(ele1).build().perform();
		 ele2.click();
		 
		 
		 

	}

}
