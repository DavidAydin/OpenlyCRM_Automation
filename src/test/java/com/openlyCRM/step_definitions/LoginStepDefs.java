package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.Login;
import io.cucumber.java.en.Given;

public class LoginStepDefs {
    @Given("the user is logged in as {string}")
    public void the_user_is_logged_in_as(String userType) {
        Login log= new Login();
        log.loginAs(userType);
    }
}
