package linkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	FirefoxDriver driver =new FirefoxDriver();
	driver.get("https://google.com");
	driver.findElement(By.linkText("Gmail")).click();
	String exptitle="Gmail";
	String acttitle= driver.getTitle();
	if(acttitle.equals(exptitle))
	{
		System.out.println("Gmail link is working properly");
	}
	else
	{
		System.out.println("Gmail link is not working properly");
	}
	driver.close();
	}

}
