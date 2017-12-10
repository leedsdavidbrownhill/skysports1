package com.sky.sports;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomepageSpec {

    private Homepage homepage = new Homepage();

    @Given("^I navigate to skysports homepage$")
    public void iNavigateToSkysportsHomepage() {
        Assert.assertEquals("Sky Sports - Sports News, Transfers, Scores | Watch Live Sport", homepage.goTo());
    }

    @Then("^I should see the skysports logo$")
    public void iShouldSeeTheSkysportsLogo() {
        Assert.assertTrue("Site Logo was not found!", homepage.isLogoDisplayed());
    }

}
