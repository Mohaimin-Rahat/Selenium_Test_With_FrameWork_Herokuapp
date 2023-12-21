package Pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragDrop extends BasePageObject{
    public DragDrop(WebDriver driver, Logger log) {
        super(driver, log);
    }
    private By header=By.tagName("h3");
    private By elementA=By.xpath("//div[@id='column-a']");
    private By elementB=By.xpath("//div[@id='column-b']");
    private By verifyB=By.xpath("//div[@id='column-a']/header");
    private By verifyA=By.xpath("//div[@id='column-b']/header");

    public void verifyHeader(){
        Assert.assertEquals(getText(header),"Drag and Drop");
    }
    public void verifyResult(){

        Assert.assertEquals(getText(verifyB),"B");
        Assert.assertEquals(getText(verifyA),"A");
    }
    public void action(){
        WebElement A=driver.findElement(elementA);
        WebElement B=driver.findElement(elementB);
        Actions act=new Actions(driver);
        //Dragged and dropped.
        act.dragAndDrop(A,B).build().perform();
    }

}
