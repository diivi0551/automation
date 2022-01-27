package expression;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlphabeticOrderOfWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.axisbank.com/#");
		Thread.sleep(3000);
		driver.findElement(By.id("nvpush_cross")).click();
		driver.findElement(By.linkText("x")).click();
		driver.close();
	

	}

}
