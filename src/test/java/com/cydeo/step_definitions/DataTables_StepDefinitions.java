package com.cydeo.step_definitions;

import com.cydeo.pages.DataTables;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {
@Then("user should see below list") public void user_should_see_below_list(List<String> fruitsAndVegetables) {

System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);
fruitsAndVegetables.get(1);
}

@Then("user should see below") public void userShouldSeeBelow(List<String> favoritePets) {
System.out.println("favoritePets = " + favoritePets);
System.out.println("favoritePets.get(2) = " + favoritePets.get(2));
}
@Then("officer is able to see any data he wants")
public void officer_is_able_to_see_any_data_he_wants(Map<String,String> driverInfo) {
System.out.println("driverInfo = " + driverInfo);

}

DataTables dataTables=new DataTables();
@Given("User is on the dropdowns page of practice tool")
public void userIsOnTheDropdownsPageOfPracticeTool() {
Driver.getDriver().get("https://practice.cydeo.com/dropdown");

}

@Then("User should see below info in month dropdown") public void userShouldSeeBelowInfoInMonthDropdown(List<String> birthMonth) {
Select month=new Select(dataTables.birthMonth);
List<WebElement> actualMonthAsWebElement=month.getOptions();

List<String> actualMonthAsString=new ArrayList<>();

for (WebElement each:actualMonthAsWebElement) {
actualMonthAsString.add(each.getText());

}
Assert.assertEquals(birthMonth,actualMonthAsString);
}


}
