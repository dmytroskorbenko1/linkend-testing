package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WelcomePage extends BasePage {

    private final static By SIGN_IN_BUTTON = By.xpath(".//*[text() = 'Sign in']");
    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isSignInButtonVisible() {
        return isElementVisible(SIGN_IN_BUTTON);
    }

    private WebElement getSignInButton() {
        return driver.findElement(SIGN_IN_BUTTON);
    }
}
