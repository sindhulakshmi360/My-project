package appiumcalculatortesting;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Calculator {
	public static AppiumDriver driver;
	public static void main(String[] args) {
		try
		{
			Calculator();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}
	public static void Calculator() throws MalformedURLException {
		//declare desired capabilites from your appium both phone details and application details
		//phone details
		DesiredCapabilities desire = new DesiredCapabilities();
		desire.setCapability("platformName", "Android");
		desire.setCapability("deviceName", "Galaxy Note20 Ultra 5G");
		desire.setCapability("udid", "R5CN70S8CEL");
		desire.setCapability("platformVersion", "11");
		//application details
		desire.setCapability("appPackage","com.sec.android.app.popupcalculator");
		desire.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,desire);
		System.out.println("Successfully connected to the phone");
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal")).click();
	}

}
