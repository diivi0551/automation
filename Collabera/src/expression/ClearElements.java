package expression;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClearElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");

		Thread.sleep(3000);

		WebElement usernametextField = driver.findElement(By.name("username"));
		usernametextField.clear();
		usernametextField.sendKeys("diivisharan");

		Thread.sleep(3000);

		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("97867");

		Thread.sleep(3000);	
		driver.findElement(By.linkText("Sign in")).click();
	}
}
