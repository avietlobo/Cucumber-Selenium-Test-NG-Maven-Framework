package helper.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import utilities.ResourceHelper;

public class LoggerHelper {

	private static boolean root = false;

	public static Logger getLogger(Class clas) {
		if (root)
			return Logger.getLogger(clas);
		
		System.out.println(ResourceHelper.getResourcePath("config/log4j.properties"));
		PropertyConfigurator.configure(ResourceHelper.getResourcePath("config/log4j.properties"));
		root = true;
		return Logger.getLogger(clas);
	}

}
