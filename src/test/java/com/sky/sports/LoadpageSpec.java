package com.sky.sports;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.*;

public class LoadpageSpec {

    private Loadpage loadpage = new Loadpage();

    @Given("^I navigate to skysports homepage to load$")
    public void iNavigateToSkysportsHomepageToLoad() {
        Assert.assertEquals("Sky Sports - Sports News, Transfers, Scores | Watch Live Sport", loadpage.goTo("Home"));
    }

    @Then("^the home page will load within 5 seconds$")
    public void theHomePageWillLoadWithinFiveSeconds() {
        Assert.assertTrue("Site loaded too slowly", loadpage.validLoadTime("Home"));
    }
    
}
