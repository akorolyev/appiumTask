package screens;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.interfaces.ILabel;
import org.openqa.selenium.By;


public class CityScreen extends BaseScreen {

    private final ILabel cityLabel= AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvToolbarCity"), "City Label");
    private final ILabel productsWithDiscount = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/ivProductPic"), "First product with discount");
    private final ILabel originPrice = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvSumm"), "Origin price");
    private final ILabel newPrice = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvPrice"), "New price");
    private final ILabel discount = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvDiscount"), "Discount");
    private final static String CONSTRUCTOR = "com.zdv.secretcloset:id/tvToolbarCity";

    public CityScreen() {
        super(By.id(CONSTRUCTOR), "Start screen");
    }

    public SearchScreen clickOnCityLabel (){
        cityLabel.click();
        return new SearchScreen();
    }

    public String returnNameOfCity(){
        return cityLabel.getText();
    }

    public ItemScreen selectFirstProductWithDiscount(){
        productsWithDiscount.click();
        return new ItemScreen();
    }
    public String getNewPrice(){
        return newPrice.getText();
    }
    public String getOriginPrice(){
        return originPrice.getText();
    }
    public String getDiscount(){
        return discount.getText();
    }

}
