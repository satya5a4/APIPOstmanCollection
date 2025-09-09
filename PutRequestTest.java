package com.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutRequestTest {
    @Test
    public void testPutRequest() {
        // Example PUT request
        given()
            .header("Content-Type", "application/json")
            .body("{\"key\":\"newValue\"}")
        .when()
            .put("/your-endpoint")
        .then()
            .statusCode(200);
    }
}
