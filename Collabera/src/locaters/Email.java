package locaters;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("diivisharan@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	    
	    driver.close();

	}

}
