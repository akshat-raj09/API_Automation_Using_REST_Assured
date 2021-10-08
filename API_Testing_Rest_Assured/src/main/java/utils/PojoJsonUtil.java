package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.google.gson.Gson;

public class PojoJsonUtil {

	public static File convertPojoToJsonFile(Object classObject, String fileName) {

		FileOutputStream op;
		File file;
		Gson gson = new Gson();
		String jsonString = gson.toJson(classObject);

		file = new File(System.getProperty("user.dir") + "\\" + fileName + ".json");

		try {
			op = new FileOutputStream(file);
			for(int i=0; i<jsonString.length(); i++) {
				op.write((byte)jsonString.charAt(i));
			}
			op.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		return file;
	}

	public static Object convertJsonFileToPojo(File file) {

		Object obj = null;
		Gson gson = new Gson();

		String jsonString = readJsonFileAsString(file);

		obj = gson.fromJson(jsonString, Object.class);

		return obj;
	}

	public static Object convertJsonStringToPojo(String jsonString) {

		Object obj = null;
		Gson gson = new Gson();

		obj = gson.fromJson(jsonString, Object.class);

		return obj;
	}

	public static String readJsonFileAsString(File file) {

		StringBuilder sb = new StringBuilder();
		FileInputStream ip;
		try {
			ip = new FileInputStream(file);
			byte x[] = ip.readAllBytes();
			for(int i=0; i<x.length; i++) {
				sb.append((char)x[i]);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		return sb.toString();

	}

}
