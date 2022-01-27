package asssignment1_diivisharanps;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElementUsingName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");			
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		driver.findElement(By.xpath("//*[@id=\"front-header\"]/div[3]/header/div/div/div[3]/u1/li[9]/a")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("first_name")).sendKeys("Diivisharan P S");
		

	}

}
