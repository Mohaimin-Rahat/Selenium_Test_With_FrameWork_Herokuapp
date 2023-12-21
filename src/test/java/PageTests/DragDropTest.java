package PageTests;

import Base.TestUtilities;
import Pages.DragDrop;
import Pages.WelcomePage;
import org.testng.annotations.Test;

public class DragDropTest extends TestUtilities {
    @Test
    public void dragDropTest(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        DragDrop dragDrop =welcomePage.clickDragDrop();
        dragDrop.verifyHeader();
        dragDrop.action();
        dragDrop.verifyResult();

    }






}
