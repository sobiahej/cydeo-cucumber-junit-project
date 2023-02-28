package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
In this class, we will be creating re-usable logic to read from configuration.properties file
 */
public class ConfigurationReader {
//1- create the property object(Create Object)
//make it private so its not accessible from outside the class
//"static" is to make sure its created and loaded before everything else
private static Properties properties=new Properties();

static {
//2-open file using FileInputStream(Open file)
//FileInputStream file= null;
try {
FileInputStream file = new FileInputStream("configuration.properties");
properties.load(file);
file.close();
} catch (IOException e) {
System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!");
e.printStackTrace();
}

//3-Load the "properties" object with "file" (load properties)
//try {
//properties.load(file);
//} catch (IOException e) {
//throw new RuntimeException(e);
}


// create a utility method to use the object to read
//4-Use "properties object to read from the file (read properties)
public static String getProperty(String keyword){
return properties.getProperty(keyword);
}
}
