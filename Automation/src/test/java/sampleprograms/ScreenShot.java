package sampleprograms;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com/");
		//driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
	WebElement element = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	File src = (File) element.getScreenshotAs(OutputType.FILE);
	File trg=new File("./amazon/photo66.jpg");
	FileUtils.copyFile(src, trg);
	
		
		
//		TakesScreenshot tscr=(TakesScreenshot)driver;
//		File src1 = tscr.getScreenshotAs(OutputType.FILE);
//		File trg1=new File("./google/photo15.jpg");
//		FileUtils.copyFile(src1, trg1);
//		
		
		driver.quit();
	}

}
