import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Signup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver94.exe");
		
		ChromeOptions option = new ChromeOptions ();
	    option.addArguments("--disable-notifications");
	    option.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver w = new ChromeDriver(option);
		w.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		w.get("https://www.eazydiner.com/");
		w.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div[1]/a/div/div[1]/img")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("//*[@id='restaurants']/div[1]/div/div[3]/div[2]/div[2]/a")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id='eazy-booking']/div/div/div/div/ul/li[1]")).click();
		Thread.sleep(3000);
		//w.findElement(By.xpath("/html/body/div[20]/div/table/tbody/tr[5]/td[2]")).click();
		w.findElement(By.xpath("//*[@id='eazy-booking']/div/div/div/div/ul/li[2]/select/option[4]")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("//*[@id='slotForm']/div/div/button")).click();
		WebElement ww=w.findElement(By.id("guest_name"));
		ww.click();
		ww.sendKeys("Samannay Majumder");
		w.findElement(By.xpath("//*[@id='guest-form']/div/div[2]/div/div/input")).sendKeys("7406603601");
		w.findElement(By.id("guest_email")).sendKeys("samjoymaj@.com");
		Thread.sleep(3000);
		w.findElement(By.id("checkout-button")).click();
		
		
	}

}
