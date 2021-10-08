package httpMethods;

import base.BaseClass;
import constants.EndPoint;
import constants.StatusCodes;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class DeleteMethod extends BaseClass {

	public static void deleteMethod() {

		RestAssured.basePath = EndPoint.deleteUser;

		given()
		.when()
			.delete()
		.then()
			.statusCode(StatusCodes.NO_CONTENT_204)
			.statusLine("HTTP/1.1 204 No Content")
			.assertThat()
			.header("Connection", "keep-alive")
			.log().all();

	}

}
