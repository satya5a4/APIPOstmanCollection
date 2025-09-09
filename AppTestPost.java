package com.example;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AppTestPost {
    public void postExample() {
        // Implementation for POST request testing
        given()
             .baseUri("https://api.example.com")
             .header("Content-Type", "application/json")
             .body("{\"name\":\"John\", \"job\":\"Developer\"}")
        .when()
             .post("/users")
        .then()
            .statusCode(201)
            .body("name", equalTo("John"));
    }
}
