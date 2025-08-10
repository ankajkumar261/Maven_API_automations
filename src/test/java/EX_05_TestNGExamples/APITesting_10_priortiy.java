package EX_05_TestNGExamples;

import org.testng.annotations.Test;

public class APITesting_10_priortiy {

    @Test(priority = 1)
    public void testcase1(){
        System.out.println("testcase one");
    }

    @Test(priority = 2)

    public void testcase2(){
        System.out.println("testcase two");
    }

    @Test(priority = 3)
    public void testcase3(){
        System.out.println("testcase three");
    }




}
