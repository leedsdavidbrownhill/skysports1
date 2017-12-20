package com.sky.sports;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.*;

public class NavigateMenuSpec {

    private NavigateMenu navigateM = new NavigateMenu();

    @Given("^I navigate to skysports homepage to select sub menu$")
    public void iNavigateToSkysportsHomepageToSelectSubMenu() {
        Assert.assertEquals("Sky Sports - Sports News, Transfers, Scores | Watch Live Sport", navigateM.goTo("Home"));
    }
 
    @When("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo (String Menu){
    		navigateM.selectMenu(Menu);
    		
    }
     
    @Then("^I can see \"([^\"]*)\"$")
    public void iCanSee(String pageText)
    {
    	
    		Assert.assertTrue("Unexpected page found!", navigateM.checkForText(pageText));
    		
    }
}
