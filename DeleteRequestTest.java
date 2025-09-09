package com.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DeleteRequestTest {
    @Test
    public void testDeleteRequest() {
        // Example DELETE request
        when()
            .delete("/your-endpoint")
        .then()
            .statusCode(200);
    }
}
