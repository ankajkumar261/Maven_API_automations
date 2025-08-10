package EX_05_TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_parameter {

    @Test
    @Parameters("browser")
    public void demo(String value){

        System.out.println("hi");
        System.out.println("im running the parameter");

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("running chrome");
        }
        if (value.equalsIgnoreCase("firefox")) {
            System.out.println("running firefox");
        }
        if( value.equalsIgnoreCase("safari")){
            System.out.println("running safari");
        }


    }

}
