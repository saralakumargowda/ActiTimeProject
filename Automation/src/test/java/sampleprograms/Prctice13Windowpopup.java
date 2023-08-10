package sampleprograms;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prctice13Windowpopup {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/search?q=iphone%2013&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']")).click();
		
				
		
		driver.switchTo().newWindow(WindowType.TAB);
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Page Session Id" + parentId);
		
		
		Set<String> childId = driver.getWindowHandles();
		for (String allchilds : childId) {
			if (!parentId.equals(allchilds)) {
				driver.switchTo().window(allchilds);
				break;
			}
		}
		
		WebDriverWait wait=new WebDriverWait(driver,(Duration.ofSeconds(50)));
		WebElement onenewpage = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']"));
		wait.until(ExpectedConditions.visibilityOf(onenewpage));
		
		String text1 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']")).getText();
		System.out.println(text1);
		driver.quit();
	}

}