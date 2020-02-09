package cargurudotcom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by RABIN on 4/19/2019.
 */
public class NewCarPage {
    @FindBy(how = How.CSS, using = "[id$='_makerSelect']") private WebElement allMakeDropdown;
    @FindBy(how = How.CSS, using = "[id$='_modelSelect']") private WebElement allModelsDropdown;
    @FindBy(how = How.CSS, using = "[id$='_year1Select']") private WebElement allYearsDropdown;
    @FindBy(how = How.CSS, using = "[id$='_trimSelect']") private WebElement allTrimsDropdown;
    @FindBy(how = How.ID, using = "distance") private WebElement distanceDropdown;
    @FindBy(how = How.ID, using = "stepOneSearchZip") private WebElement zipSearch;
    @FindBy(how = How.ID, using = "submitTopicForm_0") private WebElement submitButton;

    public NewCarSearchResultPage searchNewCar(String make,
                                               String model,
                                               String year,
                                               String trim,
                                               String distance,
                                               String zip){
        selectFromDropdown(allMakeDropdown, make);
        selectFromDropdown(allModelsDropdown, model);
        selectFromDropdown(allYearsDropdown, year);
        selectFromDropdown(allTrimsDropdown, trim);
        zipSearch.sendKeys(zip);
        submitButton.click();
        return PageFactory.initElements(Browser.driver, NewCarSearchResultPage.class);

    }
    private void selectFromDropdown(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
}
