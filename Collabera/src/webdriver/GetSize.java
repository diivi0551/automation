package webdriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetSize {



	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");			
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		Dimension dimension =driver.manage().window().getSize();
		dimension.getHeight();
		dimension.getWidth();
		System.out.println("height"+  dimension.getHeight());
		System.out.println("width"+  dimension.getWidth());
		
		
		driver.close();


	}

}
