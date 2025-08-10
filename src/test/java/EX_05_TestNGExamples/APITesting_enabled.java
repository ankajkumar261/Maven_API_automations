package EX_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_enabled {

@Test(enabled = false)
    public void testcase1(){
        System.out.println("testcase1");
    }
@Test
    public void testcase2(){
        System.out.println("testcase2");
    }

    public void testcase3(){
        System.out.println("testcase1");
        Assert.assertTrue(true);
    }




}
