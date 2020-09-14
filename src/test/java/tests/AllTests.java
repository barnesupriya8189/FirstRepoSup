package tests;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class AllTests {

	@Test
	public void createTicket()
	{
		RestAssured.baseURI="http://localhost:8080/";
		
		given().contentType(ContentType.JSON)
		.body(Payload.createSessionPayload())
		.log().all()
		.filter(Payload.filter)
		.when()
		.post(Payload.sessionURI)
		.then()
		.assertThat()
		.statusCode(200)
		.body("session.value",Matchers.notNullValue())
		.log().all();
		
		//creating a new ticket code
		
		given().contentType(ContentType.JSON)
		.body(Payload.createTicketPayload())
		.log().all()
		.filter(Payload.filter)
		.when()
		.post(Payload.createTicketURI)
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
	}
}
