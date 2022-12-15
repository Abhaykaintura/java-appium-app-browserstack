package android;
import java.net.URL;
import java.util.List;
import java.util.function.Function;
import java.net.MalformedURLException;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class BrowserStackSample {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
    	DesiredCapabilities caps = new DesiredCapabilities();
    	
    	// Set your access credentials
    	caps.setCapability("browserstack.user", "abhaykaintura_E4zKuO");
    	caps.setCapability("browserstack.key", "uWnXeqDFozHLR3pgt5gA");
    	
    	// Set URL of the application under test
    	caps.setCapability("app", "bs://080c895e103ab4cf94577738b2bda3813b176316");
    	
    	// Specify device and os_version for testing
    	caps.setCapability("device", "Google Pixel 3");
    	caps.setCapability("os_version", "9.0");
        
    	// Set other BrowserStack capabilities
    	caps.setCapability("project", "First Java Project");
    	caps.setCapability("build", "browserstack-build-1");
    	caps.setCapability("name", "first_test");
       
    	
    	// Initialise the remote Webdriver using BrowserStack remote URL
    	// and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
        		new URL("http://hub.browserstack.com/wd/hub"), caps);
        
        // Write your test case statements here
        
        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();
		
	}
}
