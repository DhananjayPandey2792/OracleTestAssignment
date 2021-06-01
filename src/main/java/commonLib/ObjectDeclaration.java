package commonLib;

import org.openqa.selenium.WebDriver;

import pageobjects.Commonpo;
import pageobjects.GoogleSearchPO;



public class ObjectDeclaration {

	public static WebDriver driver = DriverInitialize.initializeDriver(CommonLib.getConfigValue("ConstantValues", "browserType"));
	protected static CommonLib commonUtil = new CommonLib();
	protected static Commonpo commonPo = new Commonpo();
	protected static GoogleSearchPO googleSearchPO = new GoogleSearchPO();
	
	
}
	
	
