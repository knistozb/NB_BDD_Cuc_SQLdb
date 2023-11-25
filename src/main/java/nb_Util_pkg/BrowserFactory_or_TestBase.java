
package nb_Util_pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.LocationContext;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.Interactive;
import org.openqa.selenium.internal.FindsByClassName;
import org.openqa.selenium.internal.FindsByCssSelector;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.internal.FindsByLinkText;
import org.openqa.selenium.internal.FindsByName;
import org.openqa.selenium.internal.FindsByTagName;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory_or_TestBase {

	
	
	// How do we make connection with WebDriver and ChromDriver?
		// all launching driver like ChromeDriver, FirefoxDriver, etc. extends to RemotewebDriver class
		// RemoteWebdriver class implements to WebDriver, JavaScriptExecutor, TakeScreenshot, etc.
	
	
	// Connections between WebDriver, 
		// 1. public interface WebDriver extends SearchContext
		// 2. public class ChromeDriver extends RemoteWebDriver implements LocationContext, WebStorage, HasTouchScreen, NetworkConnection 
		// 3. public class RemoteWebDriver implements WebDriver, JavascriptExecutor, FindsById, FindsByClassName, FindsByLinkText, FindsByName,
    			// FindsByCssSelector, FindsByTagName, FindsByXPath, HasInputDevices, HasCapabilities, Interactive, TakesScreenshot
			
	// IQA 1: How do you explain taking screenshot procedure?
		// --> we will have to take the help of TakesScreenshot interface and typecast it in order to make it work.
		// Then we will have to file class to save it under reference variable of sourceFile For example and use the method of getScreenshotAs and select output file type
		// then we can add date formatter and finally use FileUtils.copyFile to provide source file and target file and concatenate screenshot, Filename, directory, and file extension.
	
	
	
	
	
	
	// ========== =============== =============== ============ =============== =============== ============ =============== =============== ============
	
	
	/*
	public static WebDriver driver;

	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	 */
	
	public static WebDriver driver;
	static String browser;
	static String url;
	
	public static void readConfig() {
	
		try {
			
			InputStream input = new FileInputStream("src/main/java/config/CucumberConfig.properties");
			Properties prop = new Properties();
			prop.load(input);
			browser = prop.getProperty("browser");
			url = prop.getProperty("url");			
		}
		catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static WebDriver initDriver() {
		
		readConfig();
		if(browser.equalsIgnoreCase("chrome")) {
			System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.getProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Use appropriate browser!!!");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
//		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void takeScreenshot(WebDriver driver) {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;   // type casting is done here by putting inside the small brace
				// TakeScreenshot is an interface
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		
		
		
		try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "/screenshot/" + label + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	/*
	@After
	public static void tearDown() throws InterruptedException {
		
		Thread.sleep(1500);
		driver.close();
		driver.quit();	
	}
	 */
}
