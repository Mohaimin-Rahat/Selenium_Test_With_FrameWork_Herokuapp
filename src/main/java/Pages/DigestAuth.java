package Pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DigestAuth extends BasePageObject{
    public DigestAuth(WebDriver driver, Logger log) {
        super(driver, log);
    }
    private By header=By.tagName("h3");
    private By result=By.tagName("p");

    public void verifyHeader(){
        Assert.assertEquals(getText(header),"Digest Auth");
        Assert.assertEquals(getText(result),"Congratulations! You must have the proper credentials.");
    }
    public void giveUserPass(){
        String authUrl = "https://" + "admin" + ":" + "admin"+ "@the-internet.herokuapp.com/digest_auth";
        // Navigate to the URL with authentication credentials
        driver.get(authUrl);
    }
}
