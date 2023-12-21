package Pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddRemove extends BasePageObject{
    public AddRemove(WebDriver driver, Logger log) {
        super(driver, log);
    }
    private By header= By.tagName("h3");
    private By buttonClick= By.tagName("button");
    private By actualValue= By.className("added-manually");

    public void headerVerify(){
        Assert.assertEquals(getText(header),"Add/Remove Elements");
    }
    public void pressClick(){
        click(buttonClick);
    }
    public void testResult(){
        Assert.assertEquals(getText(actualValue),"Delete");
    }

}
