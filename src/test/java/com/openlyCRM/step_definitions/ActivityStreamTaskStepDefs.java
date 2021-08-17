package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.ActivityStreamPage;
import com.openlyCRM.pages.ActivityStreamTaskPage;
import com.openlyCRM.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.WeakHashMap;

public class ActivityStreamTaskStepDefs {
    
    
    
    @When("the user clicks on {string} tab on the quick navigation")
    public void the_user_clicks_on_tab_on_the_quick_navigation(String QN_tabName) {
        ActivityStreamPage activityStreamPage= new ActivityStreamPage();
        activityStreamPage.goToQuickNavigationTab(QN_tabName);
        
        
    }
    
    @When("the user clicks on the High Priority check box")
    public void the_user_clicks_on_the_HP_check_box() {
        ActivityStreamTaskPage activityStreamTaskPage = new ActivityStreamTaskPage();
        activityStreamTaskPage.highPriorityCB.click();
        
        
    }
    
    @Then("the High Priority check box should be selected")
    public void the_HP_check_box_should_be_selected() {
        ActivityStreamTaskPage activityStreamTaskPage = new ActivityStreamTaskPage();
        boolean highPriorityCBSelected = activityStreamTaskPage.highPriorityCB.isSelected();
        Assert.assertTrue("verify high priority is selected",highPriorityCBSelected);
        
    }
    
    @When("the user clicks on the Visual Editor icon")
    public void the_user_clicks_on_the_VE_icon() {
        ActivityStreamTaskPage activityStreamTaskPage = new ActivityStreamTaskPage();
        activityStreamTaskPage.visualEditorIcon.click();
        
    }
    
    @Then("the editor text box should be displayed")
    public void the_editor_text_box_should_be_displayed() {
        ActivityStreamTaskPage activityStreamTaskPage = new ActivityStreamTaskPage();
        boolean textEditorDisplayed = activityStreamTaskPage.textEditor.isDisplayed();
        Assert.assertTrue("verify that the text editor is displayed",textEditorDisplayed);
        
    }
    
    @When("the user clicks on the {string} link in Task")
    public void the_user_clicks_on_the_Checklist_link_in_Task(String taskLink) {
        ActivityStreamTaskPage activityStreamTaskPage = new ActivityStreamTaskPage();
        activityStreamTaskPage.goToTaskLinks(taskLink);
    }
    
    @When("the user enters {string} as description")
    public void the_user_enters_as_description(String checkListDescription) {
        ActivityStreamTaskPage activityStreamTaskPage = new ActivityStreamTaskPage();
        activityStreamTaskPage.checklistItemTextInput.sendKeys(checkListDescription);
      
    }
    
    @When("the user clicks on the add button")
    public void the_user_clicks_on_the_add_button() {
        ActivityStreamTaskPage activityStreamTaskPage = new ActivityStreamTaskPage();
        activityStreamTaskPage.addLink.click();
        
    }
    
    @Then("the {string} check list item should be added to the list")
    public void the_check_list_item_should_be_added_to_the_list(String expectedChecklistItem) {
        ActivityStreamTaskPage activityStreamTaskPage = new ActivityStreamTaskPage();
        List<String> actualChecklistItems = BrowserUtils.getElementsText(activityStreamTaskPage.savedChecklistItems);
        boolean doesContain = false;
        for (String actualChecklistItem : actualChecklistItems) {
            actualChecklistItem = actualChecklistItem.trim();
            expectedChecklistItem = expectedChecklistItem.trim();
            if (actualChecklistItem.equals(expectedChecklistItem)){
                doesContain=true;
                break;
            }
        }
        String verificationMessage = "verify that the checklist item \""+expectedChecklistItem+"\" is added";
        Assert.assertTrue(verificationMessage,doesContain);
        
    }
    
    @When("the user adds separator by clicking on separator link")
    public void the_user_adds_separator_by_clicking_on_separator_link() {
        new ActivityStreamTaskPage().separatorLink.click();
    }
    
    @Then("the separator line should appear after the last checklist item")
    public void the_separator_line_should_appear_after_the_last_checklist_item() {
        ActivityStreamTaskPage activityStreamTaskPage = new ActivityStreamTaskPage();
        List<WebElement> checklistSeparators = activityStreamTaskPage.ckhecklistSeparator;
        int oldSeparators = checklistSeparators.size();
        new ActivityStreamTaskPage().separatorLink.click();
        List<WebElement> checklistSeparatorsNew = activityStreamTaskPage.ckhecklistSeparator;
        int newSeparators = checklistSeparatorsNew.size();
        String verification = "verify that the number of separators increased by 1";
        Assert.assertEquals(verification,oldSeparators+1,newSeparators);
        
        
    }
    
    @When("the user hovers over the checlist item and clicks on the delete icon")
    public void the_user_hovers_over_the_checlist_item_and_clicks_on_the_delete_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @Then("the {string} checklist item should disappear")
    public void the_checklist_item_should_disappear(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @When("the user clicks on the clicks on the Deadline date box")
    public void the_user_clicks_on_the_clicks_on_the_Deadline_date_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @When("the user selects date {string} by using the date picker")
    public void the_user_selects_date_by_using_the_date_picker(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @Then("the date {string} should appear on the date box")
    public void the_date_should_appear_on_the_date_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @When("the user clicks on Time Planning link")
    public void the_user_clicks_on_Time_Planning_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @When("the user clicks on Start Task on date box")
    public void the_user_clicks_on_Start_Task_on_date_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @Then("the date {string} should appear on the start task on date box")
    public void the_date_should_appear_on_the_start_task_on_date_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @When("the user clicks on Finish date box")
    public void the_user_clicks_on_Finish_date_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @Then("the date {string} should appear on the Finish date box")
    public void the_date_should_appear_on_the_Finish_date_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @And("the user clicks on the checkmark")
    public void theUserClicksOnTheCheckmark() {
        new ActivityStreamTaskPage().addCheckMark.click();
    }
}
