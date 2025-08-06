package EX_04_RestAssured_HTTP_Method.Post;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APiTesting_11_bddStylePut {

@Test
    public void testcase1(){
         String payload = "{\n" +
                 "    \"username\" : \"admin\",\n" +
                 "    \"password\" : \"password123\"\n" +
                 "}";

        RestAssured.given()
        .baseUri("https://restful-booker.herokuapp.com")
        .basePath("/auth")
                .contentType("application/json")
                .body(payload).log().all()

                .when().log().all().post()

                .then().log().all().statusCode(200);





    }

}
