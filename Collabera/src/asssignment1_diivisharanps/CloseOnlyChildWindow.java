package asssignment1_diivisharanps;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildWindow {

	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"./Drivers/chromedriver.exe");	
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
		}
	}


