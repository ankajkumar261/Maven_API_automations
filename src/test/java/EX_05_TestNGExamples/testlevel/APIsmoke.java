package EX_05_TestNGExamples.testlevel;

import org.testng.annotations.Test;

public class APIsmoke {


    @Test
    public void test_API_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }

}
