package carguruwebside;

import cargurudotcom.Browser;
import org.testng.annotations.Test;

/**
 * Created by RABIN on 4/4/2019.
 */
public class TestUsedCars {
    @Test
    public void testCar1(){
        Browser.startBrowser().clickOnUsedCar().searchUsedCar("Ford", "Edge", "2008", "2018","11373","50 mi");
    }
    @Test
    public void testCar2(){
        Browser.startBrowser().clickOnNewCar().searchNewCar("Acura", "MDX", "2019",
                "SH-AWD","70 mi", "11393").verifyNewCarSerchMakeDropdown("SH-AWD");
    }
}
