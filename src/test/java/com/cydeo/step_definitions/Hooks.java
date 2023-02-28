package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
will be able to create pre and post-condition for all scenarios
 */
public class Hooks {

@Before
public void setupMethod(){
System.out.println("---> @Before: Running before each scenario");
}
@After
public void tearDownMethod(){
System.out.println("---> @After: Running after each scenario");
Driver.closeDriver();
}


/*
@BeforeStep
public void setupStep(){
System.out.println("---> @BeforeSTEP: Running before each step");
}
@AfterStep
public void teardownStep(){
System.out.println("---> @AfterSTEP: Running after each step");
}
*/
}
