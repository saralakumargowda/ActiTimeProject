package sampleprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice10 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='popup_menu_button_addons']/div[@class='popup_menu_icon']")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//div[@id='popup_menu_button_addons']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Integration with Qu')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Start Trial'][1]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[@class='button header__button']")).click();

		//Thread.sleep(1000);
		driver.close();
	}

}
