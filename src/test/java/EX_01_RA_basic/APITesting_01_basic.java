package EX_01_RA_basic;

import io.restassured.RestAssured;

public class APITesting_01_basic {
    public static void main(String[] args) {

        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(201);


    }
}
