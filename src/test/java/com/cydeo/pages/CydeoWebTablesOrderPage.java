package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class CydeoWebTablesOrderPage extends CydeoWebTables_BasePage {

public CydeoWebTablesOrderPage(){
PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(name = "product")
public WebElement productDropdown;

@FindBy(xpath = "//input[@value='Visa']")
public WebElement visaRadioButton;

@FindBy(xpath = "//input[@value='MasterCard']")
public WebElement MasterCardRadioButton;

@FindBy(xpath = "//input[@value='American Express']")
public WebElement AmericanExpressRadioButton;

@FindBy(name = "card")
public List<WebElement> cardTypes;

@FindBy(name = "quantity")
public WebElement productQuantity;

@FindBy(name = "name")
public WebElement customerName;

@FindBy(name = "street")
public WebElement streetName;

@FindBy(name = "city")
public WebElement cityName;

@FindBy(name = "state")
public WebElement stateName;

@FindBy(name = "zip")
public WebElement zipCode;

@FindBy(name = "cardNo")
public WebElement cardNumber;

@FindBy(name = "cardExp")
public WebElement cardExp;

@FindBy(xpath = "//button[.='Process Order']")
public WebElement processOrderButton;


@FindBy(xpath = "//button[.='Calculate']")
public WebElement calculateButton;

@FindBy(xpath = "//td[.='Jane Doe']")
public WebElement nameVerification;
}
