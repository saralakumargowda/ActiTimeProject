package sampleprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base_TestNG {
	public static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class drivers open");
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://Amazon.com/");
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 12");
//		
//		 List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
//	       for(WebElement options:suggestions) {
//	    	   String sugesstion1 = options.getText();
//	    	   if(sugesstion1.contains("iphone 12 case")) {
//	    		   options.click();
//	    		   break;
//	    	   }
//	       }

	}

	@BeforeMethod
	public static void login() throws InterruptedException {
		System.out.println("Test scripts steps");
	}

	@Test

	public static void testScript() throws InterruptedException {
		System.out.println("Test scripts steps");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 12");
		List<WebElement> suggestions = driver
				.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		for (WebElement options : suggestions) {
			String sugesstion1 = options.getText();
			if (sugesstion1.contains("iphone 12 case")) {
				options.click();
				break;
			}
		}

	}

	@AfterMethod
	public static void afterMethod() {
		System.out.println("After method logout the application");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After class close the driver");
		driver.quit();

	}
}
