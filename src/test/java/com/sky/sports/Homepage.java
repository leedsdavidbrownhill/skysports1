package com.sky.sports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    private WebDriver driver;

    public Homepage() {
        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "site-header__logo")
    private WebElement siteLogo;

    /**
     * Navigates to the homepage
     * @return the page title of the homepage
     */
    public String goTo() {
        driver.get("http://www.skysports.com");
        return driver.getTitle();
    }

    /**
     * checks if a logo is displayed
     * @return true if logo is displayed
     */
    public boolean isLogoDisplayed() {
        return siteLogo.isDisplayed();
    }

}
