package orangehrmlivewebpage;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name = "validLoginInfo")
    public static Object[][] getValidLoginInfo(){
        return new Object[][] { {"Admin", "admin123"}};

    }

    @DataProvider(name = "invalidLoginInfo")
    public static Object[][] getInvalidLoginInfo(){
        return new Object[][] { {"Admin1", "admin123"},  {"admin", "admin1"}, {"Admin123", "admin123"}};

    }
}
