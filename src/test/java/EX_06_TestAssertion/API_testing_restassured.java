package EX_06_TestAssertion;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class API_testing_restassured {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String bookingid;


@Test
    public void create_booking(){

        String payload ="{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType("application/json");
        requestSpecification.body(payload).log().all();


        response = requestSpecification.when().log().all().post();


        validatableResponse= response.then().log().all();
        validatableResponse.statusCode(200);

        validatableResponse.body("bookingid",Matchers.notNullValue());
        validatableResponse.body("booking.firstname", Matchers.equalTo("Jim"));
        validatableResponse.body("booking.lastname", Matchers.equalTo("Brown"));



    }
}
