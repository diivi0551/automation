package webdriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetSizeHeightWidth {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");			
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		Thread.sleep(2000);
		
		Dimension dimension = new Dimension(1240,860);
		driver.manage().window().setSize(dimension);
		

	}

}
