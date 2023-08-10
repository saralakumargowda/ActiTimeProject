package sampleprograms;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowspopup {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/search?q=samsung&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.findElement(By.xpath("//a[contains(text(),'SAMSUNG 10000 mAh Power Bank')]")).click();
		// new window tab if you want to open
		//driver.switchTo().newWindow(WindowType.TAB);
		// Open new window   
		// driver.switchTo().newWindow(WindowType.WINDOW);
		String parentId = driver.getWindowHandle();
		//System.out.println("Parent Page Session Id" + parentId);
		
		//This is standard code for window pop up
		Set<String> childId = driver.getWindowHandles();
		for (String allchilds : childId) {
			if (!parentId.equals(allchilds)) {
				driver.switchTo().window(allchilds);
				break;
			}
		}
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,(Duration.ofSeconds(10)));
		WebElement newpage = driver.findElement(By.xpath("//span[contains(text(),'SAMSUNG 10000 mAh')]"));
		wait.until(ExpectedConditions.visibilityOf(newpage));
		String wp = driver.findElement(By.xpath("//span[contains(text(),'SAMSUNG 10000 mAh')]")).getText();
		System.out.println(wp);
		driver.quit();
	}
	}
