package sampleprograms;

//Data Driven Testing

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13 mini back cover ");
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[contains(@class,'_1MRYA1')]/li"));
		for (WebElement options : suggestions) {
			String sugesstion = options.getText();
			if (sugesstion.contains("iphone 13 mini back cover s")) {
				options.click();
				break;
    	   }
      
       }
      driver.quit();
	}

}
