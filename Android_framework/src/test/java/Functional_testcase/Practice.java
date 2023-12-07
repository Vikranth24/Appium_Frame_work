package Functional_testcase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Practice {
	@Test
	public void add() throws MalformedURLException, InterruptedException {
		
		AppiumDriverLocalService server = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\vikra\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
			.withIPAddress("127.0.0.1").usingPort(4723).build();
		server.start();
		
		UiAutomator2Options capabilities=new UiAutomator2Options();
		capabilities.setDeviceName("pro");
	capabilities.setApp("C:\\Users\\vikra\\eclipse-project\\Android_framework\\src\\main\\resources\\gumazing_debug_30_11.apk");
		
		
		@SuppressWarnings("deprecation")
		AndroidDriver driver =new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));;
		driver.findElement(By.xpath("//android.widget.EditText\r\n")).click();
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.widget.EditText\r\n"))));
		driver.findElement(By.xpath("//android.widget.EditText\r\n")).sendKeys("vikram@gmail.com");
		
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		Thread.sleep(9000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Verify\"]\r\n")).click();
		
		
		
	}

}
