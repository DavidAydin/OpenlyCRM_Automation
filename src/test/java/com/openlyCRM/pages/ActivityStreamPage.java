package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActivityStreamPage extends BasePage{
    
    @FindBy(xpath = "//a[@id='logo_24_a']")
    public WebElement homeLink;
    
    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']//span[contains(text(),'More')]")
    public WebElement QN_More;
    
    public void waitUntilHomeLinkIsClickable(){
        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.elementToBeClickable(homeLink));
    }
    
    public void goToQuickNavigationTab(String QN_tabName){
        waitUntilHomeLinkIsClickable();
        String tabLocator = "//div[@id='feed-add-post-form-tab']//span[contains(text(),'"+QN_tabName+"')]";
        Driver.get().findElement(By.xpath(tabLocator)).click();
    }
    
    public void goToMoreQuickNavigationTab(String QN_tabName){
        waitUntilHomeLinkIsClickable();
        QN_More.click();
        String tabLocator = "//div[@class='menu-popup-items']/span/span[contains(text(),'"+QN_tabName+"')]";
        Driver.get().findElement(By.xpath(tabLocator)).click();
    }
    
    
}
