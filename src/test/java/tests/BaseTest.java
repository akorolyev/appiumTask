package tests;

import aquality.appium.mobile.application.AqualityServices;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.util.HashMap;

public class BaseTest {

    private static int stepNumber = 1;

    @BeforeMethod
    public void beforeMethod() {
        AqualityServices.getApplication();
    }


    @AfterMethod
    public void afterMethod() {
        AqualityServices.getApplication().quit();
    }

    protected static void logStep(String message) {
        String format = "Step %d: %s";
        AqualityServices.getLogger().info(String.format(format, stepNumber, message));
        stepNumber++;
    }
}
