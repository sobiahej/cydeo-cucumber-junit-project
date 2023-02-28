package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {
GoogleSearchPage googleSearchPage=new GoogleSearchPage();
@When("user is on the Google search page")
public void user_is_on_the_google_search_page() {
// Write code here that turns the phrase above into concrete actions
//throw new io.cucumber.java.PendingException();
Driver.getDriver().get("https://www.google.com");
}
@Then("user should see title is Google")
public void user_should_see_title_is_google() {
// Write code here that turns the phrase above into concrete actions
//throw new io.cucumber.java.PendingException();
String actualTitle=Driver.getDriver().getTitle();
String expectedTitle="Google";

Assert.assertEquals(actualTitle,expectedTitle);
}


@When("user searches for apple") public void userSearchesForApple() {
googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);

}

@Then("user should see apple in the title") public void userShouldSeeAppleInTheTitle() {
BrowserUtils.verifyTitle("apple - Google Search");
}

@When("user searches for orange")
public void userSearchesForOrange() {
googleSearchPage.searchBox.sendKeys("orange"+Keys.ENTER);
}

@Then("user should see orange in the title") public void userShouldSeeOrangeInTheTitle() {
BrowserUtils.verifyTitle("orange - Google Search");
}
}
