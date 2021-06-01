package pageobjects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonLib.ObjectDeclaration;

public class GoogleSearchPO extends ObjectDeclaration {
	public void searchKeyword(String keyword) {
		WebElement inputKeyword = driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));

		inputKeyword.sendKeys(keyword);
	}

	public void searchKeywordAndGo(String keyword) {
		WebElement inputKeyword = driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));

		inputKeyword.sendKeys(keyword);
	}

	public void searchResultDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@role='listbox']"))));
		Assert.assertTrue("search result list is not displayed",
				driver.findElement(By.xpath("//ul[@role='listbox']")).isDisplayed());

	}

	public void retrieveResult() {
		ArrayList<String> resultList = new ArrayList<String>();

		List<WebElement> searchResult = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for (WebElement result : searchResult) {
			result.getText();
			resultList.add(result.getText());
		}
		try {

			File file = new File(
					System.getProperty("user.dir")+"\\InputFile\\result.txt");
			
			
			FileWriter fw = new FileWriter(file,true);
			for (String resultSet : resultList) {
				System.out.println(resultSet);
				fw.write(" ");
				fw.write(resultSet + "\n");
			}
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		Assert.assertTrue("Expected" + resultList.size() + "Actual:10", resultList.size() == 10);

	}

	public void readFile() {
		BufferedReader br = null;
		
		File file = new File(
				System.getProperty("user.dir")+"\\InputFile\\result.txt");
		try {
			br = new BufferedReader(new FileReader(file));

			String st;
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}
			br.close();

		} catch (Exception e) {

		}

	}

	public void verifyLink() throws IOException {
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,\"www.oracle.com\")]"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			System.out.println(url);
			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + " is a valid link");
				}
			} catch (MalformedURLException e) {

				e.printStackTrace();
			}
		}

	}

	public void searchSpecificKeyword(String keyword) {
		List<WebElement> keywordCount = driver.findElements(By.xpath("//*[contains(text(),'" + keyword + "')]"));
		int count = keywordCount.size();
		System.out.println(count);
	}

}
