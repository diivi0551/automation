package basics;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchingFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.geckodriver.driver",
				"./Drivers/geckodriver.exe");

		
		 FirefoxDriver  driver = new FirefoxDriver ();

		

	}

}
