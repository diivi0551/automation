package webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.amazon.in/");
		 
		 /*driver.findElement(By.id("nav-link-accountList")).click();
		 driver.findElement(By.id("ap_email")).sendKeys("adiramamanoj4204@gmail.com");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.id("ap_password")).sendKeys("ka36n4204");
		 driver.findElement(By.id("signInSubmit")).click();*/
		 
		 driver.findElement(By.id("twotabsearchtextbox")).clear();
		 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one pluse8 nord 5g", Keys.ENTER);
		 
		 driver.findElement(By.xpath("//span[text()='(Renewed) OnePlus Nord 5G (Gray Onyx, 8GB RAM, 128GB Storage)']")).click();
		 
		 String parentWindowId = driver.getWindowHandle();
		 Set<String> allWindowIds = driver.getWindowHandles();
		 allWindowIds.remove(parentWindowId);
		 for(String productWindowId: allWindowIds) {
			 driver.switchTo().window(productWindowId);
			 WebElement productPrize = driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']"));
			 String actualProductPrize = productPrize.getText();
			 System.out.println(actualProductPrize);
			 double actualprize= 27499.00;
				double expectedPrize= 6000.00;
				String s1= String.valueOf(actualProductPrize);
				System.out.println(s1);
				String s2= String.valueOf(expectedPrize);
				System.out.println(expectedPrize);
				if(s1==s2) {
					System.out.println(" actualPrize is less then expectedPrize");
					driver.findElement(By.id("add-to-cart-button"));
				}
				else {
					System.out.println("The Product Prize is More than The Expected Prize");
				}
			 
			 
		 }
		}

	}


