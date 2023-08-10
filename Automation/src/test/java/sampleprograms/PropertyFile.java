
package sampleprograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile {
	@Test
	public static void dataDriverTesting() throws IOException {
		// Data accessing from property file
		FileInputStream fis = new FileInputStream("./src/test/resources/CommanData.properties");
		Properties prob = new Properties();
		prob.load(fis);
		String username = prob.getProperty("username");
		String password = prob.getProperty("password");
		String url = prob.getProperty("url");
		String waitTime = prob.getProperty("timeout");
		//Convert from string to Long data type
		long time=Long.parseLong(waitTime);
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		System.out.println("Time value"+time);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id=\'password\']")).sendKeys(password);
		
		WebDriverWait wait1=new WebDriverWait(driver,(Duration.ofSeconds(time)));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='Submit']"))).click();
		
		
		
		
		
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
//		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		
	}
}
