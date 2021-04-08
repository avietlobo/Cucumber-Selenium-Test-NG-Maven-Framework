package utilities;

import java.util.Properties;

import org.openqa.selenium.remote.BrowserType;

import enums.DriverType;

public class PropertyFileReader {
	
	private Properties prop = null;

	public PropertyFileReader() {
		prop = new Properties();
		try {
			prop.load(ResourceHelper
					.getResourcePathInputStream("config/"
							+ "config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getUserName() {
		return prop.getProperty("Username");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}



}
