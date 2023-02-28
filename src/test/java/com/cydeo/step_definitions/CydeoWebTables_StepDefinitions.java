package com.cydeo.step_definitions;

import com.cydeo.pages.CydeoWebTablesOrderPage;
import com.cydeo.pages.CydeoWebTablesPage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class CydeoWebTables_StepDefinitions {
CydeoWebTablesPage cydeoWebTablesPage=new CydeoWebTablesPage();
@When("user is on the cydeo Web Tables page")
public void user_is_on_the_cydeo_web_tables_page() {
Driver.getDriver().get("https://web-table-2.cydeo.com/login");
}
@When("user enters username")
public void user_enters_username() {
cydeoWebTablesPage.userName.sendKeys("Test");
}
@When("user enters password")
public void user_enters_password() {
cydeoWebTablesPage.password.sendKeys("Tester");

cydeoWebTablesPage.loginButton.click();
}
@Then("user sees URL should end with orders")
public void user_sees_url_should_end_with_orders() {
//String actualURL=Driver.getDriver().getCurrentUrl();
//String expectedInURL="orders";

//Assert.assertTrue(actualURL.contains(expectedInURL));
BrowserUtils.verifyURLContains("orders");

}
@When("user enters username {string}") public void userEntersUsername(String userName) {
cydeoWebTablesPage.userName.sendKeys(userName);
}

@When("user enters password {string}") public void userEntersPassword(String password) {
cydeoWebTablesPage.password.sendKeys(password);

cydeoWebTablesPage.loginButton.click();
}


@Then("user sees URL should end with {string}") public void userSeesURLShouldEndWith(String wordContain) {
BrowserUtils.verifyURLContains(wordContain);
}


@When("user enters correct credentials") public void userEntersCorrectCredentials(Map<String,String> credentials ) {
cydeoWebTablesPage.userName.sendKeys(credentials.get("username"));
cydeoWebTablesPage.password.sendKeys(credentials.get("password"));

cydeoWebTablesPage.loginButton.click();
}
@Given("user is already logged in to The Web table app")
public void user_is_already_logged_in_to_the_web_table_app() {
Driver.getDriver().get("https://web-table-2.cydeo.com/login");
cydeoWebTablesPage.login("Test","Tester");

}

CydeoWebTablesOrderPage cydeoWebTablesOrderPage=new CydeoWebTablesOrderPage();
@When("user is on the “Order” page")
public void user_is_on_the_order_page() {

cydeoWebTablesOrderPage.ordersLink.click();

BrowserUtils.sleep(2);

}
@Then("user sees below options under “product” dropdown")
public void user_sees_below_options_under_product_dropdown(List<String> expectedOptions) {

List<String> actualOptions=BrowserUtils.dropdownOptions_as_String(cydeoWebTablesOrderPage.productDropdown);

Assert.assertEquals(actualOptions,expectedOptions);


}


@Then("user sees VISA as enabled payment option") public void userSeesVISAAsEnabledPaymentOption() {
Assert.assertTrue(cydeoWebTablesOrderPage.visaRadioButton.isEnabled());

}

@Then("user sees MASTERCARD as enabled payment option") public void userSeesMASTERCARDAsEnabledPaymentOption() {
Assert.assertTrue(cydeoWebTablesOrderPage.MasterCardRadioButton.isEnabled());
}

@Then("user sees AMERICANEXPRESS as enabled payment option") public void userSeesAMERICANEXPRESSAsEnabledPaymentOption() {
Assert.assertTrue(cydeoWebTablesOrderPage.AmericanExpressRadioButton.isEnabled());
}

@Then("user enters quantity {string}") public void userEntersQuantity(String productQuantity) {
cydeoWebTablesOrderPage.productQuantity.clear();

// this code could work too to clear the form: cydeoWebTablesOrderPage.productQuantity.sendKeys(Keys.BACK_SPACE);

cydeoWebTablesOrderPage.productQuantity.sendKeys(productQuantity);

}

@Then("user clicks to the calculate button") public void userClicksToTheCalculateButton() {

cydeoWebTablesOrderPage.calculateButton.click();
}

@And("user enters  customer name {string}") public void userEntersCustomerName(String customerName) {

cydeoWebTablesOrderPage.customerName.sendKeys(customerName);

BrowserUtils.sleep(2);
}

@And("user enters street {string}") public void userEntersStreet(String streetName) {

cydeoWebTablesOrderPage.streetName.sendKeys(streetName);

BrowserUtils.sleep(2);
}

@And("user enters city {string}") public void userEntersCity(String cityName) {

cydeoWebTablesOrderPage.cityName.sendKeys(cityName);

BrowserUtils.sleep(2);
}

@And("user enters state {string}") public void userEntersState(String stateName) {

cydeoWebTablesOrderPage.stateName.sendKeys(stateName);

BrowserUtils.sleep(2);
}

@And("user enters zip {string}") public void userEntersZip(String zipCode) {

cydeoWebTablesOrderPage.zipCode.sendKeys(zipCode);

BrowserUtils.sleep(2);
}

@And("user selects payment option {string}") public void userSelectsPaymentOption(String paymentOption) {
cydeoWebTablesOrderPage.AmericanExpressRadioButton.click();



BrowserUtils.sleep(2);
}

@And("user enters credit card number {string}") public void userEntersCreditCardNumber(String creditCardNumber) {

cydeoWebTablesOrderPage.cardNumber.sendKeys(creditCardNumber);

BrowserUtils.sleep(2);

}

@And("user enters expiration date {string}") public void userEntersExpirationDate(String expDate) {

cydeoWebTablesOrderPage.cardExp.sendKeys(expDate);

BrowserUtils.sleep(2);
}

@And("user clicks to process order button") public void userClicksToProcessOrderButton() {

cydeoWebTablesOrderPage.processOrderButton.click();

BrowserUtils.sleep(2);
}
ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage();
@Then("user should see {string} in the first row of the web table") public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {

String actualName=viewAllOrdersPage.newCustomerCell.getText();

Assert.assertEquals(actualName,expectedName);

}


}
