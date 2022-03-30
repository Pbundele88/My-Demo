package package1;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.internet.MimeBodyPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLaunch {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String path="C:\\selenium\\chromeexe\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession&cid=0&navigationDirection=forward");
		//driver.findElements(By.xpath("//input[@id='identifierId']")).get(1).click();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("praf535");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.findElements(By.xpath("//input[@name='password']")).get(0).click();  
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pcakshay");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("amitachouhan15@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Demo Praful");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='Ar Au']//div")).sendKeys("hello amu tamu  \n is it working");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id=':aq']")).click();
		
		
		MimeBodyPart messageBodypart2= new MimeBodyPart();
		String filename="C:\\Users\\Home\\Desktop\\demo2.txt";
		DataSource source = new FileDataSource(filename);
		messageBodypart2.setDataHandler(new DataHandler(source));
		messageBodypart2.setFileName(filename);
		
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	
	}

}
