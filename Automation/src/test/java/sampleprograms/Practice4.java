package sampleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(.,'To use the Selenium Server in a Grid configuration see the')]/a")).click();
		//Scroll by action with approximate values
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
//	    jse.executeScript("window.scrollBy(0,500);");
//	    Thread.sleep(5000);
	   WebElement element = driver.findElement(By.xpath("//a[text()='Selenium Grid Components']"));
	    //Scroll to perticular element
	    jse.executeScript("arguments[0].scrollIntoView(true);", element);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Advanced features of Selenium']")).click();
	    Thread.sleep(2000);
	    
		//driver.findElement(By.xpath("//h1[text()='Grid']")).click();
		//Thread.sleep(2000);
		//String Txt = driver.findElement(By.xpath("//p[@class='card-text']//ancestor::div[9]")).getText();
		//System.out.println(Txt);
		//driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@class='w-100 shadow-1-strong rounded selenium-backer-logo']//ancestor::div[3]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@class='w-100 shadow-1-strong rounded']//ancestor::div[8]")).click();
		//Thread.sleep(2000);
		driver.close();
	}

}
