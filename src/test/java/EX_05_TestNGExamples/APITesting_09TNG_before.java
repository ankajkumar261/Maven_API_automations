package EX_05_TestNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_09TNG_before {

    @BeforeTest
    public void beforetest(){

        System.out.println("executing before the testcase");
    }


    @Test
    public void maintestcase(){
        System.out.println("test case main");
    }


    @AfterTest
    public void aftertestcase(){
        System.out.println("executing after the case");
    }

}
