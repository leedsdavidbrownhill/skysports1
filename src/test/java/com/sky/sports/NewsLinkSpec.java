package com.sky.sports;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.*;

public class NewsLinkSpec {

    private NewsLink newsLink = new NewsLink();

    @Given("^I navigate to skysports homepage for news$")
    public void iNavigateToSkysportsHomepageForNews() {
        Assert.assertEquals("Sky Sports - Sports News, Transfers, Scores | Watch Live Sport", newsLink.goTo("Home"));
    }
 
    @When("^I click on a news link$")
    public void iClickOnANewsLink (){
    		newsLink.submitNewsRequest();
    }
     
    @Then("^the page will be identified by \"([^\"]*)\"$")
    public void thePageWillBeIdentifiedBy(String title)
    {
    	
    		Assert.assertTrue( title + " not found!", newsLink.checkForText(title));
    		
    }
}
