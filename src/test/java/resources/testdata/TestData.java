package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "Register details")
    public Object[][] getData(){
        Object[][]data = new Object[][]{
                {"Henry","Smith", "United Kingdom", "London", "10 Downing Street" , "hr11 3de", "79485647362"},

        };
        return data;
    }

//    @DataProvider(name = "Payment Details")
//    public Object[][] getData1(){
//        Object[][]data = new Object[][]{
//                {"Henry","Smith", "United Kingdom", "London", "10 Downing Street" , "hr11 3de", "79485647362"},
//
//        };
//        return data;
//    }

}
