package selenium.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public static WebDriver driver;
	
	public static WebDriver setUp() {
		pathReader.reader(driverPath.Config_Path);
		switch (pathReader.getProp("browser").toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driverPath.Chrome_Path);
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", driverPath.Firefox_Path);
			driver=new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("browser not found");
		}
		driver.get(pathReader.getProp("url"));
		return driver;
	}
	
	
	public static WebDriver setUp(String url) {
		pathReader.reader(driverPath.Config_Path);
		switch (pathReader.getProp("browser").toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driverPath.Chrome_Path);
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", driverPath.Firefox_Path);
			driver=new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("browser not found");
		}
		driver.get(url);
		return driver;
		}

}
