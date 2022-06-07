package screens;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import org.openqa.selenium.By;


public class SearchScreen extends BaseScreen {

    private final ITextBox SEARCH_FIELD = AqualityServices.getElementFactory().getTextBox(By.id("com.zdv.secretcloset:id/etSearchTest"), "Search field");
    private final ILabel CITY_NAME = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvCityItemName"), "Name of city");
    private final static String SEARCH_BOX = "com.zdv.secretcloset:id/tvTitle";

    public SearchScreen() {
        super(By.id(SEARCH_BOX), "Search screen");
    }

    public void typeInSearchField(String nameOfCity){
        SEARCH_FIELD.clearAndType(nameOfCity);
    }

    public void selectCity() {
        CITY_NAME.click();
    }

}
