package com.sky.sports;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.*;

public class LoginSpec {

    private Login login = new Login();

    @Given("^I navigate to skysports login with an invalid account$")
    public void iNavigateToSkysportsLoginWithAnInvalidAccount() {
        Assert.assertEquals("Sky Sports - Sports News, Transfers, Scores | Watch Live Sport", login.goTo("Home"));
    }
 
    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnInvalidUsernameAndPassword (String username, String password){
    		Login.LoginAs(username).WithPassword(password).Login();
    }
     
    @Then("^I should be refused access$")
    public void iShouldBeRefusedAccess()
    {
    	
    		Assert.assertTrue("Invalid login not found!", login.checkForText("Sorry, we did not recognise either your username or password"));
    		
    }
}