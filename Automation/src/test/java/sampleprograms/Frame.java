package sampleprograms;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(3000);
//		//Perticular element screnshot
//		//Random r=new Random(100);
//		//int randomnumber = r.nextInt();
//		WebElement element = driver.findElement(By.xpath("//span[.='Get access to your Orders, Wishlist and Recommendations']"));
//		File src = element.getScreenshotAs(OutputType.FILE);
//		File trg=new File("./FlipkartShot/photo07.jpg");
//		FileUtils.copyFile(src, trg);
//		//Full page screenshot
////		TakesScreenshot ts=(TakesScreenshot)driver;
////		File src = ts.getScreenshotAs(OutputType.FILE);
////		File trg=new File("./FlipkartShot/photo.jpg");
////		FileUtils.copyFile(src, trg);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,500);");
		WebElement element = driver.findElement(By.xpath("//h3[text()='Labels']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//div[@class='td-header-sp-recs']//following-sibling::div[@class='td-header-rec-wrap']//a[text()='Free Mock Tests']")).click();
		driver.findElement(By.xpath("//li[@id='all-exams-id']")).click();
		Thread.sleep(1000);
		//driver.quit();
	}

}
