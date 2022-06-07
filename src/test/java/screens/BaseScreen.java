package screens;

import org.openqa.selenium.By;

public abstract class BaseScreen {
    private final By LOCATOR;

    private final String NAME;

    protected BaseScreen(By locator, String name) {
        this.LOCATOR = locator;
        this.NAME = name;
    }
}
