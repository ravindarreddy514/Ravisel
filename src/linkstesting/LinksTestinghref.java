package linkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTestinghref {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("mprofile");
		FirefoxDriver driver = new FirefoxDriver(fp);
		driver.get("http://bing.com");
		String expurl=driver.findElement(By.linkText("Videos")).getAttribute("href");
		driver.findElement(By.linkText("Videos")).click();
		String acturl= driver.getCurrentUrl();
		if(acturl.equals(expurl))
		{
			System.out.println("Videos links is working correctly");
		}
		else
		{
			System.out.println("Videos links is not working properly");
		}
		
;	}

}
