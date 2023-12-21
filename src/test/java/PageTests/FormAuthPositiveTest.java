package PageTests;

import Base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.FormAuthentication;
import Pages.WelcomePage;

public class FormAuthPositiveTest extends TestUtilities {


    @Test
    public void testLoginPage(){
        WelcomePage welcomePage = new WelcomePage(driver, log);

        FormAuthentication loginPage = welcomePage.clickFormAuthenticationButton();

        loginPage.loginWithCredentials("tomsmith", "SuperSecretPassword!");

        Assert.assertTrue(loginPage.getSuccessText(), "You logged into a secure area!");



    }



}