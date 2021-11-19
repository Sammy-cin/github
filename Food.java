import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Food {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver94.exe");
		//access the url case
		ChromeOptions option = new ChromeOptions ();
	    option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.eazydiner.com/");
		
		
		WebElement we=driver.findElement(By.id("home-search"));
		we.click();
    	we.sendKeys("indraprastha");
    	Thread.sleep(2000);
    	we.submit();
     	driver.findElement(By.xpath("//button[@id='apxor_search']")).click();	
    	
    	}

}
