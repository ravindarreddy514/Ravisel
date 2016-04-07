package browserexamples;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "E:/Selenium drivers/IEDriverServer.exe");
	InternetExplorerDriver driver = new InternetExplorerDriver();
	driver.get("http://google.com");
	}

}
