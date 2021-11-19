import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Twitter {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver94.exe");
		
		
		 ChromeOptions option = new ChromeOptions();
		 option.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(option);
		 driver.manage().window().maximize();
		driver.get("https://www.eazydiner.com/");
		
		driver.findElement(By.id("help")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/ul/li[1]/a/span")).click();
		Thread.sleep(5000L);
		driver.findElement(By.linkText("Food trends (Blog)")).click();
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
		Set<String>ids = driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        String Parentid=it.next();
        Thread.sleep(5000L);
        driver.switchTo().window(Parentid);
        Thread.sleep(5000L);
        driver.findElement(By.linkText("Food Trends by Vir Sanghvi")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/ul/li[1]/a/span")).click();
		
        
		/*driver.findElement(By.id("city-name")).click();
		driver.findElement(By.xpath("//*[@id=\"search-inner\"]/div[1]/div[1]/button")).click();
		*/
		
		
		
		
		
	}
}
