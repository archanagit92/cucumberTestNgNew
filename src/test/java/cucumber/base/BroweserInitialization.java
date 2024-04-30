package cucumber.base;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BroweserInitialization {
	
//	static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal();
	static ThreadLocal<WebDriver> driver = new ThreadLocal();


//@BeforeMethod()
	public static void browerserInitializatio() throws MalformedURLException {

		String browser="CHROME";
		URL url = new URL("https://sso-walmart-archana.patil:d6499deb-8367-470c-9863-ac4fe958e6a5@ondemand.us-west-1.saucelabs.com:443/wd/hub");

		Map<String, Object> sauceOptions=new HashMap();
		sauceOptions.put("username", "sso-walmart-archana.patil");
		sauceOptions.put("accesskey", "d6499deb-8367-470c-9863-ac4fe958e6a5");
	//	sauceOptions.put("name", name.getName());
		
		
		if (browser.equalsIgnoreCase("CHROME")) {
			
			ChromeOptions chromOptions=new ChromeOptions();
			
			chromOptions.setCapability("sauce:options", sauceOptions);
			chromOptions.setCapability("platformName", "macOS 10.15");
			chromOptions.setCapability("browserName", "chrome");
			chromOptions.setCapability("browserVersion", "latest");
//			chromOptions.addArguments("--incognito");
//			chromOptions.addArguments("window-size=1480,860");
			
			//RemoteWebDriver
			RemoteWebDriver drv = (RemoteWebDriver) WebDriverManager.chromedriver().capabilities(null)
					.driverVersion("124").remoteAddress(url).clearResolutionCache().create();
			driver.set(drv);

			// Web Deriver
//			WebDriver drv=	WebDriverManager.chromedriver().capabilities(chromOptions).driverVersion("124").clearResolutionCache().create();
//			
//			driver.set(drv);
			driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}

}
