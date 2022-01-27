package webdriver;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
public class GetWindowHandles {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		
		//driver.getWindowHandle();
		//System.out.println(driver.getWindowHandle());
		
Set<String> allwindows = driver.getWindowHandles();
for(String windowid : allwindows) {
	System.out.println(windowid);
}
     driver.quit();



	}

}
