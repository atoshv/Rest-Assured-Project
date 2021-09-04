package stepDef;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class TestCase_1 {
	RequestSpecification request;
	Response response;
	
	@io.cucumber.java.en.Given("^api request (.*)$")
	public void apiRequestURL(String url) {
		RestAssured.baseURI = url;
	}
	
/*	@io.cucumber.java.en.And("^authentication (.*)$")
	public void authenticationToken(String token) {
		request = request.given().header("Authorization", "Bearer " +token);
		request.given().auth().oauth2(token);
		
	}*/
	
	@io.cucumber.java.en.When("^sending api requests$")
	public void sendingApiRequests() {
		String path = "/api/users?page=2";
		response = request.get(path).then().extract().response();
	}
	
	@io.cucumber.java.en.Then("^validate response (.*)$")
	public void validateResponseCode(String code) {
		Assert.assertEquals(code, response.getStatusCode());
	}
	
	
}
