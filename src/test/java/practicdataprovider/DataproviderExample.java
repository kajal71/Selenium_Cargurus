package practicdataprovider;

import orangehrmlivewebpage.CustomDataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {
    @Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String email, String pwd){
      System.out.println(email+"  "+pwd );
    }

}
