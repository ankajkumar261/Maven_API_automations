package EX_04_RestAssured_HTTP_Method.get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_08_nonBDDstyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_get_nonBDD(){

        String pincode = "176053";
        //part1
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        //Part2
        response = r.when().log().all().get();

        //part3
        vr = response.then().log().all();
                vr.statusCode(200);




    }


}
