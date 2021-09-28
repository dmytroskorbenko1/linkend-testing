package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MeMenu {

    private final static By MENU = By.className("artdeco-dropdown__content-inner");

    WebDriver driver;
    WebElement menu;

    public MeMenu(WebDriver driver) {
        this.driver = driver;
        menu = driver.findElement(MENU);
    }

    public void clickMenuItem(String menuItem) {
        menu.findElement(By.xpath(String.format(".//*[text() = '%1s']", menuItem))).click();
    }


}
