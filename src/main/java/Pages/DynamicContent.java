package Pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DynamicContent extends BasePageObject{
    public DynamicContent(WebDriver driver, Logger log) {super(driver, log);}
    private By header=By.tagName("h3");
    private By press=By.linkText("click here");

    public void verifyHeader(){
        Assert.assertEquals(getText(header),"Dynamic Content");
    }
    public void performContent(){
        String pageSourceBeforeReload = driver.getPageSource();
        click(press);
        String pageSourceAfterReload = driver.getPageSource();
        Assert.assertNotSame(pageSourceBeforeReload,pageSourceAfterReload);
        driver.close();
    }
}
