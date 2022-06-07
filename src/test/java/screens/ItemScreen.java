package screens;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class ItemScreen extends BaseScreen{
    private final ILabel SELECTED_ITEM = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemBrand"), "Selected Item");
    private final ILabel DISCOUNT = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemDiscount"), "Discount");
    private final ILabel ORIGINAL_PRICE = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemOriginalPrice"), "Price before discount");
    private final ILabel NEW_PRICE = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemPrice"), "Price after discount");
    private final ILabel SELLER = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/rlSellerInfo"), "Seller's info");
    private final ILabel SELLER_NAME = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemSellerName"), "Seller's name");
    private final ILabel SELLER_CITY = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemSellerCity"), "Seller's city");
    private final static String ITEM_BRAND = "com.zdv.secretcloset:id/tvItemBrand";

    public ItemScreen() {
        super(By.id(ITEM_BRAND), "Item screen");
    }

    public String isDisplayedItem(){
        return SELECTED_ITEM.getAttribute("displayed");
    }

    public SellerScreen clickSeller(){
        SELLER.click();
         return new SellerScreen();
    }
    public String getSellerName(){
        return SELLER_NAME.getText();
    }
    public String getSellerCity(){
        return SELLER_CITY.getText();
    }
    public String getOriginPrice(){
        return ORIGINAL_PRICE.getText();
    }
    public String getNewPrice(){
        return NEW_PRICE.getText();
    }
    public String getDiscount(){
        return DISCOUNT.getText();
    }
}
