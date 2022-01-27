package asssignment1_diivisharanps;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseThirdwindowInNaukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		
		String thirdWindowTitle = "ICICI";
		Set<String> allWindowId = driver.getWindowHandles();
		for(String windowId:allWindowId) {
			
			driver.switchTo().window(windowId);
			String actualWindowTitle = driver.getTitle();
			if(actualWindowTitle.equals(thirdWindowTitle)) {
				driver.close();
			}
			
		}
		

	}

}
