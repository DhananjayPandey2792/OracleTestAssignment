package commonLib;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;

public class CommonLib extends ObjectDeclaration {
	private static Logger logger = Logger.getLogger(CommonLib.class.getName());

	public static String getConfigValue(String section, String key) {
		String value = "";
		File file = new File("Config\\Config.ini");
		if (file.exists()) {
			try {
				Ini ini = new Ini(file);
				value = ini.get(section, key);
				logger.info("The Value is: " + value);
			} catch (InvalidFileFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			logger.info("Config.ini File Does Not Exist!!");
		}
		return value;
	}

	public String getReportConfigPath() {
		String reportConfigPath = getConfigValue("ExtentReport", "reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Config.ini file for the Key:reportConfigPath");
	}

}