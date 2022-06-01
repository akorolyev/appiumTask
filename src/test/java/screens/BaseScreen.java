package screens;

import org.openqa.selenium.By;

public abstract class BaseScreen {
    private final By locator;

    private final String name;

    protected BaseScreen(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }
}
