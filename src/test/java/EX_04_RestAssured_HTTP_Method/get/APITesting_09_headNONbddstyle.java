package EX_04_RestAssured_HTTP_Method.get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_09_headNONbddstyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
   @Test
    public void TestcaseHead(){

        String pincode = "176053";

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        response = r.when().log().all().head();

        vr = response.then().log().all().statusCode(200);



    }




}
