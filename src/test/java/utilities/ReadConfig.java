package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;

	public ReadConfig() {

		File file = new File("./Configuration/config.properties");

		try {
			FileInputStream fInputStream = new FileInputStream(file);
			properties = new Properties();
			properties.load(fInputStream);
		} catch (Exception e) {
			System.out.println("Exception e " + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = properties.getProperty("baseURL");
		return url;
	}

	public String getChromePath() {
		String chromePath = properties.getProperty("chromePath");
		return chromePath;
	}

	public String getFirefoxPath() {
		String firefoxPath = properties.getProperty("firefoxPath");
		return firefoxPath;
	}

}
