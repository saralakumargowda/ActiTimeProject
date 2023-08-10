package sampleprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNG_Practice {
	

	public static WebDriver driver;

	@BeforeClass

	public static void beforeClass() {
		System.out.println("Before class drivers open");
		ChromeOptions option = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");

	}
	
	
	@BeforeMethod
	public static void login() throws InterruptedException {
		System.out.println("Test scripts steps");
	}

	@Test

	public static void testScript() throws InterruptedException {
		System.out.println("Test scripts steps");
		driver.findElement(By.xpath("//h3[text()='Google']")).click();

	}

	@AfterMethod
	public static void afterMethod() {
		System.out.println("After method logout the application");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After class close the driver");
		//driver.quit();

	}
}
