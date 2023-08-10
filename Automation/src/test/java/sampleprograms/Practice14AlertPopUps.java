package sampleprograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice14AlertPopUps {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(1000);
		alt1.accept();

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(1000);
		String msg = alt1.getText();
		alt1.dismiss();
		System.out.println(msg);
		

		//		WebDriverWait wait=new WebDriverWait(driver,(Duration.ofSeconds(50)));
		//		WebElement one=sendKeys("Hello");
		//		wait.until(ExpectedConditions.visibilityOf(one));
		//		alt1.accept();

		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		alt1.sendKeys("Hello");
		alt1.accept();
		Thread.sleep(5000);
		driver.quit();


	}



}
