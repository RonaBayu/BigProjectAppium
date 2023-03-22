package runner;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static AndroidDriver<AndroidElement> driver;

    @Before
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "12");
        caps.setCapability("deviceName", "Pixel 5");

        caps.setCapability("appPackage", "staging.cicle");
        caps.setCapability("appActivity", "staging.cicle.MainActivity");
        caps.setCapability("noReset", "true");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(url, caps);

        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    }

//    @After(order = 0)
    @After
    public void tearDown(){
        driver.closeApp();
    }

//    @After(order = 1)
//    public void takeScraenshotOnFailure(Scenario scenario) {
//
//        if (scenario.isFailed()) {
//            TakesScreenshot ts = (TakesScreenshot) driver;
//
//            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//            scenario.attach(src, "image/png", "screenshot");
//        }
//    }
}
