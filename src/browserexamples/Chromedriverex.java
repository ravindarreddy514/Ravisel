package browserexamples;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriverex {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E://Selenium drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://msn.com");
		
	}

}
