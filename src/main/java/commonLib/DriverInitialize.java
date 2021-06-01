package commonLib;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitialize {
	private static Logger logger = Logger.getLogger(DriverInitialize.class.getName());
	private static WebDriver driver;

	public static WebDriver initializeDriver(String browserType) {
		try {
			if (driver == null) {
				switch (browserType) {

				case "chrome":
					String current = System.getProperty("user.dir");
			        System.out.println("Current working directory in Java : " + current);

			        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");

					driver = new ChromeDriver();
					break;

				default:
					logger.info(
							"Invalid Option!! Please provide the valid browser type from the options firefox/ie/chrome!!");
					break;
				}
			} else {
				logger.error("WebDriver is already Initialized!!");
			}
		} catch (Exception exception) {
			logger.error("Exception Occured During Initialization of the WebDriver!!");
			exception.printStackTrace();
			System.exit(1);
		}
		return driver;
	}
}
