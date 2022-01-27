package selectclassmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_Accounts_006 {
	/**
	 * 
	 * @throws InterruptedException
	 */
     
	
	@Test(groups="SmokeTest",timeOut=10000)
	public void modifyAccount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./d rivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(11000);
		driver.get("https://www.google.com/doodles");
		driver.quit();
		

	}

}
