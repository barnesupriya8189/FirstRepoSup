package tests;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

public class Payload {
	public static String sessionURI="rest/auth/1/session";
	public static String createTicketURI="rest/api/2/issue";
	public static SessionFilter filter=new SessionFilter();
	
	
	public static String createSessionPayload()
	{
		return "{\r\n" + 
			"	\"username\":\"barnesupriya8189\",\r\n" + 
			"	\"password\": \"Supriya@1\"\r\n" + 
			"}";
	}

	public static String createTicketPayload()
	{ 
		return "{\r\n" + 
			"    \"fields\": {\r\n" + 
			"       \"project\":\r\n" + 
			"       {\r\n" + 
			"          \"key\": \"JIR\"\r\n" + 
			"       },\r\n" + 
			"       \"summary\": \"Creating a new story for register\",\r\n" + 
			"       \"description\": \"Enter details to register\",\r\n" + 
			"       \"issuetype\": {\r\n" + 
			"          \"name\": \"Story\"\r\n" + 
			"       }\r\n" + 
			"   }\r\n" + 
			"}";
	}
}
