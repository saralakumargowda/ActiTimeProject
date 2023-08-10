package sampleprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice8 {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://Amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 12");
		//driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).submit();
		 List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	       for(WebElement options:suggestions) {
	    	   String sugesstion1 = options.getText();
	    	   if(sugesstion1.contains("iphone 12 case")) {
	    		   options.click();
	    		   break;
	    	   }
	      
	       }
			driver.close();
		}
	}

