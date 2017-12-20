package com.sky.sports;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SkyPage extends SkySports{

	static WebDriver driver;
	
    public SkyPage() {

        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);

    }

	@Override
	public String goTo(String page) {
		switch (page) {
		case "Home":
			{
				driver.get("http://www.skysports.com");
	        
				return driver.getTitle();
			}
		default:
			return null;
		}
	}

	@Override
	public void clickLinkByHref(String href) {
        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        Iterator<WebElement> i = anchors.iterator();
 
        while(i.hasNext()) {
            WebElement anchor = i.next();
            if(anchor.getAttribute("href").contains(href)) {
                anchor.click();
                break;
            }
        }
    }

	@Override
	public boolean validLoadTime(String page) {
				
		switch (page) {
		case "Home":
			{
				        
		        driver.get("http://www.skysports.com");
		        
		        JavascriptExecutor js = (JavascriptExecutor) driver;
				
				long pageLoaded = (Long) js.executeScript("return window.performance.timing.loadEventEnd;");
				
				long initialPageLoad = (Long) js.executeScript("return window.performance.timing.navigationStart;");
		        
				long timeToLoad = (pageLoaded - initialPageLoad)/1000;
			
				return timeToLoad <= 5;
			}
		default:
			return false;
		}
		
		

    }



	@Override
	public boolean isLogoDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}





	@Override
	public void submitSearch(String searchString) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public boolean isValidSearch(String searchString) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkForText(String text) {
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
		if (list.size() > 0)
			return true;
		else
			return false;
	}
	

	
	
}
