package restAssuredTest;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

public class statusValidationTest {
	
	String APIKey = "87c8faa9f495b488acd4353a3d7285f3";
	String OAuthToken = "ATTA3a8b5618800c57f3b1adec59f945bc76328cf0268f2f68706d340478dc9b1bda67A1440B";

	@Test
	public void validateData() {
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.given()
		.param("key", APIKey)
		.param("token", OAuthToken)
		.get("https://api.trello.com/1/members/me/boards")
		.then()
		.statusCode(200)
		.body("name", hasItems("RestAssuredBoard", "TestingAPI"))
		.body("id", hasItems("641ba936b450f0138b20ec4a"));		
		
		
		
		
		
	}
	
	
	
	
}
