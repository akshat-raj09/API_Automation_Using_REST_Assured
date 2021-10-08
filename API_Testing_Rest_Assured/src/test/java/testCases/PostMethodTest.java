package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import httpMethods.PostMethod;

public class PostMethodTest {
	
	@BeforeMethod
	public void setup() {
		BaseClass.init();
	}
	
	@AfterMethod
	public void tearDown() {
		BaseClass.closeConnection();
	}
	
	@Test(priority = 1)
	public void postMethodTest() {
		PostMethod.postMethod();
	}
	
	@Test(priority = 2)
	public void postSerializeTest() {
		PostMethod.postSerialize();
	}
	
	@Test(priority = 3)
	public void postFileUploadTest() {
		PostMethod.postFileUpload();
	}

}
