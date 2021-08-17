package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ActivityStreamTaskPage extends BasePage{
    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriorityCB;
    
    @FindBy(xpath = "//span[@id='lhe_button_editor_task-form-lifefeed_task_form']")
    public WebElement visualEditorIcon;
    
    @FindBy(xpath = "//div[@id='bx-html-editor-tlbr-lifefeed_task_form']")
    public WebElement textEditor;
    
    @FindBy(xpath = "//input[@class='js-id-checklist-is-form-title task-checklist-field-add']")
    public WebElement checklistItemTextInput;
    
    @FindBy(xpath = "//span[@class='js-id-checklist-is-open-form task-dashed-link-inner']")
    public WebElement addLink;
    
    @FindBy(xpath = "//span[@class='js-id-checklist-is-i-title ']")
    public List<WebElement> savedChecklistItems;
    
    public void goToTaskLinks(String linkName){
        String xPath = "//span[@data-bx-id='task-edit-toggler'][contains(text(),'"+linkName+"')]";
        Driver.get().findElement(By.xpath(xPath)).click();
    }
    
    
    
}
