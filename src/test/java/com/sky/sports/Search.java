package com.sky.sports;


import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search extends SkyPage {



    /**
     * Submit search for input parameter string
     * 
     */
    public void submitSearch(String searchString) {
    		
    		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
    		searchBox.sendKeys(searchString + "\n");
    		
    }
    
    public boolean isValidSearch(String searchString)
    {
    		WebElement searchResultsHeader = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("swap-text__target")));

    		List<WebElement> findElements = driver.findElements(By.className("news-list__headline-link"));

    		String third_link = findElements.get(0).getAttribute("href");
    		driver.navigate().to(third_link);
    		return checkForText(searchString);

    }    
    
 
}
