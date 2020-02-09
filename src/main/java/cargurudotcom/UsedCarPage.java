package cargurudotcom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by RABIN on 4/14/2019.
 */
public class UsedCarPage {
    @FindBy(how = How.CSS, using = ".ft-make-selector") private WebElement allMakesDropdown;
    @FindBy(how = How.CSS, using = ".ft-model-selector") private WebElement allModelsDropdown;
    @FindBy(how = How.CSS, using = "[cg-name^='ign-carId']") private WebElement firstAllYear;
    @FindBy(how = How.CSS, using = "[cg-name^='ign-car2Id']") private WebElement secondAllYear;
    @FindBy(how = How.NAME, using = "zip") private WebElement zipText;
    @FindBy(how = How.ID, using = "newSearchHeaderForm_UsedCar_distance") private WebElement radiasDropdown;
    @FindBy(how = How.CSS, using = "[value='Search']") private WebElement searchButton;

    public UsedCarPage searchUsedCar(String makes,
                                     String model,
                                     String firstYear,
                                     String secondYear,
                                     String zip,
                                     String radias) {
        selectFromDropdown(allMakesDropdown, makes);
        selectFromDropdown(allModelsDropdown, model);
        selectFromDropdown(firstAllYear, firstYear);
        selectFromDropdown(secondAllYear, secondYear);
        zipText.sendKeys(zip);
        selectFromDropdown(radiasDropdown,radias);
        searchButton.click();

        return this;

    }
    private void selectFromDropdown(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
}