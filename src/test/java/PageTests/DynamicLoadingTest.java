package PageTests;

import Base.TestUtilities;
import Pages.DynamicLoading;
import Pages.WelcomePage;
import org.testng.annotations.Test;

public class DynamicLoadingTest extends TestUtilities {
    @Test
    public void dynamicLoadingTest() throws InterruptedException {
        WelcomePage welcomePage=new WelcomePage(driver,log);
        DynamicLoading dynamicLoading=welcomePage.clickDynamicLoading();
        dynamicLoading.headerVerify();
        dynamicLoading.executeEx1();
        dynamicLoading.executeEx2();
    }
}
