package PageTests;

import Base.TestUtilities;
import Pages.CheckboxPage;
import org.testng.annotations.Test;
import Pages.WelcomePage;

public class CheckboxPositiveTest extends TestUtilities {


    @Test
    public void testCheckbox(){
        WelcomePage welcomePage = new WelcomePage(driver, log);

        CheckboxPage checkbox = welcomePage.clickCheckboxesPage();
        checkbox.headerVerify();
        checkbox.selectCheckbox();


    }



}