package elements;

import data.MenuItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenu {
    private WebDriver driver;

    public MainMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void select(MenuItem menuItem) {
        getMenuItem(menuItem).click();
    }

    private WebElement getMenuItem(MenuItem menuItem) {
        By item = By.xpath(
                String.format(".//*[@class = 'global-nav__primary-link-text' and text() = '%1s']",
                        menuItem.getName()));
        return driver.findElement(item);
    }
}
