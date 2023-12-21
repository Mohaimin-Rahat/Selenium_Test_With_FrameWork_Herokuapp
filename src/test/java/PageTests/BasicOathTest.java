package PageTests;

import Base.TestUtilities;
import Pages.BasicOath;
import Pages.WelcomePage;
import org.testng.annotations.Test;

public class BasicOathTest extends TestUtilities {
    @Test
    public void basicOathTest(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        BasicOath basicOath=welcomePage.clickBasicOath();
        basicOath.giveUserPass();
        basicOath.verifyHeader();
    }
}
