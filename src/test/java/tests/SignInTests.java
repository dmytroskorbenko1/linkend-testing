package tests;

import data.MenuItem;
import data.User;
import elements.MainMenu;
import elements.MeMenu;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WelcomePage;

public class SignInTests extends BaseTest {

    HomePage homePage;
    User user = User.TEST_USER;

    @Test
    public void validateUserIsAbleToSignIn() {
        homePage = signInPage.signIn(user);
        Assert.assertEquals(homePage.getUserName(), user.getFullName(), "Incorrect user name");
    }

    @Test
    public void validateUserIsAbleToSignOut() {
        homePage = signInPage.signIn(user);
        new MainMenu(driver).select(MenuItem.ME);
        new MeMenu(driver).clickMenuItem("Sign Out");
        Assert.assertTrue(new WelcomePage(driver).isSignInButtonVisible(), "User still signed in");
    }
}
