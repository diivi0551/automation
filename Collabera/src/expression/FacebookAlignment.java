package expression;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookAlignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("Position of the window");
		Point point = driver.manage().window().getPosition();
		System.out.println(point.x);
		System.out.println(point.y);

		System.out.println("Width of the username textfield:");

		Rectangle usernameRectangleArea = driver.findElement(By.id("email")).getRect();
		System.out.println(usernameRectangleArea.x);
		System.out.println(usernameRectangleArea.y);


		System.out.println(" ");

		System.out.println("width of the password textfield:");
		Rectangle passwordRectanglearea = driver.findElement(By.className("_6lux")).getRect();
		System.out.println(passwordRectanglearea.x);
		System.out.println(passwordRectanglearea.y);

		System.out.println("");
		System.out.println("width of login button ");

		Rectangle loginRectangleArea = driver.findElement(By.name("login")).getRect();
		System.out.println(loginRectangleArea.x);
		System.out.println(loginRectangleArea.y);

	}
}