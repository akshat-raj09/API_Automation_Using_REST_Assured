package constants;

import base.BaseClass;

public class EndPoint extends BaseClass {
	
	public static final String endpointURL = prop.getProperty("endpointURL");
	public static final String getSingleUser = prop.getProperty("getSingleUser");
	public static final String getListUser = prop.getProperty("getListUser");
	public static final String postCreateUser = prop.getProperty("postCreateUser");
	public static final String putUpdateUser = prop.getProperty("putUpdateUser");
	public static final String patchUpdateUser = prop.getProperty("patchUpdateUser");
	public static final String deleteUser = prop.getProperty("deleteUser");
	public static final String getDownloadFile = prop.getProperty("getDownloadFile");

}
