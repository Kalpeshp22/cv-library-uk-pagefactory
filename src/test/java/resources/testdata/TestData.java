package resources.testdata;
// send as many data as needed

import org.testng.annotations.DataProvider;
import uk.co.library.utility.Utility;

/**
 * Created by Jay
 */
public class TestData  extends Utility {

//    @DataProvider(name = "jobData")
//    public Object [][] getData (){
//        Object [][] data = new Object[][]{
//                {"Tester", "Harrow", "up to 5 miles", "30000", "50000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
//                {"Automation Tester", "Wembley, Greater London", "up to 10 miles", "40000", "50000", "Per annum", "Permanent", "Permanent Automation Tester jobs in Wembley"},
//                {"Tester", "Wembley, Greater London", "up to 15 miles", "40000", "50000", "Temporary", "Temporary Tester jobs in Wembley"},
//                {"Manual Tester", "Birmingham", "up to 5 miles", "30000", "45000", "Permanent", "Permanent Manual Tester jobs in Birmingham"},
//                {"Automation Tester", "Hayes", "up to 35 miles", "40000", "55000", "Any", "Automation Tester jobs in Hayes"},
//                {"Automation Engineer", "Slough", "up to 2 miles", "3500", "5500", "Permanent", "Permanent Automation Engineer jobs in Slough"},
//                {"Tester", "London", "up to 15 miles", "50000", "60000", "Contract", "Contract Tester jobs in London"},
//        };
//        return data;
//    }
    @DataProvider(name = "jobData")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Test Analyst", "London", "up to 15 miles", "40000", "50000", "Per annum", "Contract", "Contract Test Analyst jobs in London"},
                {"IT", "Harrow", "up to 7 miles", "400", "600", "Per day", "Contract", "It jobs in Harrow on the Hill"},
                {"Automation Engineer", "Birmingham, Greater London", "up to 5 miles", "30000", "60000", "Per annum", "Permanent", "Permanent Accountant jobs in Birmingham"},
                {"Tester", "Watford, Hertfordshire", "up to 5 miles", "40000", "60000", "Per annum", "Contract", "Contract Tester jobs in Watford"},
                {"Manual Tester", "Slough", "up to 10 miles", "35000", "50000", "Per annum", "Permanent", "Permanent Retail Manager jobs in Slough"},
                {"Automation Tester", "London", "up to 7 miles", "400", "700", "Per day", "Contract", "Contract Automation Tester jobs in London"},
        };
        return data;
    }

}
