package sampleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClassSample2 {
	static WebDriver driver;
	//driver.this=driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class drivers open");
		ChromeOptions option = new ChromeOptions();  
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	}
	@Test
	
	public static void testScript() {
		System.out.println("Test scripts steps");
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		WebElement webelement = driver.findElement(By.xpath("//div[@id='container_users']"));
		//Actions class
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		act.keyDown(Keys.SHIFT).sendKeys(webelement,"iphone").perform();
		act.keyDown(Keys.SHIFT).sendKeys(webelement,"iphone").perform();
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
