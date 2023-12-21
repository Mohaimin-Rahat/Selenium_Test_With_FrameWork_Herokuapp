package Pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDown extends BasePageObject{
    public DropDown(WebDriver driver, Logger log) {
        super(driver, log);
    }
    private By header= By.tagName("h3");
    private By select=By.tagName("select");
    private By option1=By.xpath("//option[@value=1]");
    private By option2=By.xpath("//option[@value=2]");
    public void verifyHeader(){
        Assert.assertEquals(getText(header),"Dropdown List");
    }
    public void selectOption1(){
        Select dropDown=new Select(driver.findElement(select));
        dropDown.selectByVisibleText("Option 1");
    }
    public void selectOption2(){
        Select dropDown=new Select(driver.findElement(select));
        dropDown.selectByVisibleText("Option 2");
    }
    public void verifyOption1(){
        Assert.assertEquals(getText(option1),"Option 1");
    }
    public void verifyOption2(){
        Assert.assertEquals(getText(option2),"Option 2");
        driver.close();
    }

}
