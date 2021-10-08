package httpMethods;

import base.BaseClass;
import constants.EndPoint;
import constants.StatusCodes;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import model.PutPOJO;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutMethod extends BaseClass {

	public static void putMethod() {

		RestAssured.basePath = EndPoint.putUpdateUser;

		// Instead of creating a POJO class object we can send a Map<String, String> object with post()
		// OR we can send String in JSON format with post()
		// OR a .json file reference with post()
		PutPOJO PutPojo = new PutPOJO("akshat", "Software Engineer");

		given()
			.contentType(ContentType.JSON)
			.body(PutPojo) // sending POJO class object directly with the request
		.when()
			.put()
		.then()
			.statusCode(StatusCodes.OK_200)
			.statusLine("HTTP/1.1 200 OK")
			.and()
			.header("Server", "cloudflare")
			.assertThat()
			.body("name", equalTo("akshat"))
			.and()
			.body("job", equalTo("Software Engineer"))
			.and()
			.log().all();

	}

}
