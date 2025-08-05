package EX_03_RA_allureReports;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APItesting_05_testNG {

    String pincode;


   @Test
    public void test_tc1_pincode_valid() {

        pincode ="176053";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ pincode)
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(200);

    }
    @Test
    public void test_tc2_pincode_INvalid() {
        pincode ="176053";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ pincode)
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(201);

    }
    @Test
    public void test_tc3_pincode_invalid() {
        pincode =" ";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ pincode)
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(201);
    }
}
