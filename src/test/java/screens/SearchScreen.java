package screens;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.ElementType;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import org.openqa.selenium.By;

import java.util.AbstractQueue;
import java.util.List;

public class SearchScreen extends BaseScreen {

    private final ITextBox searchField = AqualityServices.getElementFactory().getTextBox(By.id("com.zdv.secretcloset:id/etSearchTest"), "Search field");
    private final ILabel cityName = AqualityServices.getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvCityItemName"), "Name of city");
    private final static String CONSTRUCTOR = "com.zdv.secretcloset:id/tvTitle";

    public SearchScreen() {
        super(By.id(CONSTRUCTOR), "Search screen");
    }


    public void typeInSearchField(String nameOfCity){
        searchField.clearAndType(nameOfCity);
    }

    public void selectCity() {
        cityName.click();
    }



    //id searchbox
    //com.zdv.secretcloset:id/etSearchTest
    //id Athens
    //com.zdv.secretcloset:id/tvCityItemName
    //element with discount (resource-id com.zdv.secretcloset:id/ivProductPic)
    ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView
    //id of element com.zdv.secretcloset:id/tvItemBrand
    // com.zdv.secretcloset:id/tvItemOriginalPrice
    //com.zdv.secretcloset:id/tvItemPrice
    //com.zdv.secretcloset:id/tvItemDiscount
    //com.zdv.secretcloset:id/ivSellerAvatar
    //com.zdv.secretcloset:id/tvItemSellerCity
    // class for sellerName android.widget.TextView

}
