package EX_05_TestNGExamples.Parallel.methodlevel;

import org.testng.annotations.Test;

public class loginvaild {

    @Test
    public void login_vaild(){
        System.out.println("vaild - threads" + Thread.currentThread().getId());
    }

    @Test
    public void login_INvaild(){
        System.out.println("INvaild - threads" + Thread.currentThread().getId());
    }

    @Test
    public void login_invaild(){
        System.out.println("invaild - threads" + Thread.currentThread().getId());
    }
}
