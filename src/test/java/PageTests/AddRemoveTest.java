package PageTests;

import Base.TestUtilities;
import Pages.AddRemove;
import Pages.CheckboxPage;
import Pages.WelcomePage;
import org.testng.annotations.Test;

public class AddRemoveTest extends TestUtilities {

    @Test
    public void addRemove(){
        WelcomePage welcomePage = new WelcomePage(driver, log);

        AddRemove addRemove = welcomePage.clickAddRemovePage();
        addRemove.headerVerify();
        addRemove.pressClick();
        addRemove.testResult();
    }
}
