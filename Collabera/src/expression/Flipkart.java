package expression;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement Phonenum = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		Phonenum.clear();
		Phonenum.sendKeys("9786730551");
		WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		Password.clear();
		Password.sendKeys("Diivi@0551");	
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9786730551");
		Thread.sleep(1000);
		WebElement SearchTf = driver.findElement(By.name("q"));
		SearchTf.click();
		SearchTf.sendKeys("Iphone 13 mini");
		SearchTf.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Mini (Midnight, 128 GB)']")).click();
		Thread.sleep(1000);
		Set<String> WindowIds = driver.getWindowHandles();
		String WindowId = driver.getWindowHandle();
		WindowIds.remove(WindowId);
		for(String WID : WindowIds) {
			driver.switchTo().window(WID);
		}

		WebElement Pincode = driver.findElement(By.id("pincodeInputId"));
		Pincode.clear();
		Pincode.sendKeys("560066");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();

		//second product
		WebElement SearchTf2 = driver.findElement(By.name("q"));
		SearchTf2.click();
		SearchTf2.sendKeys("Samsung A71");
		SearchTf2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy A71 (Haze Crush Silver, 128 GB)']")).click();
		Thread.sleep(2000);
		Set<String> WindowIds1 = driver.getWindowHandles();
		String WindowId3 = driver.getWindowHandle();
		WindowIds1.remove(WindowId3);
		WindowIds1.remove(WindowId);
		for(String WID1 : WindowIds1) {
			driver.switchTo().window(WID1);
		}
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();

		//3rd product
		WebElement SearchTf3 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		SearchTf3.click();
		SearchTf3.sendKeys("Redmi Note 10 pro");
		SearchTf3.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		Set<String> WindowIds2 = driver.getWindowHandles();
		String WindowId4 = driver.getWindowHandle();
		WindowIds2.remove(WindowId4);
		WindowIds2.remove(WindowId);
		WindowIds2.remove(WindowId3);
		for(String WID2 : WindowIds2) {
			driver.switchTo().window(WID2);
		}
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		driver.switchTo().window(WindowId);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[5]/div/div/a/span")).click();

	}

}
