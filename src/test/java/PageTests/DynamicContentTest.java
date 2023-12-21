package PageTests;

import Base.TestUtilities;
import Pages.CheckboxPage;
import Pages.DynamicContent;
import Pages.WelcomePage;
import org.testng.annotations.Test;

public class DynamicContentTest extends TestUtilities {
    @Test
    public void dynamicContentTest(){
        WelcomePage welcomePage = new WelcomePage(driver, log);

        DynamicContent dynamicContent = welcomePage.clickDynamicContent();
        dynamicContent.verifyHeader();
        dynamicContent.performContent();
    }
}
