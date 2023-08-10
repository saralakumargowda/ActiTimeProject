package sampleprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice6 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://baou.edu.in/");
		Alert act = driver.switchTo().alert();
		act.dismiss();
		JavascriptExecutor je2 = (JavascriptExecutor) driver;
		je2.executeScript("winow.scrollby(0,500");
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Recognitions & Membership']"));
		je2.executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(2000);
		String Txt = driver.findElement(By.xpath("//h2[text()='Contribution Towards Digital India']")).getText();
		System.out.println(Txt);
		driver.close();
	}

}
