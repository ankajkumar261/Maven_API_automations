package EX_06_TestAssertion;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class API_testing_Assertj {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;

    @Test
    public void test_POST() {

        String payload_POST = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 123,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload_POST).log().all();

        Response response = requestSpecification.when().post();


        // Get Validate response to perform validation
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);


        // Rest Assured -> import org.hamcrest.Matchers; %4-%5
        // Matchers.equalto()

        validatableResponse.body("bookingid", Matchers.notNullValue());
        validatableResponse.body("booking.firstname", Matchers.equalTo("Pramod"));
        validatableResponse.body("booking.lastname", Matchers.equalTo("Dutta"));
        validatableResponse.body("booking.depositpaid", Matchers.equalTo(false));


        // Extraction
        // Concept #1 - Normal( TestNG or Assertj) IS IMP
        bookingId= response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        // Concept #2 - (Jsonpath class) Another mechanism to extract the Keys, value by JSON Path
        JsonPath jp = new JsonPath(response.asString());
        String bookingid1 = jp.getString("bookingid");


        assertThat(jp.getInt("bookingid")).isEqualTo(69);
        assertThat(jp.getString("booking.firstname")).isEqualTo("Jim");
        assertThat(jp.getString("booking.lastname")).isEqualTo("Brown");
        assertThat(jp.getInt("booking.totalprice")).isEqualTo(3000);

        // TestNG - Extract the details of the firstname, bookingId, lastname from Response.
        // TestNG Assertions - 75%
        // SoftAssert vs HardAssert (90%)
        // This means that if any assertion fails,
        // the remaining statements in that test method will not be executed.
        Assert.assertEquals(firstname,"Jim");
        Assert.assertEquals(lastname,"Brown");
        Assert.assertNotNull(bookingId);

        if(!firstname.contains("Pramod")){
            Assert.fail("Failed kar diya Test");
        }



        // AssertJ( 3rd- Lib to Assertions) - 20%

        assertThat(bookingId).isNotZero().isNotNull().isPositive();
        assertThat(firstname).isNotBlank().isNotEmpty().isNotNull().isEqualTo("Pramod");



    }
}
