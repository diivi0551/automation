package locaters;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//label[text()='Keep me logged in']")).click();

		driver.quit();
		

	}

}
