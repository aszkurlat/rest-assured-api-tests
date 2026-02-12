import static io.restassured.RestAssured.*;
import org.junit.jupiter.api.Test;

public class BasicTest {
    //first example
    @Test
    void shouldReturn200() {
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .log().all()
                .statusCode(200);
    }
}
