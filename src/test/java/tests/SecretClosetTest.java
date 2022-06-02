package tests;

import modules.Item;
import modules.Seller;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.*;




public class SecretClosetTest extends BaseTest {

@Test
public void testApp(){
    SoftAssert softAssert = new SoftAssert();

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
    Item item = new Item(cityScreen.getDiscount(), cityScreen.getOriginPrice(), cityScreen.getNewPrice());

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
    Seller seller = new Seller(itemScreen.getSellerName(), itemScreen.getSellerCity());
    seller.setName(itemScreen.getSellerName());
    seller.setCity(itemScreen.getSellerCity());
    SellerScreen sellerScreen = itemScreen.clickSeller();

    logStep("Check that seller information is correct (name, city)");
    Assert.assertEquals(sellerScreen.getSellerName(), seller.getName(), "Name doesn't match");
    Assert.assertEquals(sellerScreen.getSellerCity(), seller.getCity(), "City doesn't match");

    }



}
