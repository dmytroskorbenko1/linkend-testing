package pages;

import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {
    private final static By SIGN_IN_BUTTON = By.className("sign-in-form__submit-button");
    private final static By EMAIL_FIELD = By.id("session_key");
    private final static By PASSWORD_FIELD = By.id("session_password");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public HomePage signIn(User user) {
        getEmailField().sendKeys(user.getEmail());
        getPasswordField().sendKeys(user.getPassword());
        getSignInButton().click();
        return new HomePage(driver);
    }

    private WebElement getEmailField() {
        return driver.findElement(EMAIL_FIELD);
    }

    private WebElement getPasswordField() {
        return driver.findElement(PASSWORD_FIELD);
    }

    private WebElement getSignInButton() {
        return driver.findElement(SIGN_IN_BUTTON);
    }
}
