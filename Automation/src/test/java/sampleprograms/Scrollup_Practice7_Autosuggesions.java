package sampleprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollup_Practice7_Autosuggesions {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//implicit wait optimized code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://Amazon.com/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 12");
		WebElement element=driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
		Thread.sleep(2000);
		//implicit wait normal code
		Options opt=driver.manage();
		Timeouts out = opt.timeouts();
		out.implicitlyWait(Duration.ofSeconds(10));
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.invisibilityOf(null);
		//After using Explicit wait if element is not present You will get No such a element exception.
		
		FluentWait<WebDriver>wait1=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10));
		FluentWait<WebDriver>wait2=new FluentWait<WebDriver>(driver);
		wait2.pollingEvery(Duration.ofSeconds(10));
		driver.close();
		//Select class
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='firstHierarchyLevelCodeSelect']"));
		Select s=new Select(dropdown);
		Thread.sleep(1000);
		// to print what ever the options are present in dropdown.
		List<WebElement> allOptions = s.getOptions();
		for(WebElement options:allOptions) {
			System.out.println(options.getText());
		}
		driver.findElement(By.xpath("//select[@id='firstHierarchyLevelCodeSelect']")).click();
		//s.selectByIndex(0);
		//s.selectByValue("Value");
		s.selectByVisibleText("Product Line");
		
		
		
	} 

}
