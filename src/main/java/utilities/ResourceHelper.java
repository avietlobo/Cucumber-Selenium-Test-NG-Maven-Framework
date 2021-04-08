package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ResourceHelper {
	
	public static String getResourcePath(String resource) {
		//String path = getBaseResourcePath() + resource;
		String path = getBaseResourcePath();
		return path;
	}
	
	public static String getBaseResourcePath() {
		//String path = ResourceHelper.class.getClass().getResource("").getPath();
		String path1="C:\\Users\\Aviet_Lobo\\eclipse-workspace\\CucumberSeleniumFramework\\src\\test\\resources\\config\\log4j.properties";
		return path1;
	}
	
	public static InputStream getResourcePathInputStream(String resource) throws FileNotFoundException {
		return new FileInputStream(ResourceHelper.getResourcePath(resource));
	}

}
