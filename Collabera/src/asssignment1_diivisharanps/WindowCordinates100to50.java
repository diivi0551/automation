package asssignment1_diivisharanps;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowCordinates100to50 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromdriver",
				"./Drivers/chromedriver.exe");			
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Point p = new Point(100,50);
		driver.manage().window().setPosition(p);


	}

}
