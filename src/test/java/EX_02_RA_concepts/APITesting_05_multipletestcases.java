package EX_02_RA_concepts;

import io.restassured.RestAssured;

public class APITesting_05_multipletestcases {

    public static void main(String[] args) {

        String pincode;

        pincode ="176053";

        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ pincode)
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(201);

        pincode ="@";

        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ pincode)
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(201);


        pincode =" ";

        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ pincode)
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(201);
    }

}
