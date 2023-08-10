package sampleprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice9_dropdown {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_A);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_A);
		//Thread.sleep(1000);

		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager",Keys.ENTER);
		//Thread.sleep(1000);

		//driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_calendar']/ancestor::div[@class='topMenuButton preventPanelsHiding']/following-sibling::div[2]")).click();
		//Thread.sleep(1000);
		
//Have to change the X path
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[4]/a[1]/div[1]")).click();
		//Thread.sleep(1000);
		
	//	driver.findElement(By.xpath("//*[@id='firstHierarchyLevelCodeSelect']")).click();
	//	Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@id='firstHierarchyLevelCodeSelect']")).click();	
	//	Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='firstHierarchyLevelCodeSelect']"));
		//Thread.sleep(1000);
		Select s = new Select(dropdown);
		List<WebElement> alloptions = s.getOptions();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//[@id='firstHierarchyLevelCodeSelect']")).click();
	//	Thread.sleep(1000);
		
		for (WebElement options : alloptions) {
			System.out.println(options.getText());
		}
		
			driver.findElement(By.xpath("//*[@id='firstHierarchyLevelCodeSelect']")).click();
			
			//Thread.sleep(1000);
			s.selectByVisibleText("Product Line");
			
		//	Thread.sleep(1000);
		driver.close();		
		}
	}


	
			

		

			
		 

	

	


