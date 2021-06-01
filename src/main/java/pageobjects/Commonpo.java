package pageobjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import commonLib.ObjectDeclaration;

	
public class Commonpo extends ObjectDeclaration {
		
	public void getUrl(String url){
		driver.get(url);
		maximizeWindow();
	}
	public void hitEnter() {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	}


