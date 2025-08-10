package EX_05_TestNGExamples.Parallel.browser;

import org.testng.annotations.Test;

public class firefox {

@Test
    public void testcase1(){
        System.out.println("testcase1");
        System.out.println(Thread.currentThread().getId());
    }

    @Test
    public void testcase2(){
        System.out.println("testcase2");
        System.out.println(Thread.currentThread().getId());
    }

}
