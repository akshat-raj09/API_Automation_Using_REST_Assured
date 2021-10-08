package testCases;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import constants.StatusCodes;
import httpMethods.GetMethod;
import io.restassured.response.Response;

public class GetMethodTest {
	
	@BeforeMethod
	public void setup() {
		BaseClass.init();
	}
	
	@AfterMethod
	public void tearDown() {
		BaseClass.closeConnection();
	}
	
	@Test(priority = 1)
	public void getMethodResponseTest() {
		Response response = GetMethod.getMethodResponse();
		
		Assert.assertEquals(response.statusCode(), StatusCodes.OK_200);
		Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");
	}
	
	@Test(priority = 2)
	public void getMethodTest() {
		GetMethod.getMethod();
	}
	
	@Test(priority = 3)
	public void getMethodSpecificationBuilderTest() {
		GetMethod.getMethodSpecificationBuilder();
	}
	
	@Test(priority = 4)
	public void getMethodDeserializeTest() {
		GetMethod.getMethodDeserialize();
	}
	
	@Test(priority = 5)
	public void getDownloadFileTest() {
		File file = GetMethod.getDownloadFile("testJsonFile");
		Assert.assertTrue(file != null);
	}

}
