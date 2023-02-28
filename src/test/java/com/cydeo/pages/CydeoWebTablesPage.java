package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CydeoWebTablesPage {
public CydeoWebTablesPage(){
PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//input[@type='text']")
public WebElement userName;

@FindBy(xpath = "//input[@type='password']")
public WebElement password;

@FindBy(xpath = "//button[@type='submit']")
public WebElement loginButton;

//create a login page for cydeo login page in the page section so it can be implemented later, since it is utilized frequently

public void login(String username, String password){
this.userName.sendKeys(username);
this.password.sendKeys(password);
this.loginButton.click();
}


}
