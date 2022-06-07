package screens;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class CityScreen extends BaseScreen {

    private final String PRODUCTS_WITH_DISCOUNT = "*/android.widget.RelativeLayout['%s']";
    private final ILabel CITY_LABEL= AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvToolbarCity"), "City Label");
    private final ILabel ORIGIN_PRICE = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvSumm"), "Origin price");
    private final ILabel NEW_PRICE = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvPrice"), "New price");
    private final ILabel DISCOUNT = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvDiscount"), "Discount");
    private final static String TOOL_BAR = "com.zdv.secretcloset:id/tvToolbarCity";

    public CityScreen() {
        super(By.id(TOOL_BAR), "City screen");
    }

    public SearchScreen clickOnCityLabel (){
        CITY_LABEL.click();
        return new SearchScreen();
    }

    public String returnNameOfCity(){
        return CITY_LABEL.getText();
    }

    public ItemScreen selectFirstProductWithDiscount(String numberOfProduct){
        AqualityServices.getElementFactory().getLabel(By.xpath(String.format(PRODUCTS_WITH_DISCOUNT, numberOfProduct)),
                "First product with discount").click();
        return new ItemScreen();
    }
    public String getNewPrice(){
        return NEW_PRICE.getText();
    }
    public String getOriginPrice(){
        return ORIGIN_PRICE.getText();
    }
    public String getDiscount(){
        return DISCOUNT.getText();
    }
}
