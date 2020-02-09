package orangehrmlivewebside;

import orangehrmlivewebpage.DashBoardPage;
import orangehrmlivewebpage.DataProviderClass;
import orangehrmlivewebpage.LoginPage;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest{
    @Test(dataProvider = "validLoginInfo", dataProviderClass = DataProviderClass.class)
    public void loginWithValidInfo(String userName, String password) {
        navigateToLoginPage().loginToHomePage(userName, password);
        nextPage(DashBoardPage.class).verifyLogoutAndAboutLinkPresent();
    }
    @Test(dataProvider = "invalidLoginInfo", dataProviderClass = DataProviderClass.class)
    public void loginWithInvalidInfo(String userName, String password) {
        navigateToLoginPage().loginToHomePage(userName, password);
        nextPage(LoginPage.class).verifyInvalidMessageShowsUp();
    }


}
