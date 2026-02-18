package Utilities;

import org.testng.annotations.DataProvider;

public class DataProvdersForLogin {

    @DataProvider(name ="invalidUsers")
    public static Object[][] invalidUsers() {

        return new Object[][] {
            {"invalid1@gmail.com", "123456"},
            {"invalid2@gmail.com", "abcdef"}
        };
    }
}
