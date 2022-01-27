package webdriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {


		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver",
					"./Drivers/chromedriver.exe");			
			ChromeDriver driver= new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.skillrary.com/");
			
			Point point = new Point(3,6);
			Point Point = driver.manage().window().getPosition();


	}

}
