package selectclassmethods;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now().plusMonths(2);
		String month = ldt.getMonth().name();
		String month1 = month.substring(0, 1).toUpperCase()+month.substring(1, month.length()).toLowerCase();
		int date = ldt.getDayOfMonth();
		int nextdate =date+2;
		int year = ldt.getYear();

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.navigate().to("https://www.oyorooms.com/");
		driver.findElement(By.xpath("//div[contains(@class,'oyo-cell oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone d-text16 is-fontBold datePickerDesktop')]")).click();

		for(;;) {
			try {
				driver.findElement(By.xpath("//span[text()='"+month1+"']/../..//span[text()='"+date+"']")).click();
				driver.findElement(By.xpath("//span[text()='"+month1+"']/../..//span[text()='"+nextdate+"']")).click();
			
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//div[contains(@class,'DateRangePicker__PaginationArrowIcon DateRangePicker__PaginationArrowIcon--next')]")).click();
			}
		}


	}



	}

