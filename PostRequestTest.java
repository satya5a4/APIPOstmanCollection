package com.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostRequestTest {
    @Test
    public void testPostRequest() {
        // Example POST request
        given()
            .header("Content-Type", "application/json")
            .body("{\"key\":\"value\"}")
        .when()
            .post("/your-endpoint")
        .then()
            .statusCode(200);
    }
}
