package Pages;

import Pages.BasePageObject;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckboxPage extends BasePageObject {

    private By checkBoxHeader = By.tagName("h3");

    private By checkStatus1 = By.xpath("(//div[@class='example']/form/input)[1]");

    private By checkStatus2 = By.xpath("(//div[@class='example']/form/input)[2]");
    public CheckboxPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    public void headerVerify( ){

        Assert.assertEquals(getText(checkBoxHeader),"Checkboxes");
    }
    public void selectCheckbox(){

       if(!driver.findElement(checkStatus1).isSelected()){
           click(checkStatus1);
       }
       else {
           System.out.println("Already Selected");
       }
        if(!driver.findElement(checkStatus2).isSelected()){
           click(checkStatus2);
        }
        else {
            System.out.println("Already Selected");
        }
       driver.close();
    }

}