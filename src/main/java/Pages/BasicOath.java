package Pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasicOath extends BasePageObject{
    public BasicOath(WebDriver driver, Logger log) {super(driver, log);}
    private By header=By.tagName("h3");
    private By result=By.tagName("p");

    public void giveUserPass(){
        String authUrl = "https://" + "admin" + ":" + "admin"+ "@the-internet.herokuapp.com/basic_auth";
        driver.get(authUrl);
    }
    public  void verifyHeader(){

        Assert.assertEquals(getText(header),"Basic Auth");
        Assert.assertEquals(getText(result),"Congratulations! You must have the proper credentials.");
        driver.close();
    }

}
