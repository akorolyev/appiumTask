package screens;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class SellerScreen extends BaseScreen{
    private final ILabel sellerCity = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemSellerCity"), "Seller's city");
    private final ILabel sellerName = AqualityServices.getElementFactory().getLabel(By.xpath("com.zdv.secretcloset:id/toolbar"), "Seller's name");
    private final static String CONSTRUCTOR = "com.zdv.secretcloset:id/lvSellerItems";

    public SellerScreen() {
        super(By.id(CONSTRUCTOR), "Seller screen");
    }

    public String getSellerCity(){
        return sellerCity.getText();
    }

    public String getSellerName(){
        return sellerName.getText();
    }


}
