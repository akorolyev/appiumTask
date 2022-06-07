package screens;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class SellerScreen extends BaseScreen{
    private final ILabel SELLER_CITY = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemSellerCity"), "Seller's city");
    private final ILabel SELLER_NAME = AqualityServices.getElementFactory().getLabel(By.xpath("com.zdv.secretcloset:id/toolbar"), "Seller's name");
    private final static String SELLER_SCREEN = "com.zdv.secretcloset:id/lvSellerItems";

    public SellerScreen() {
        super(By.id(SELLER_SCREEN), "Seller screen");
    }

    public String getSellerCity(){
        return SELLER_CITY.getText();
    }

    public String getSellerName(){
        return SELLER_NAME.getText();
    }
}
