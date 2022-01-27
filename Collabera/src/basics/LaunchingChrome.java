package basics;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchingChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		

	}

}
