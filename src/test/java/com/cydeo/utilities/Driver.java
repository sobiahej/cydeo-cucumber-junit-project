package com.cydeo.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
// create a private constructor to remove access to this object

private Driver(){}
/*
We make the webdriver private because we want to close access from outside the class
 */
//private static WebDriver driver;
// create a reusable utility method which will return the same driver instance
private static InheritableThreadLocal<WebDriver> driverPool=new InheritableThreadLocal<>();

public static WebDriver getDriver(){

if (driverPool.get()==null){
/*
We will read our browser type from config.properties file. We can control which browser is opened outside our code
 */
String browserType=ConfigurationReader.getProperty("browser");

switch (browserType){
case "chrome":
//WebDriverManager.chromedriver().setup();
driverPool.set(new ChromeDriver());
driverPool.get().manage().window().maximize();
driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

break;

case "firefox":
//WebDriverManager.firefoxdriver().setup();
driverPool.set(new FirefoxDriver());
driverPool.get().manage().window().maximize();
driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
break;
}
}
return driverPool.get();

}
public static void closeDriver(){
if (driverPool.get()!=null){
/*
this line will terminate the currently existing driver completely. It will not go forward
 */
driverPool.get().quit();
/*
We assign the value to "null" so the singleton can create a newer one if needed
 */
driverPool.remove();
}
}
}
