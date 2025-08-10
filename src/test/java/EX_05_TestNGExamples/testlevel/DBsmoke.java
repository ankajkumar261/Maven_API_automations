package EX_05_TestNGExamples.testlevel;

import org.testng.annotations.Test;

public class DBsmoke {


    @Test
    public void test_DB_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }
}
