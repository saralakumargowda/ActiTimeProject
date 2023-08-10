package sampleprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload {

			public static void main(String[] args) throws AWTException {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.naukri.com/");
			driver.findElement(By.xpath("//a[.='Register']")).click();
			WebElement ele1 = driver.findElement(By.xpath("//button[.='Upload Resume']"));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].scrollIntoView()",ele1);

	        driver.findElement(By.xpath("//button[.='Upload Resume']")).click();

	        WebDriverWait wait=new WebDriverWait(driver,(Duration.ofSeconds(20)));
	        WebElement np2 = driver.findElement(By.xpath("//button[.='Upload Resume']"));
			wait.until(ExpectedConditions.visibilityOf(np2));
			
			StringSelection path=new StringSelection("C:\\Users\\Tasmayi Gowda\\Downloads\\STRING PROGRAMS.pdf");
			
			Clipboard cb1 = Toolkit.getDefaultToolkit().getSystemClipboard();
			cb1.setContents(path, null);
			
			Robot rb=new Robot();
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			
		}

	
	}


