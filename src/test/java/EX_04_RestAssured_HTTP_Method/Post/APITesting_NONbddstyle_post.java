package EX_04_RestAssured_HTTP_Method.Post;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_NONbddstyle_post {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

@Test
    public void testcase(){

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        System.out.println("step1");

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType("application/json");
        r.body(payload).log().all();

        System.out.println("step2");

        response = r.when().log().all().post();

        System.out.println("step3");

        vr = response.then().log().all().statusCode(200);








}


}

