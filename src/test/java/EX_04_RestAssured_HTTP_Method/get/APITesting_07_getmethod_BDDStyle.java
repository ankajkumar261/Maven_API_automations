package EX_04_RestAssured_HTTP_Method.get;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_07_getmethod_BDDStyle {


    @Test
    public void test_tc1_pincode_valid() {

        String pincode;


        pincode = "176053";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(200);

    }
}