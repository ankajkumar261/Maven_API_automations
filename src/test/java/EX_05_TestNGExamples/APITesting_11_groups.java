package EX_05_TestNGExamples;

import org.testng.annotations.Test;

public class APITesting_11_groups {

    @Test(groups = {"santiy"})
    public void santiy(){
        System.out.println("sanity");
    }

    @Test(groups = {"reg"})
    public void reg(){
        System.out.println("reg");
    }

    @Test(groups = {"smoke"})
    public void smoke(){
        System.out.println("Smoke");
    }



}
