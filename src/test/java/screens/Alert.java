package screens;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public abstract class Alert extends Screen {

    private final ILabel MESSAGE_LABEL;
    private final IButton OK_BUTTON;

    protected Alert(By locator) {
        super(locator, "Alert");
        MESSAGE_LABEL = getElementFactory().getLabel(getMessageLblLoc(), "Message");
        OK_BUTTON = getElementFactory().getButton(getOkBtnLoc(), "OK");
    }

    protected abstract By getMessageLblLoc();

    protected abstract By getOkBtnLoc();

    public String getMessage() {
        return MESSAGE_LABEL.getText();
    }

    public void tapOk() {
        OK_BUTTON.click();
    }
}
