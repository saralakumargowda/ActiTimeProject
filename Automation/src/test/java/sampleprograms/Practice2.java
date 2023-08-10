package sampleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		/*driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		// driver.findElement(By.name("pwd")).sendKeys("manager");
		// driver.findElement(By.name("pwd")).sendKeys("manager");
		// Thread.sleep(300);
		// driver.findElement(By.id("keepLoggedInLabel")).click();
		// Thread.sleep(300);
		// driver.findElement(By.className("initial")).click();
		// Thread.sleep(300);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("forgetPasswordButton")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("toLoginPageLink")).click();
		String text = driver.findElement(By.cssSelector("[id='headerContainer']")).getText();
		System.out.println("Text is :"+text);
		driver.findElement(By.linkText("Return to login page")).click();*/
		/*driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		//driver.findElement(By.className("oxd-button oxd-butoxd-input oxd-input--activeton--medium oxd-button--main orangehrm-login-button")).sendKeys("Admin");
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']")).click();
		
		Thread.sleep(5000);
		// String Txt1=driver.getTitle();
		// System.out.println("Visible text:"+Txt1);
		driver.findElement(By.xpath("//h6[text()='Dashboard']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='aAtish yadav']")).click();*/
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		// driver.findElement(By.name("pwd")).sendKeys("manager");
		// driver.findElement(By.name("pwd")).sendKeys("manager");
		// Thread.sleep(300);
		// driver.findElement(By.id("keepLoggedInLabel")).click();
		// Thread.sleep(300);
		// driver.findElement(By.className("initial")).click();
		// Thread.sleep(300);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("forgetPasswordButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("toLoginPageLink")).click();
		String text = driver.findElement(By.cssSelector("[id='headerContainer']")).getText();
		System.out.println("Text is :"+text);
		driver.findElement(By.linkText("Return to login page")).click();
		String Txt=driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'Ready for Approval')][1]")).getText();
				System.out.println(Txt);

		Thread.sleep(2000);
		
		driver.close();
	}
}
