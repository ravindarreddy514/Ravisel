package linkstesting;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ProfileClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp =pr.getProfile("mprofile");
		FirefoxDriver driver = new FirefoxDriver(fp);
		driver.get("http://greatandhra.com");
		

	}

}
