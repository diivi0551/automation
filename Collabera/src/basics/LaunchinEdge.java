package basics;
import org.openqa.selenium.edge.EdgeDriver;
public class LaunchinEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"D:\\edgedriver_win64\\msedgedriver.exe");

		
		EdgeDriver driver = new EdgeDriver();



	}

}
