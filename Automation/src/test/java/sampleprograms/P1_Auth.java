package sampleprograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class P1_Auth{
	@Test

	public static void auth() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://gmail.com");
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Gmail");
		
		//driver.findElement(By.xpath("//div[@class='rFrNMe N3Hzgf jjwyfe QBQrY zKHdkd sdJrJc Tyc9J']")).sendKeys("Admin");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        
	}

}
