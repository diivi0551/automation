package takingscreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakingScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("https://www.skillrary.com/");
		 
		 File screenshot = driver.getScreenshotAs(OutputType.FILE);
		 File destFile = new File("./errorscreenshot/scrnshot.png");
		 
		 
		 File weScreenShot = driver.findElement(By.xpath("//h4[text()='🍪 Accept Cookies & Privacy Policy?']/..")).getScreenshotAs(OutputType.FILE);
		 File weDestFile = new File("./errorscreenshot/weSc2.png");
		 
		 
		 FileUtils.copyFile(screenshot,destFile);
		 FileUtils.copyFile(weScreenShot,weDestFile);
		 Thread.sleep(2000);
         driver.quit();
	}
}
