package GENERAL;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base_class {
	public AppiumDriverLocalService server;
	public AndroidDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void startServer() throws MalformedURLException
	{
		
//		"app": "C:\\Users\\vikra\\eclipse-project\\Android_framework\\src\\main\\resources\\gumazing_debug_30_11.apk",
//		  "deviceName": "pro",
//		  "platformName": "android",
//		  "automationName": "UIAutomator2"
		
		//C:\Users\vikra\eclipse-project\Android_framework\src\main\resources\gumazing_debug_30_11.apk
		 server = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\vikra\\Downloads\\gumazing_debug_30_11.apk"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		server.start();
		UiAutomator2Options capabilities=new UiAutomator2Options();
		capabilities.setDeviceName("pro");
		capabilities.setApp("C:\\Users\\vikra\\Downloads\\gumazing_debug_30_11.apk");
		
		
		 driver =new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
		
		
		
	}
	
	
	
	@BeforeClass
	public void login() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));;
		driver.findElement(By.xpath("//android.widget.EditText\r\n")).click();
		
		driver.findElement(By.xpath("//android.widget.EditText\r\n")).sendKeys("vikram@gmail.com");
		
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(9000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Verify\"]\r\n")).click();
		
	}
	
	@AfterClass
	public void logout()
	{
		
		
	}
	
	@AfterTest
	public void quit() {
		
		driver.quit();
	}
	
	
	
	@AfterSuite
	public void closeServer()
	{
		
		server.stop();
		
	}}
	
	
//	@Test
//	public void add() throws MalformedURLException, InterruptedException {
//		
//		AppiumDriverLocalService server = new AppiumServiceBuilder()
//				.withAppiumJS(
//						new File("C:\\Users\\vikra\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		server.start();
//		
//		UiAutomator2Options capabilities=new UiAutomator2Options();
//		capabilities.setDeviceName("pro");
//		capabilities.setApp("C:\\Users\\vikra\\Downloads\\Gumazing_1.0.0_upload.apk");
//		
//		
//		AndroidDriver driver =new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
//		
//		driver.findElement(By.xpath("//android.widget.EditText\r\n")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//android.widget.EditText\r\n")).sendKeys("vikram@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(AppiumBy.accessibilityId("Next")).click();
//		
//	}
//
//}
