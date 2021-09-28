package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private final static By PROFILE_NAME_LINK = By.className("profile-rail-card__actor-link");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getUserName() {
        return getProfileLink().getText();
    }

    private WebElement getProfileLink() {
        return driver.findElement(PROFILE_NAME_LINK);
    }



}
