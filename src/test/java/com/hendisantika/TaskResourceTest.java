package com.hendisantika;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-quartz
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/18/23
 * Time: 05:32
 * To change this template use File | Settings | File Templates.
 */
@QuarkusTest
public class TaskResourceTest {

    @Test
    public void tasks() throws InterruptedException {
        Thread.sleep(1000); // wait at least a second to have the first task created
        given()
                .when().get("/tasks")
                .then()
                .statusCode(200)
                .body("size()", is(greaterThanOrEqualTo(1)));
    }
}
