package sampleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		//driver.get("https://youtube.com");
		//Thread.sleep(1000);
		//driver.navigate().forward();
		driver.get("https://demo.actitime.com/login.do");
	//	Thread.sleep(1000);
		//driver.navigate().back();
	//	driver.navigate().refresh();
		//Thread.sleep(1000);
		//String titleTxt = driver.getTitle();
		//System.out.println("Title is:" + titleTxt);
	//	driver.navigate().forward();
	//	String urlLink = driver.getCurrentUrl();
	//	System.out.println("The Current url is:" + urlLink);
	//	driver.navigate().forward();
		// String pageSource = driver.getPageSource();
		// System.out.println("Page source code is:"+pageSource);
		//driver.get("https://apple.com");
		//Thread.sleep(1000);
		//String currenturl = driver.getCurrentUrl();
	//	System.out.println("The current url is:" + currenturl);
	//	String titleTxt1 = driver.getTitle();
	//	System.out.println("The title1 is:" + titleTxt1);
	//	driver.navigate().forward();
	//	driver.get("https://www.twitter.com");
	//	String currentur2 = driver.getCurrentUrl();
	//	System.out.println("The current url is:" + currentur2);
	//	driver.getCurrentUrl();
		//Id Locator;;
	driver.findElement(By.id("username")).sendKeys("admin");
	// driver.findElement(By.id("container"));
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(5000);
	// driver.findElement(By.name("q"));
	// driver.findElement(By.className("Attribute value")).click();
	driver.findElement(By.id("keepLoggedInLabel")).click();
	Thread.sleep(5000);
	driver.findElement(By.className("initial")).click();
	Thread.sleep(5000);
//Link Locator
	driver.findElement(By.linkText("Forgot your password?"));
	driver.findElement(By.partialLinkText("Forgot your"));
	//CSS Selector Loctoe
	driver.findElement(By.cssSelector("[placeholder='Your Email or Username']"));
	driver.findElement(By.cssSelector("[id='loginButton']"));
	//Instead of id # symbol we can use
	driver.findElement(By.cssSelector("#loginButton")); 
	//Instead of class . we can use
	driver.findElement(By.cssSelector("[class='atProductName']"));
	driver.findElement(By.cssSelector(".atProductName"));
	driver.findElement(By.cssSelector(".textField.pwdfield"));
	driver.close();
		
		
		//Id Locator;;
		//driver.findElement(By.id("Attribute value")).sendKeys("admin");
		//driver.findElement(By.id("container"));
		//driver.findElement(By.name("Attribute value")).sendKeys("manager")
		//driver.findElement(By.name("q"));
		//driver.findElement(By.className("loginButton")).click();
		//driver.findElement(By.id("keepLoggedInLabel")).click();
		//driver.close();
	}

}