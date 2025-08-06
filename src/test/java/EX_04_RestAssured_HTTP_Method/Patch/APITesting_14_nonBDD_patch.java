package EX_04_RestAssured_HTTP_Method.Patch;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_14_nonBDD_patch {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void testcaseput() {
        String bookingid = "3333";
        String token = "f59075090cd75cd";


        String payload = "{\n" +
                "    \"firstname\" : \"Ankit\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType("application/json");
        r.cookie("token", token);
        r.body(payload).log().all();

        response = r.when().log().all().patch();

        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
