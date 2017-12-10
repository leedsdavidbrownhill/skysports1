package com.sky.sports;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hooks {

    private DesiredCapabilities getChromeCapabilities() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        return capabilities;
    }

    @Before
    public void buildDriver() {
        final String property = "webdriver.chrome.driver";
        final String driverLocation = "drivers/chromedriver";
        System.setProperty(property, driverLocation);

        DriverFactory.setDriver(new ChromeDriver(getChromeCapabilities()));
    }

    @After
    public void destroyDriver() {
        if (null != DriverFactory.getDriver()) {
            DriverFactory.getDriver().close();
        }
    }

}
