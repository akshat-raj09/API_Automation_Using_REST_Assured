package httpMethods;

import base.BaseClass;
import constants.EndPoint;
import constants.StatusCodes;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import model.GetMethodResponseAsPOJO;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class GetMethod extends BaseClass {
	
	public static Response getMethodResponse() {		
		
		RestAssured.basePath = EndPoint.getSingleUser;
		
		Response response = given()
							.when()
								.get()
							.then()
								.extract().response();
		
		return response;
		
	}
	
	public static void getMethod() {
		
		RestAssured.basePath = EndPoint.getSingleUser;
		
		given()
		.when()
			.get()
		.then()
			.statusCode(StatusCodes.OK_200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat()
			.body("data.id", equalTo(2))
			.and()
			.body("support.url", equalTo("https://reqres.in/#support-heading"))
			.and()
			.header("Connection", "keep-alive")
			.log().all();
		
	}
	
	public static void getMethodDeserialize() {
		
		RestAssured.basePath = EndPoint.getSingleUser;
		
		Response response = given()
							.when()
								.get()
							.then()
								.statusCode(StatusCodes.OK_200)
								.statusLine("HTTP/1.1 200 OK")
								.assertThat()
								.body("data.id", equalTo(2))
								.and()
								.body("support.url", equalTo("https://reqres.in/#support-heading"))
								.and()
								.header("Connection", "keep-alive")
								.log().all()
								.extract().response();
		
		GetMethodResponseAsPOJO obj = response.getBody().as(GetMethodResponseAsPOJO.class);
		
		System.out.println(obj.toString());
		
	}
	
	public static File getDownloadFile(String fileName) {
		
		RestAssured.basePath = EndPoint.getDownloadFile;
		File file = null;
		FileOutputStream op = null;
		
		Response response = given()
							.when()
								.get()
								.andReturn();
		
		byte bytes[] = response.asByteArray();
		file = new File(System.getProperty("user.dir") + "\\" + fileName + ".json");
		
		try {
			op = new FileOutputStream(file);
			op.write(bytes);
			op.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return file;
		
	}
	
	private static RequestSpecification getMethodRequestSpecification() {
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri(EndPoint.endpointURL);
		builder.setBasePath(EndPoint.getSingleUser);
		
		RequestSpecification requestSpec = builder.build();
		
		return requestSpec;
		
	}
	
	private static ResponseSpecification getMethodResponseSpecification() {
		
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		builder.expectStatusCode(StatusCodes.OK_200);
		builder.expectStatusLine("HTTP/1.1 200 OK");
		
		ResponseSpecification responseSpec = builder.build();
		
		return responseSpec;
		
	}
	
	public static void getMethodSpecificationBuilder() {
		
		given()
			.spec(getMethodRequestSpecification())
		.when()
			.get()
		.then()
			.spec(getMethodResponseSpecification())
			.header("Connection", "keep-alive")
			.body("data.id", equalTo(2))
			.log().all();
		
	}
		
}


