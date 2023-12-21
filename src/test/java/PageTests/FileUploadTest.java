package PageTests;

import Base.TestUtilities;
import Pages.FileUpload;
import Pages.WelcomePage;
import org.testng.annotations.Test;

public class FileUploadTest extends TestUtilities {
    @Test
    public void fileUploadTest(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        FileUpload fileUpload=welcomePage.clickFileUpload();
        fileUpload.headerVerify();
        fileUpload.uploadFile();
    }
}
