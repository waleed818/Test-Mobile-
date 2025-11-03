package testmobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class mytestcases {
	
	
	AndroidDriver driver ;
	
	DesiredCapabilities caps = new DesiredCapabilities();
	
	
	@BeforeTest
	
	public void openapp () {
		
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:deviceName", "Waleed");
		
		File myapp = new File("src/testmobile/base.apk");
		
		caps.setCapability("appium:app",myapp.getAbsolutePath());
	}
	

	@BeforeMethod 
	
	
     public void app() throws MalformedURLException {
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		
	}
	
	
	@Test 
	
	public void signup ( ) {
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
