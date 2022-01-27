package webdriver;
import  org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hotstar.com/in");
		driver.getTitle();
		System.out.println(driver.getTitle());
		

	}

}
