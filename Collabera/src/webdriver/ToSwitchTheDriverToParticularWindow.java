package webdriver;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToSwitchTheDriverToParticularWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		
		Set<String> allWindowIds = driver.getWindowHandles();
		String expectedWindowTitle = "Tech Mahindra";
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String actualWindowTitle = driver.getTitle();
			if(expectedWindowTitle.equals(actualWindowTitle)) {
				driver.manage().window().maximize();
				break;
				
			}
			
			
		}
		
		
		
		

	}

}
