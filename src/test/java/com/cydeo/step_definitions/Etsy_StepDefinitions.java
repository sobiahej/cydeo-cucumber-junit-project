package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {

EtsySearchPage etsySearchPage=new EtsySearchPage();
@When("user is on the Etsy home page")
public void user_is_on_the_etsy_home_page() {
Driver.getDriver().get("https://www.etsy.com");
}
@Then("user sees title as expected")
public void user_sees_title_as_expected() {
String actualTitle=Driver.getDriver().getTitle();
String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
Assert.assertEquals(actualTitle,expectedTitle);
}

@When("User types Wooden Spoon in the search box") public void userTypesWoodenSpoonInTheSearchBox() {
etsySearchPage.EtsySearchBox.sendKeys("Wooden Spoon");
}

@When("User clicks search button") public void userClicksSearchButton() {
etsySearchPage.EtsySearchButton.click();

}

@Then("User sees Wooden Spoon is in the title") public void userSeesWoodenSpoonIsInTheTitle() {
String expectedTitle="Wooden spoon - Etsy";
String actualTitle=Driver.getDriver().getTitle();
Assert.assertEquals(actualTitle,expectedTitle);
}

@Given("user is on the {string} home page") public void userIsOnTheHomePage(String homePage) {
Driver.getDriver().get(homePage);
}

@When("User types {string} in the search box") public void userTypesInTheSearchBox(String searchText) {
etsySearchPage.EtsySearchBox.sendKeys(searchText);
etsySearchPage.EtsySearchButton.click();

}

@Then("User sees {string} is in the title") public void userSeesIsInTheTitle(String expectedTitle) {
BrowserUtils.verifyTitle(expectedTitle);
}
}
