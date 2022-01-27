package asssignment1_diivisharanps;
import  org.openqa.selenium.chrome.ChromeDriver;


public class TitleUrlPageSourceofFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.getCurrentUrl();
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.getPageSource();
	    System.out.println(driver.getPageSource());
	    

	}

}
