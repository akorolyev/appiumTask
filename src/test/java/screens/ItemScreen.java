package screens;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class ItemScreen extends BaseScreen{
    private final ILabel selectedItem = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemBrand"), "Selected Item");
    private final ILabel discount = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemDiscount"), "Discount");
    private final ILabel originalPrice = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemOriginalPrice"), "Price before discount");
    private final ILabel newPrice = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemPrice"), "Price after discount");
    private final ILabel seller = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/rlSellerInfo"), "Seller's info");
    private final ILabel sellerName = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemSellerName"), "Seller's name");
    private final ILabel sellerCity = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemSellerCity"), "Seller's city");
    private final static String CONSTRUCTOR = "com.zdv.secretcloset:id/tvItemBrand";

    public ItemScreen() {
        super(By.id(CONSTRUCTOR), "Item screen");
    }

    public String isDisplayedItem(){
        return selectedItem.getAttribute("displayed");
    }

    public SellerScreen clickSeller(){
         seller.click();
         return new SellerScreen();
    }
    public String getSellerName(){
        return sellerName.getText();
    }
    public String getSellerCity(){
        return sellerCity.getText();
    }
    public String getOriginPrice(){
        return originalPrice.getText();
    }
    public String getNewPrice(){
        return newPrice.getText();
    }
    public String getDiscount(){
        return discount.getText();
    }


}
