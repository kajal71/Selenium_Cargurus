package cargurudotcom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


/**
 * Created by RABIN on 4/19/2019.
 */
public class NewCarSearchResultPage {
    @FindBy(how = How.CSS, using = "newSearchHeaderForm_NewCar [cg-name^='ign-makerId']")
    WebElement    allMakeDropdown;

    public void verifyNewCarSerchMakeDropdown(String make) {
        Select select = new Select(allMakeDropdown);
        WebElement option = select.getFirstSelectedOption();
        String defaultItem = option.getText();
        System.out.println(defaultItem);
        Assert.assertEquals(defaultItem,make);

    }
}
