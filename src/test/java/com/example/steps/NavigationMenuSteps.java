package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class NavigationMenuSteps extends BaseTest {
    @When("user click hamburger button")
    public void userClickHamburgerButton() {
        navigationMenu.clickHamburgerButton();
    }
    @And("user click list menu")
    public void userClickListMenu() {
        navigationMenu.clickListMenu();
    }
}
