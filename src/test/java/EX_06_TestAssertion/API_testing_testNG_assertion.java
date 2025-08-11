package EX_06_TestAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class API_testing_testNG_assertion {


@Test
    public void test_hard(){
        System.out.println("start the program");
        Assert.assertEquals("Ankaj", "ankaj");
        System.out.println("end the program");
    }

    @Test
    public void test_soft(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Ankaj", "ankaj");
        System.out.println("end of all program");
        softAssert.assertAll();
    }




}
