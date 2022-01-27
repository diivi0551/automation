package expression;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingSubmit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		
		Thread.sleep(2000);
		
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.clear();
		
		usernameTextField.sendKeys("dii","vi","sh","ar","an",Keys.CONTROL+"a");
		Thread.sleep(3000);
		usernameTextField.sendKeys(Keys.CONTROL+"c");
		
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.clear();
		Thread.sleep(3000);
		passwordTextField.sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	
		

	}

}
