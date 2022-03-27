package com.hooks;

import com.driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/** 
 * Represents Hooks in framework.
 * @author Nisha Vekariya
 * @version 1.0
*/
public class Hooks {
	
	@Before(order=0)
    public void beforeScenarioStart(){
        System.out.println("-----------------Start of Scenario-----------------");
    } 
	
	@Before(order=1)
    public void setUp() throws Exception {
		Driver.initialize();
    }
	
	@After(order=1)
    public void tearDown(Scenario scenario) {
		Driver.quit();
    }
	
	@After(order=0)
    public void afterScenarioFinish(){
        System.out.println("-----------------End of Scenario-----------------");
    } 

}
