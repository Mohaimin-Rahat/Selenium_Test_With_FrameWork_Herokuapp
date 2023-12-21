package Pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WelcomePage extends BasePageObject {
    // WebDriver driver;

    private By formAuthenticationLocator = By.linkText("Form Authentication");

    private By checkBoxLocator = By.linkText("Checkboxes");

    private By addRemove= By.linkText("Add/Remove Elements");
    private By basicOath=By.linkText("Basic Auth");
    private By Digestaoth=By.linkText("Digest Authentication");
    private By Dragdorp= By.linkText("Drag and Drop");
    private By DropDown= By.linkText("Dropdown");
    private By DynamicContent= By.linkText("Dynamic Content");
    private By DynamicLoading=By.linkText("Dynamic Loading");
    private By FileUpload=By.linkText("File Upload");

    public WelcomePage(WebDriver driver, Logger log){
        super(driver, log);
    }
    public FormAuthentication clickFormAuthenticationButton(){
        click(formAuthenticationLocator);
        return new FormAuthentication(driver, log);
    }
    public CheckboxPage clickCheckboxesPage(){
        click(checkBoxLocator);
        return new CheckboxPage(driver, log);
    }
    public AddRemove clickAddRemovePage(){
        click(addRemove);
        return new AddRemove(driver, log);
    }
    public BasicOath clickBasicOath(){
        click(basicOath);
        return new BasicOath(driver, log);
    }
    public DigestAuth clickDigestAuth(){
        click(Digestaoth);
        return new DigestAuth(driver,log);
    }
    public DragDrop clickDragDrop(){
        click(Dragdorp);
        return new DragDrop(driver,log);
    }
    public DropDown clickDropDown(){
        click(DropDown);
        return new DropDown(driver,log);
    }
    public DynamicContent clickDynamicContent(){
        click(DynamicContent);
        return new DynamicContent(driver,log);
    }
    public DynamicLoading clickDynamicLoading(){
        click(DynamicLoading);
        return new DynamicLoading(driver,log);
    }

    public  FileUpload clickFileUpload(){
        click(FileUpload);
        return new FileUpload(driver,log);
    }

}