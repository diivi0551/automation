package asssignment1_diivisharanps;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationForwardBackRefresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		driver.get("https://www.hotstar.com/in");
		 
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
