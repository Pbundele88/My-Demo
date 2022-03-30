package package1;


import java.util.ArrayList;
import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\selenium\\chromeexe\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.yatra.com/");
		driver.manage().window().maximize();
	// driver.findElements(By.tagName("a"));
	java.util.List<WebElement> list= driver.findElements(By.tagName("a"));
	int count=list.size();
	System.out.println("Total no of hyperlinks presents:" + count);
	for (int i=0;i<count;i++){
		String s=list.get(i).getText();
		System.out.println(s);	
	}
	}
	

}
