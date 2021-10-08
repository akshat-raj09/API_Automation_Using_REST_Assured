package httpMethods;

import base.BaseClass;
import constants.EndPoint;
import constants.StatusCodes;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.PostPOJO;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostMethod extends BaseClass {
	
	public static void postMethod() {
		
		RestAssured.basePath = EndPoint.postCreateUser;
		
		// Instead of creating a POJO class object we can send a Map<String, String> object with post()
		// OR we can send String in JSON format with post()
		// OR a .json file reference with post()
		PostPOJO PostPojo = new PostPOJO("akshat", "engineer");
		
		given()
			.contentType(ContentType.JSON)
			.body(PostPojo) // sending POJO class object directly with the request
		.when()
			.post()
		.then()
			.statusCode(StatusCodes.CREATED_201)
			.statusLine("HTTP/1.1 201 Created")
			.and()
			.header("Content-Length", "84")
			.assertThat()
			.body("name", equalTo("akshat"))
			.and()
			.body("job", equalTo("engineer"))
			.and()
			.log().all();
		
	}
	
	public static void postSerialize() {
		
		RestAssured.basePath = EndPoint.postCreateUser;
		File file = null;
		
		// creating object of POJO class
		PostPOJO PostPojo = new PostPOJO("akshat", "engineer");
		
		// writing POJO class object to PostPojo.json file using jackson API
		try {
			file = new File(System.getProperty("user.dir") + "\\PostPojo.json");
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(file, PostPojo);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// sending PostPojo.json file with POST request
		given()
			.contentType(ContentType.JSON)
			.body(file)
		.when()
			.post()
		.then()
			.statusCode(StatusCodes.CREATED_201)
			.statusLine("HTTP/1.1 201 Created")
			.log().all();
		
	}
	
	public static void postFileUpload() {
		
		File file = GetMethod.getDownloadFile("testJsonFile");
		
		RestAssured.baseURI = "https://v2.convertapi.com";
		RestAssured.basePath = "/upload";
		
		Response response = given()
								.multiPart(file)
							.when()
								.post()
							.then()
								.log().all()
								.extract().response();
		
		System.out.println("\n\n==================================================================\n");
		System.out.println(response.getStatusLine() + "\n\n" + response.contentType() + "\n\n" + response.asPrettyString());
		
	}

}
