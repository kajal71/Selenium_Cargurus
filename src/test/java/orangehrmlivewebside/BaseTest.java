package orangehrmlivewebside;



import orangehrmlivewebpage.Browser;
import orangehrmlivewebpage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver ;

    @BeforeMethod
    public void startTest(){
        Browser.openBrowser();
        driver = Browser.getDriver();
    }

    @AfterMethod
    public void finishTest(){
        driver.close();
        driver.quit();
    }

    public LoginPage navigateToLoginPage(){
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        return PageFactory.initElements(driver, LoginPage.class);
    }
    public <T> T nextPage(Class<T> clazz){
        return PageFactory.initElements(driver, clazz);
    }
}

