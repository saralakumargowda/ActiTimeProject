package sampleprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup {
	@Test()

	public static void auth() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//Syntax:protocal//username:password@Url
         driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        String text = driver.findElement(By.xpath("p[contains(text(),' Congratulations! You must have the prope')]")).getText();
      System.out.println(text);
	}
	@Test
	public static void auth2() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//Syntax:protocal//username:password@Url
         driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        String text = driver.findElement(By.xpath("p[contains(text(),' Congratulations! You must have the prope')]")).getText();
      System.out.println(text);
	}


}
