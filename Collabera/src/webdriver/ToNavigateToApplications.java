package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToApplications {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	//	String pageSource=driver.getpageSource();
		System.out.println(driver.getPageSource());
		
	}

}
