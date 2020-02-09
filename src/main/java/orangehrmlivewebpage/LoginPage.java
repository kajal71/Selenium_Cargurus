package orangehrmlivewebpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage {
    @FindBy(how = How.ID, using = "txtUsername") private WebElement userName;
    @FindBy(how = How.ID, using = "txtPassword") private WebElement passWord;
    @FindBy(how = How.ID, using = "btnLogin") private WebElement loginButton;
    @FindBy(how = How.ID, using = "spanMessage") private WebElement invalidCredMsg;
  /*  public DashBoardPage loginToHomePageWithValidInfo(String userName, String passWard){
        this.userName.sendKeys(userName);
        this.passWord.sendKeys(passWard);
        loginButton.click();
        return PageFactory.initElements(Browser.getDriver(), DashBoardPage.class);

    }
    public LoginPage loginToHomePageWithInvalidInfo(String userName, String passWord){
        this.userName.sendKeys(userName);
        this.passWord.sendKeys(passWord);
        loginButton.click();
        return this;
    }*/
    public void loginToHomePage(String userName, String passWord) {
      this.userName.sendKeys(userName);
      this.passWord.sendKeys(passWord);
      loginButton.click();
  }
    public LoginPage verifyInvalidMessageShowsUp(){
        Assert.assertEquals(invalidCredMsg.getText(), "Invalid credentials");
        Assert.assertTrue(invalidCredMsg.isDisplayed());
        return this;
    }


}
