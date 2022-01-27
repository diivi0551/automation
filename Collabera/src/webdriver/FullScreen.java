package webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FullScreen 
{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\chromedriver_win32\\chromedriver.exe");			
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hotstar.com/in");
			
			Thread.sleep(4000);
			driver.manage().window().fullscreen();
			driver.close();

	}

}
