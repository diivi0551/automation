package asssignment1_diivisharanps;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class TtilesOfAllWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
	
		Set<String> allWindosIds = driver.getWindowHandles();
		for (String windowId : allWindosIds) {
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			
		}
		


}
}
