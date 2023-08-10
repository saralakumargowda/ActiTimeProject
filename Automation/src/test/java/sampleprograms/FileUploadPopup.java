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

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) throws AWTException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[.='Register']")).click();
		WebElement element = driver.findElement(By.xpath("//button[.='Upload Resume']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",element);

		//driver.get("https://the-internet.herokuapp.com/upload");
		// By Using Sednkeys (Only have to use AV contains type='file')
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Tasmayi Gowda\\Downloads\\Selenium Syllabus.pdf");
	   
		//By Robot Class
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		//Select the path
		StringSelection path=new StringSelection("C:\\Users\\Tasmayi Gowda\\Downloads\\Selenium Syllabus.pdf");
		//Copy the path
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(path, null);
		//Paste the path
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
	}

}
