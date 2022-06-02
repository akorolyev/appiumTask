package screens;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import org.openqa.selenium.By;


public class SearchScreen extends BaseScreen {

    private final ITextBox searchField = AqualityServices.getElementFactory().getTextBox(By.id("com.zdv.secretcloset:id/etSearchTest"), "Search field");
    private final ILabel cityName = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvCityItemName"), "Name of city");
    private final static String SearchBox = "com.zdv.secretcloset:id/tvTitle";

    public SearchScreen() {
        super(By.id(SearchBox), "Search screen");
    }

    public void typeInSearchField(String nameOfCity){
        searchField.clearAndType(nameOfCity);
    }

    public void selectCity() {
        cityName.click();
    }

}
