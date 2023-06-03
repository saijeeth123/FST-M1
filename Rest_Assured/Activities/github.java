package GITHUBProject;

import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class github {
    private static final String ROOT_URI = "https://api.github.com";

    void before(PactVerificationContext context) {
        // Set target for provider to send request to
        context.setTarget(new HttpTestTarget("localhost", 8585));
    }
    @Test(priority=0)
    public void PostRequest() {
        // Create JSON request
        String reqBody = "{"
                + "\"title\": TestAPIKEY,"
                + "\"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAAAg....\","
                + "}";

        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .body(reqBody) // Add request body
                        .when().post(ROOT_URI); // Send POST request

        // Assertion
        response.then().body("title", equalTo("TestAPIKEY"));
        response.then().body("key", equalTo("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAAAg...."));
    }

    @Test(priority=1)
    public void getRequest() {
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .when().pathParam("title", "TestAPIKEY") // Set path parameter
                        .get(ROOT_URI + "/{title}"); // Send GET request

        // Assertion
        response.then().body("title", equalTo("TestAPIKEY"));
        response.then().body("key", equalTo("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAAAg...."));
    }

    @Test(priority=2)
    public void deleteRequest() {
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .when().pathParam("title", "TestAPIKEY") // Set path parameter
                        .get(ROOT_URI + "/{title}"); // Send GET request

        // Assertion
        response.then().body("title", equalTo("TestAPIKEY"));
        response.then().body("key", equalTo("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAAAg...."));
    }

}
