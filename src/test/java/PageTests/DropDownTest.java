package PageTests;

import Base.TestUtilities;
import Pages.DropDown;
import Pages.WelcomePage;
import org.testng.annotations.Test;

public class DropDownTest extends TestUtilities {
    @Test
    public void dropDownTest(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        DropDown dropDown=welcomePage.clickDropDown();
        dropDown.verifyHeader();
        dropDown.selectOption1();
        dropDown.verifyOption1();
        dropDown.selectOption2();
        dropDown.verifyOption2();
    }
}
