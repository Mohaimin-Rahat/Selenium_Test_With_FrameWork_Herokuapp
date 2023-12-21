package Pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DynamicLoading extends BasePageObject{
    public DynamicLoading(WebDriver driver, Logger log){
        super(driver, log);
    }
    private By header=By.tagName("h3");
    private By ex1=By.linkText("Example 1: Element on page that is hidden");
    private By headerEX1=By.tagName("h4");
    private By btnEx1=By.tagName("button");
    private By resultEx1=By.xpath("//div[@id='finish']/h4");
    private By ex2=By.linkText("Example 2: Element rendered after the fact");
    private By headerEX2=By.tagName("h4");
    private By btnEx2=By.tagName("button");
    private By resultEx2=By.xpath("//div[@id='finish']/h4");

    public void headerVerify(){
        Assert.assertEquals(getText(header),"Dynamically Loaded Page Elements");
    }
    public void executeEx1() throws InterruptedException {
        click(ex1);
        Assert.assertEquals(getText(headerEX1),"Example 1: Element on page that is hidden");
        click(btnEx1);
        Thread.sleep(5000);
        Assert.assertEquals(getText(resultEx1),"Hello World!");
        driver.navigate().back();
    }
    public void executeEx2() throws InterruptedException {
        click(ex2);
        Assert.assertEquals(getText(headerEX2),"Example 2: Element rendered after the fact");
        click(btnEx2);
        Thread.sleep(5000);
        Assert.assertEquals(getText(resultEx2),"Hello World!");
        driver.close();
    }




}
