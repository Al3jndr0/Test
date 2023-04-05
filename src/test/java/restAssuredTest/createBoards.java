package restAssuredTest;



import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class createBoards {
	
	
	String APIKey = "87c8faa9f495b488acd4353a3d7285f3";
	String OAuthToken = "ATTA3a8b5618800c57f3b1adec59f945bc76328cf0268f2f68706d340478dc9b1bda67A1440B";
	String boardName = "RestAssuredBoard";
	
	@Test
	public void createBoard() {
		
		// set the base URL
		RestAssured.baseURI = "https://api.trello.com/1/boards";

		// create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type", "application/json");
		
		Response myResponse = httpRequest.post(RestAssured.baseURI+"/?name="+boardName+"&key="+APIKey+"&token="+OAuthToken);
		
		int statusCode = myResponse.getStatusCode();
		
		Assert.assertEquals(200, statusCode);
		
		System.out.println("the test passed and board created with status code-" + statusCode);
		
	
	}


}
