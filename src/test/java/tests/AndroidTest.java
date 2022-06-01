package tests;

import aquality.appium.mobile.application.AqualityServices;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import modules.Item;
import modules.Seller;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.*;

import java.time.Duration;


public class AndroidTest extends BaseTest {

@Test
public void testApp(){
    SoftAssert softAssert = new SoftAssert();
    AqualityServices.getApplication().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    logStep("Click on city label");
    CityScreen cityScreen = new CityScreen();
    SearchScreen searchScreen = cityScreen.clickOnCityLabel();

    logStep("Click OK button on alert");
    AndroidAlert androidAlert = new AndroidAlert();
    androidAlert.tapOk();

    logStep("Type 'Athens' in search field");
    searchScreen.typeInSearchField("Athens");

    logStep("Click on search result 'Athens'");
    searchScreen.selectCity();

    logStep("Check 'Athens' is selected as region");
    Assert.assertEquals(cityScreen.returnNameOfCity(), "Athens", "Incorrect city was selected");
    Item item = new Item();
    item.setOriginPrice(cityScreen.getOriginPrice());
    item.setDiscount(cityScreen.getDiscount());
    item.setNewPrice(cityScreen.getNewPrice());

    logStep("Select first item with discount");
    ItemScreen itemScreen = cityScreen.selectFirstProductWithDiscount();

    logStep("Check that selected item is displaying");
    Assert.assertEquals(itemScreen.isDisplayedItem(), "true", "item is not displayed");

    logStep("Check that old price, discount and price with discount are correct");
    softAssert.assertEquals(itemScreen.getOriginPrice(), item.getOriginPrice());
    softAssert.assertEquals(itemScreen.getDiscount(), item.getDiscount());
    softAssert.assertEquals(itemScreen.getNewPrice(), item.getNewPrice());
    softAssert.assertAll();

    logStep("Click on seller");
    Seller seller = new Seller();
    seller.setName(itemScreen.getSellerName());
    seller.setCity(itemScreen.getSellerCity());
    SellerScreen sellerScreen = itemScreen.clickSeller();

    logStep("Check that seller information is correct (name, city)");
    Assert.assertEquals(sellerScreen.getSellerName(), seller.getName(), "Name doesn't match");
    Assert.assertEquals(sellerScreen.getSellerCity(), seller.getCity(), "City doesn't match");








    System.out.println("ss");

    }



}
