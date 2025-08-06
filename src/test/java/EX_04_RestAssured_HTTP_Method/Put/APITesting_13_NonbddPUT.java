package EX_04_RestAssured_HTTP_Method.Put;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_13_NonbddPUT {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
@Test
    public void testcaseput(){
        String bookingid = "3333";
        String token = "f59075090cd75cd";



        String payload = "{\n" +
                "    \"firstname\" : \"Ankaj\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

         r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);
        r.contentType("application/json");
        r.cookie("token", token);
        r.body(payload).log().all();

        response = r.when().log().all().put();

        vr = response.then().log().all();
        vr.statusCode(200);

    }
}
