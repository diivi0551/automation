package selectclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Support_001 {

	@DataProvider
	public String[] sendMobileInfo() {
		String[] arr = {"iphone","redmi","poco","oneplus"};
		return arr;
	}
	@Test(dataProvider="sendMobileInfo")
	public void createRequest(String mobilename) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mobilename,Keys.ENTER);
		driver.quit();

	}

}
