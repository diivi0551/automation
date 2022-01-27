package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoManageMaximize {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.quit();

	}

}
