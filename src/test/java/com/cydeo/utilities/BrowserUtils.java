package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
This class will be used to only store utility methods that can be used across the project.
 */
public class BrowserUtils {
/*
This method will accept int(in seconds) and execute Thread.sleep method for given duration Args:int seconds
 */
public static void sleep(int second){
second*=1000;
try{
Thread.sleep(second);
}catch(InterruptedException e){

}
}
/*
TC #2: Create utility method
1. Create a new class called BrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called, it should switch window and verify title.
Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl
• Arg3: String expectedTitle

 */
public static void switchWindowAndVerify(String expectedInUrl,String expectedTitle){

Set<String> allWindowHandles=Driver.getDriver().getWindowHandles();

for (String each:allWindowHandles
) {Driver.getDriver().switchTo().window(each);
System.out.println("Current URL = " + Driver.getDriver().getCurrentUrl());

if(Driver.getDriver().getCurrentUrl().contains(expectedInUrl))
break;
}
String actualTitle=Driver.getDriver().getTitle();
Assert.assertTrue(actualTitle.contains(expectedTitle));

}
/*
TC #3: Create utility method
1. Create a new method for title verification
2. Create a method to make title verification logic re-usable
3. When method is called, it should simply verify expected title with actual
title
Method info:
• Name: verifyTitle()
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedTitle
 */
public static void verifyTitle( String expectedTitle ){



Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
}

public static void verifyTitleContains( String expectedTitle ){



Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
}

public static void invisibilityOfMethod(WebElement target){

WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
//use the "wait" object with the proper syntax to create explicit wait condition
wait.until(ExpectedConditions.invisibilityOf(target));
}
public static void verifyURLContains( String expectedInURL ){

String actualURL=Driver.getDriver().getCurrentUrl();

Assert.assertTrue(actualURL.contains(expectedInURL));
}

public static List<String> dropdownOptions_as_String(WebElement dropdownElement){

Select month=new Select(dropdownElement);
List<WebElement> actualMonthAsWebElement=month.getOptions();

List<String> actualMonthAsString=new ArrayList<>();

for (WebElement each:actualMonthAsWebElement) {
actualMonthAsString.add(each.getText());

}
return actualMonthAsString;

}

public static void clickRadioButton(List<WebElement> radioButtons,String attributeValue){

for (WebElement each:radioButtons) {
if(each.getAttribute("value").equals(attributeValue)){
each.click();
}

}
}

}
