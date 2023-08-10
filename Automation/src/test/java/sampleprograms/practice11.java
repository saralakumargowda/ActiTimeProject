package sampleprograms;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice11 {
	public static void main(String[] args) throws AWTException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
//		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_TAB);
//		rb.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);

		//rb.keyPress(KeyEvent.VK_CONTROL);
		//rb.keyPress(KeyEvent.VK_C);
	//	rb.keyRelease(KeyEvent.VK_CONTROL);
	//	rb.keyRelease(KeyEvent.VK_C);
		
		// driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
		WebElement webelement = driver.findElement(By.xpath("//div[@id='container_users']"));
		
		
		//Actions class
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		act.keyDown(Keys.SHIFT).sendKeys(webelement,"iphone").perform();
		act.keyDown(Keys.SHIFT).sendKeys(webelement,"iphone").perform();
		act.keyUp(null);
		driver.close();

	}

}
