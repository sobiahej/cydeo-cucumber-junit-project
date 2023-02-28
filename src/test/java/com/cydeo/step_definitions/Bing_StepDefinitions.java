package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.time.Duration;

public class Bing_StepDefinitions {
BingSearchPage bingSearchPage=new BingSearchPage();
@Given("user is on the Bing search page")
public void user_is_on_the_bing_search_page() {
Driver.getDriver().get("https://www.bing.com");
}
@When("user enters orange in the Bing search box")
public void user_enters_orange_in_the_bing_search_box() {
bingSearchPage.searchBox.sendKeys("orange"+ Keys.ENTER);
}




@Then("user should see orange in title") public void userShouldSeeOrangeInTitle() {
BrowserUtils.verifyTitle("Bing");
}

@When("user enters {string} in the Bing search box")
public void userEntersInTheBingSearchBox(String searchKey) {
bingSearchPage.searchBox.sendKeys(searchKey+Keys.ENTER);

}

@Then("user should see {string} in title") public void userShouldSeeInTitle(String expectedTitle) throws InterruptedException {
Thread.sleep(10);
BrowserUtils.verifyTitle(expectedTitle);
}
}
