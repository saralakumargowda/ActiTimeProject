
package sampleprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.chrome.ChromeDriver;
public class Webbrowserlaunch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
       // driver.get("https://www.flipkart.com/");
        //Thread.sleep(5000);
       // driver.navigate().to("https://www.amazon.com/");
        driver.get("https://www.amazon.com/");
//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        driver.navigate().forward();
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        driver.quit();
        //To get Page title
        String titleTxt = driver.getTitle();
        System.out.println("Title is :"+titleTxt);
        //driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/following-sibling::div/span/following-sibling::span")).click();
        Thread.sleep(2000);
        String urlLink = driver.getCurrentUrl();
        System.out.println("Current url is :"+urlLink);
       // String pageSource = driver.getPageSource();
       // System.out.println("Page source code is:"+pageSource);
        driver.close();
        //driver.
     }

}
