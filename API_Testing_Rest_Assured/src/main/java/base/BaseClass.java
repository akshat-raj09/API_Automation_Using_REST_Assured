package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import constants.EndPoint;
import io.restassured.RestAssured;
import io.restassured.config.ConnectionConfig;

public class BaseClass {
	
	private static BaseClass base = null;
	protected static final Properties prop = new Properties();
	private static FileInputStream ip = null;
	private static final String configPath = System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties";

	public BaseClass() {
		
		try {
			ip = new FileInputStream(configPath);
			prop.load(ip);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static BaseClass getInstance() {
		if(base == null) {
			base = new BaseClass();
		}
		return base;
	}
	
	public static void init() {
		getInstance();
		RestAssured.baseURI = EndPoint.endpointURL;
	}
	
	public static void closeConnection() {
		RestAssured.config().connectionConfig(ConnectionConfig.connectionConfig().closeIdleConnectionsAfterEachResponse());
	}

}
