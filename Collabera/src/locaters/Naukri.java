package locaters;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds =driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			driver.close();
		}
		driver.switchTo().window(parentWindowId);
		
		driver.findElement(By.className("sugInp")).sendKeys("Test Engineer");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("qsb-location-sugg")).sendKeys("Bangalore");
		
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("button")).click();
		
		driver.close();
	}
}

		

	

	


