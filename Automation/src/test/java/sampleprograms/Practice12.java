package sampleprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice12 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.flipkart.com");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(1000);
		
		// Mouse actions
		Actions act = new Actions(driver);
		WebElement moreElements = driver.findElement(By.xpath("//div[text()='Travel']"));
		Thread.sleep(1000);
		act.moveToElement(moreElements);
		Thread.sleep(1000);
		act.contextClick().perform();
		Thread.sleep(2000);
		act.contextClick().perform();
//		

//		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
//		Thread.sleep(1000);
//		act.keyDown(Keys.SHIFT).sendKeys(element, "samsung 5g mobile").perform();
//		Thread.sleep(1000);
//		act.keyUp(Keys.SHIFT).sendKeys(element, "samsung 5g mobile").perform();
//		Thread.sleep(1000);
//		String ele1 = element.getAttribute("value");
//		System.out.println(ele1);
//Window popup
		driver.getWindowHandle();//one Parent page will be there
		driver.getWindowHandles();//Multiple windows
		driver.close();
	}

}
