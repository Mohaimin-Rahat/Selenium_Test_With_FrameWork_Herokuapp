package PageTests;

import Base.TestUtilities;
import Pages.DigestAuth;
import Pages.WelcomePage;
import org.testng.annotations.Test;

public class DigestAuthTest extends TestUtilities {
    @Test
    public void digestAuthTest(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        DigestAuth digestAuth=welcomePage.clickDigestAuth();
        digestAuth.giveUserPass();
        digestAuth.verifyHeader();
    }

}
