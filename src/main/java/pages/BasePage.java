package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getItemFromLocalStorage(String key)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        return (String) js.executeScript(String.format(
                "return window.localStorage.getItem('%s');", key));
    }

    protected boolean isElementVisible(By locator) {
        List<WebElement> elements = driver.findElements(locator);
        if (elements.size() > 0) {
            return elements.get(0).isDisplayed();
        }
        return false;
    }
}
