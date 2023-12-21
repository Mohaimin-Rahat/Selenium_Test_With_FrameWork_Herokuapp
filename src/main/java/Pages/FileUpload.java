package Pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FileUpload extends BasePageObject{
    public FileUpload(WebDriver driver, Logger log){
        super(driver, log);}
    private By header = By.tagName("h3");
    private By uploadKey = By.id("file-upload");
    private By submitKey = By.id("file-submit");
    public void headerVerify(){
        Assert.assertEquals(getText(header),"File Uploader");
    }
    public void uploadFile(){
        WebElement uploadElement=driver.findElement(uploadKey);
        uploadElement.sendKeys("/Users/rahat/Downloads/Pic/R.JPG");
        click(submitKey);
        Assert.assertEquals(getText(header),"File Uploaded!");

    }
}
