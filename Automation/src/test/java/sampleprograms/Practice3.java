package sampleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		//Thread.sleep(2000);
//		//driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung mobiles");
//		// fetch the text what ever you enter in the respective input box
		Actions act=new Actions(driver);
		//WebElement element2 = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		WebElement moreElement = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Thread.sleep(2000);
		//Mouse actions
		act.moveToElement(moreElement);//Mouse over
		Thread.sleep(5000);
		act.contextClick().perform();//Right click if you want to do ..some where will be clicked
		act.contextClick(moreElement).perform();
		act.doubleClick();//Double click
		act.doubleClick(moreElement);
		////act.clickAndHold();//Click and hold the element or object
		//act.dragAndDrop(source, destination);
		
		//Thread.sleep(2000);
		
//		act.keyDown(Keys.SHIFT).sendKeys(element2,"iphone").perform();
//		act.keyUp(Keys.SHIFT).sendKeys(element2,"iphone").perform();
//		String searchvalue = element2.getAttribute("value");
//		System.out.println(searchvalue);
//		act.moveToElement(element2);
//		Thread.sleep(2000);		
//		String text1 = driver.findElement(By.xpath("//input[@class='_3704LK']")).getText();
//		WebElement searchbar = driver.findElement(By.xpath("//input[@class='_3704LK']"));
//		System.out.println(searchbar);
//		String text3 = searchbar.getText();
//		// Button validation
//		if (searchbar.isEnabled()) {
//			System.out.println("Button is enabled");
//		} else {
//			System.out.println("Button is disabled");
//		}
//		//
//        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
//        for(WebElement text:elements) {
//        	String mobiletext = text.getText();
//        	System.out.println(mobiletext);
//        }
//		String text = searchbar.getAttribute("value");
//		System.out.println(text);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@class='_3704LK']")).submit();
//		Thread.sleep(2000);
//
//		WebElement element = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Plus (Purple, 128 GB)']"));
//		if (element.isDisplayed()) {
//			System.out.println("Apple phone text is displayed");
//		} else {
//			System.out.println("Apple phone text is not displayed");
//		}
//
//		// System.out.println(Txt);
//
//		// a[@aria-label='Search for Images (opens a new tab)']
		driver.close();
	}

}
