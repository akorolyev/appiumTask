package tests;

import aquality.appium.mobile.application.AqualityServices;
import org.testng.annotations.*;


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
