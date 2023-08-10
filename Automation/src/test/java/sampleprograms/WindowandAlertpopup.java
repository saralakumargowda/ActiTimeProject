package sampleprograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowandAlertpopup {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);

		Actions act = new Actions(driver);

		WebElement act1 = driver.findElement(By.xpath("//div[text()='Jobs']"));

		Thread.sleep(2000);
		act.moveToElement(act1);
		Thread.sleep(2000);
		act.contextClick().perform();// Right click
		act.contextClick(act1).perform();// perticular element mouse over
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='IT jobs']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[text()='Services']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Job Search Assistant Online']")).click();
		Alert alt2 = driver.switchTo().alert();
		driver.findElement(By.xpath("//div[text()='CHAT NOW']")).click();
		String a3 = alt2.getText();
		alt2.dismiss();
		System.out.println(a3);

		Alert alt3 = driver.switchTo().alert();
		driver.findElement(By.xpath("//div[text()='Job Search Assistant Online']")).click();
		String a4 = alt3.getText();
		alt3.dismiss();
		System.out.println(a4);

		driver.close();
	}

}
