package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import httpMethods.PutMethod;

public class PutMethodTest {
	
	@BeforeMethod
	public void setup() {
		BaseClass.init();
	}
	
	@AfterMethod
	public void tearDown() {
		BaseClass.closeConnection();
	}
	
	@Test(priority = 1)
	public void putMethodTest() {
		PutMethod.putMethod();
	}

}
