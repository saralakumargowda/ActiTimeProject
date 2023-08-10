package sampleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice5 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500);");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h2[text()='Recognitions & Membership']")).click();
		WebElement ele = driver.findElement(By.xpath("//label[text()='City']"));
		js1.executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Email Address']/following-sibling::input")).sendKeys("sarala.kumargowda@gmail.com");
		Thread.sleep(2000);
		
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Software Testing Tutorials']"));
		js1.executeScript("arguments[0].scrollIntoView(true);", ele1);
		Thread.sleep(2000);
		String Txt=driver.findElement(By.id("//input[@id='FSsubmit']")).getText();
		System.out.println(Txt);
		driver.close();
	}

}
