package locaters;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("divithsaravanan@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("pass")).sendKeys("Diivi@0551");
		
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("button")).click();
		





	}

}
