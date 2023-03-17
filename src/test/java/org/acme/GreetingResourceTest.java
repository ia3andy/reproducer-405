package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void test404() {
        given()
            .body("{}")
            .contentType(ContentType.JSON)
            .when().post("/something").then()
            .statusCode(404);
    }

}