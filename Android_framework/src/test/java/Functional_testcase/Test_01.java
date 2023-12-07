package Functional_testcase;

import org.testng.annotations.Test;

import GENERAL.Base_class;
import io.appium.java_client.AppiumBy;

public class Test_01 extends Base_class {
	@Test
	public void one() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText\r\n")).click();
		
		
	}

}

