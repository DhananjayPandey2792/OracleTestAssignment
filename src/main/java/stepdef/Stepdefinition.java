package stepdef;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import commonLib.ObjectDeclaration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends ObjectDeclaration {

	@Given("^i open url '(.*)' in browser$")
	public void the_user_login_to_the_application_with(String url) {
		commonPo.getUrl(url);
	}

	@When("^i search for '(.*)'$")
	public void searchKeywordGoogle(String keyword) {
		googleSearchPO.searchKeyword(keyword);
	}

	@When("^i search for '(.*)' and search$")
	public void searchKeywordAndGo(String keyword) {
		googleSearchPO.searchKeywordAndGo(keyword);
		commonPo.hitEnter();
	}

	@Then("^search result is displayed$")
	public void searchResultDisplayed() {
		googleSearchPO.searchResultDisplayed();
		Assert.assertTrue("search result list is not displayed",
				driver.findElement(By.xpath("//ul[@role='listbox']")).isDisplayed());

	}

	@Then("^retrieve and store the top 10 results$")
	public void retrieveResult() {
		googleSearchPO.retrieveResult();
	}

	@Then("^i read the values from the file and display it in the console$")
	public void readFileValue() {
		googleSearchPO.readFile();

	}

	@When("^i check links in page$")
	public void verifyLink() throws IOException {
		googleSearchPO.verifyLink();
	}

	@Then("^i search entered '(.*)' in page and verify occurence$")
	public void searchSpecificKeyword(String keyword) {
		googleSearchPO.searchSpecificKeyword(keyword);

	}

}
