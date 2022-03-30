package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\selenium\\chromeexe\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://artoftesting.com/sampleSiteForSelenium.html");
		driver.manage().window().maximize();
		String a=driver.getTitle();
		System.out.println("Title of the page is : " + a);
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.id("testingDropdown"));
		Select sel= new Select(ele);
		sel.selectByIndex(2);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView();", ele);
		sel.selectByIndex(2);
	}

}


