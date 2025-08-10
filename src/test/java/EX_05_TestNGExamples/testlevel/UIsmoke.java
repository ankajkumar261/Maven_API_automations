package EX_05_TestNGExamples.testlevel;

import org.testng.annotations.Test;

public class UIsmoke {


    @Test
    public void test_UI_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }
}
