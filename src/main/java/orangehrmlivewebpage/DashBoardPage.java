package orangehrmlivewebpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {
    @FindBy(how = How.ID, using = "welcome") private WebElement welcomeAdminElement;
    @FindBy(how = How.LINK_TEXT, using = "Logout") private WebElement logoutLink;
    @FindBy(how = How.LINK_TEXT, using = "About") private WebElement aboutLink;

    public void verifyLogoutAndAboutLinkPresent(){
        welcomeAdminElement.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println (logoutLink.isDisplayed());
        System.out.println(aboutLink.isDisplayed());
    }
}
