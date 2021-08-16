package com.openlyCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamTaskPage extends BasePage{
    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriorityCB;
    
    
    
    
}
