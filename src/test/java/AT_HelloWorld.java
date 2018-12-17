import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class AT_HelloWorld {

    public static final int SPARK_DEFAULT_PORT = 4567;

    @BeforeAll
    public static void setUpBeforeClass() {
        HelloWorld.main(new String[]{});
    }

    @Test
    public void hello_world_returns_correct_response() {
        given()
            .port(SPARK_DEFAULT_PORT)
        .when()
            .get("/hello-world")
        .then()
            .statusCode(200)
            .contentType("application/json")
            .body("message", is("Hello World"));
    }
}
