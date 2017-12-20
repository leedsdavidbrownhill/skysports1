package com.sky.sports;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.*;

public class SearchSpec {

    private Search search = new Search();

    @Given("^I navigate to skysports homepage to search$")
    public void iNavigateToSkysportsHomepageToSearch() {
        Assert.assertEquals("Sky Sports - Sports News, Transfers, Scores | Watch Live Sport", search.goTo("Home"));
    }
 
    @When("^I search for the string \"([^\"]*)\"$")
    public void iSearchForTheString (String query){
    		search.submitSearch(query);
    }
     
    @Then("^the top result will contain the text \"([^\"]*)\"$")
    public void theTopResultWillContainTheText(String result)
    {
    	
    		Assert.assertTrue( result + " not found!", search.isValidSearch(result));
    		
    }
}
