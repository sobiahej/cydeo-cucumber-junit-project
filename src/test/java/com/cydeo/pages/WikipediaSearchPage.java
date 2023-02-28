package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class WikipediaSearchPage {
//create a constructor and initialize a driver with object

public WikipediaSearchPage(){
PageFactory.initElements(Driver.getDriver(),this);

}
@FindBy(id = "searchInput")
public WebElement searchBox;

@FindBy(xpath="//button[@type='submit']")
public WebElement searchButton;

@FindBy(xpath = "//span[@class='mw-page-title-main']")
public WebElement mainHeader;

@FindBy(xpath = "//div[@class='fn']")
public WebElement imageHeader;
}
