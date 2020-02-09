package cargurudotcom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by RABIN on 4/4/2019.
 */
public class Browser {

   public static WebDriver driver = null;

    public static CarGurusHomepage startBrowser(){
      WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.cargurus.com/");
        return PageFactory.initElements(driver, CarGurusHomepage.class);
    }


    public void closeBrowser(){
        driver.close();
        driver.quit();

    }
}
