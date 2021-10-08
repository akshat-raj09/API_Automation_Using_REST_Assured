package httpMethods;

import base.BaseClass;
import constants.EndPoint;
import constants.StatusCodes;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import model.PatchPOJO;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PatchMethod extends BaseClass {

	public static void patchMethod() {
		RestAssured.basePath = EndPoint.patchUpdateUser;

		// Instead of creating a POJO class object we can send a Map<String, String> object with post()
		// OR we can send String in JSON format with post()
		// OR a .json file reference with post()
		PatchPOJO patchPojo = new PatchPOJO("Akshat", "QA");

		given()
			.contentType(ContentType.JSON)
			.body(patchPojo) // sending POJO class object directly with the request
		.when()
			.patch()
		.then()
			.statusCode(StatusCodes.OK_200)
			.statusLine("HTTP/1.1 200 OK")
			.and()
			.header("Transfer-Encoding", "chunked")
			.assertThat()
			.body("name", equalTo("Akshat"))
			.and()
			.body("job", equalTo("QA"))
			.and()
			.log().all();
	}

}
