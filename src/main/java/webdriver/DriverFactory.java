package webdriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.DriverType;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;

public class DriverFactory {

	private static final Map<DriverType, Supplier<WebDriver>> driverMap = new HashMap<>();

	private static final Supplier<WebDriver> chromeDriverSupplier = () -> {
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		return new ChromeDriver();
	};

	private static final Supplier<WebDriver> firefoxDriverSupplier = () -> {
		FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
		return new FirefoxDriver();
	};

	private static final Supplier<WebDriver> IEDriverSupplier = () -> {
		InternetExplorerDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();
		return new InternetExplorerDriver();
	};

	static {
		driverMap.put(DriverType.CHROME, chromeDriverSupplier);
		driverMap.put(DriverType.FIREFOX, firefoxDriverSupplier);
		driverMap.put(DriverType.IE, IEDriverSupplier);
	}

	public static final WebDriver getDriver(DriverType type) {
		return driverMap.get(type).get();
	}

	

}
