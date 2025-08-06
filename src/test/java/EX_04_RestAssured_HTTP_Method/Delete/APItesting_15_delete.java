package EX_04_RestAssured_HTTP_Method.Delete;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APItesting_15_delete {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void testcase_delete(){

        String bookingid = "4235";
        String token = "1cee3a364adc15e";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType("application/json");
        r.cookie("token", token);


        response = r.when().log().all().delete();

        vr = response.then().log().all();
        vr.statusCode(201);



    }

}
