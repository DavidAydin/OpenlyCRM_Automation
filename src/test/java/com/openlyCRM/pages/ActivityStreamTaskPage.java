package com.openlyCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamTaskPage extends BasePage{
    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriorityCB;
    
    @FindBy(xpath = "//span[@id='lhe_button_editor_task-form-lifefeed_task_form']")
    public WebElement visualEditorIcon;
    
    @FindBy(xpath = "//div[@id='bx-html-editor-tlbr-lifefeed_task_form']")
    public WebElement textEditor;
    
    
    
}
