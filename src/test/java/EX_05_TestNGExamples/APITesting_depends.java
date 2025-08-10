package EX_05_TestNGExamples;

import org.testng.annotations.Test;

public class APITesting_depends {

@Test
public void beforetestcase(){
    System.out.println("i will  before testcase");
}
@Test(dependsOnMethods = "beforetestcase")
public void testcase1(){
    System.out.println("testcase one");
}

public void testcase2(){
    System.out.println("testcase two");
}



}
