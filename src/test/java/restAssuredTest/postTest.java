package restAssuredTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postTest {
	
	@Test
	public void restAssuredPost() {
		
		//set the base URL
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		
		//create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		
		JSONObject jmyJson = new JSONObject();
		
		jmyJson.put("page", 22);
		jmyJson.put("per page", 5);
		jmyJson.put("total", 10);
		jmyJson.put("total pages", 5);
		
		
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(jmyJson.toJSONString());
		
		Response myResponse = httpRequest.request(Method.POST);
		
		int statuscode = myResponse.getStatusCode();
		
		System.out.println(statuscode);
		
		myResponse.prettyPrint();
		
		
		
		
		
	}
	
	
	
	

}
