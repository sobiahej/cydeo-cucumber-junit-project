package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Wikipedia_StepDefinitions {
WikipediaSearchPage wikipediaSearchPage=new WikipediaSearchPage();
@Given("User is on Wikipedia home page") public void userIsOnWikipediaHomePage() {
Driver.getDriver().get("https://www.wikipedia.org/");
}
@When("User types {string} in the wiki search box") public void userTypesInTheWikiSearchBox(String SearchWord) {
wikipediaSearchPage.searchBox.sendKeys(SearchWord);
}
@When("User clicks wiki search button") public void userClicksWikiSearchButton() {
wikipediaSearchPage.searchButton.click();
}
@Then("User sees {string} is in the wiki title") public void userSeesIsInTheWikiTitle(String expectedTitle) {
BrowserUtils.verifyTitleContains(expectedTitle);
}

@Then("User sees {string} is in the main header") public void userSeesIsInTheMainHeader(String mainHeader) {
wikipediaSearchPage.mainHeader.getText();
}

@Then("User sees {string} is in the image header") public void userSeesIsInTheImageHeader(String imageHeader) {
wikipediaSearchPage.imageHeader.getText();
}
}
