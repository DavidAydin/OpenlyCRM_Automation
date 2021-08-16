package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.Login;
import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginStepDefs {
    @Given("the user is logged in as {string}")
    public void the_user_is_logged_in_as(String userType) {
        Login logIn= new Login();
        logIn.loginAs(userType);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
    
    }
}
