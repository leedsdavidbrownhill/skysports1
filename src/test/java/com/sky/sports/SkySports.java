package com.sky.sports;

public abstract class SkySports {
	
	public abstract String goTo(String page);
	
	public abstract boolean isLogoDisplayed();
	
	public abstract void submitSearch(String searchString);
	
	public abstract boolean isValidSearch(String searchString);
	
	public abstract boolean validLoadTime(String page);
	
	public abstract boolean checkForText(String text);
	
	public abstract void clickLinkByHref(String href);
	
	
}
