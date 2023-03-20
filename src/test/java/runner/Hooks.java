package runner;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static AndroidDriver<AndroidElement> driver;
    public static DesiredCapabilities caps;

    @Before
    public static void setUp() throws MalformedURLException {
        caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "12");
        caps.setCapability("deviceName", "Pixel 5");

        caps.setCapability("appPackage", "staging.cicle");
        caps.setCapability("appActivity", "staging.cicle.MainActivity");
        caps.setCapability("noReset", "true");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(url, caps);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.closeApp();
    }
}
