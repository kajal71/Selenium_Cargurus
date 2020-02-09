package cargurudotcom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RABIN on 4/7/2019.
 */
public class CarGurusHomepage {
    @FindBy(how = How.LINK_TEXT, using = "Used Cars") private WebElement usedCarElement;
    @FindBy(how = How.LINK_TEXT, using = "New Cars") private WebElement newCarElement;

    public UsedCarPage clickOnUsedCar(){
        usedCarElement.click();
        return PageFactory.initElements(Browser.driver, UsedCarPage.class);
    }
    public NewCarPage clickOnNewCar(){
        newCarElement.click();
        return PageFactory.initElements(Browser.driver, NewCarPage.class);
    }

    }

