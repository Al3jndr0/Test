package restAssuredTest;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getBoards {

	String APIKey = "87c8faa9f495b488acd4353a3d7285f3";
	String OAuthToken = "ATTA3a8b5618800c57f3b1adec59f945bc76328cf0268f2f68706d340478dc9b1bda67A1440B";

	@Test
	public void getBoards() {

		// set the base URL
		RestAssured.baseURI = "https://api.trello.com/1/members/me/boards";

		// create request object
		RequestSpecification httpRequest = RestAssured.given();

		Response myResponse = httpRequest.get(RestAssured.baseURI + "?key=" + APIKey + "&token=" + OAuthToken);

		System.out.println(myResponse.prettyPrint());

		Assert.assertEquals(200, myResponse.getStatusCode());
	}

}
