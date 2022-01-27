package webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CloseOnlyParentWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		driver.close();


	}

}
