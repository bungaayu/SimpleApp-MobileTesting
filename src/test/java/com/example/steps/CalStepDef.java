package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class CalStepDef extends BaseTest {

    //CALSCENARIO1
    @When("user input {int} on first number field")
    public void userInputOnFirstNumberField(int value) {
        calculatorPage.inputFirstNumber(value);
    }
    @And("user input {int} on second number field")
    public void userInputOnSecondNumberField(int value) {
    calculatorPage.inputSecondNumber(value);
    }
    @And("user choose {string} operator")
    public void userChooseOperator(String opr) {
        if(opr.equals("+")){
            calculatorPage.clickPenjumlahanOperation();
        } else if (opr.equals("-")) {
            calculatorPage.clickPenguranganOperation();
        } else if (opr.equals("*")) {
            calculatorPage.clickPerkalianOperation();
        } else if (opr.equals("/")){
            calculatorPage.clickPembagianOperation();
        }
    }
    @And("user click dropdown button")
    public void userClickDropdownButton() {
        calculatorPage.clickDropdownButton();
    }
    @And("user click equal button")
    public void userClickEqualButton() {
        calculatorPage.clickEqualButton();
    }
    @Then("result should be {int}")
    public void resultShouldBe(int value) {
        String hasilText = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : "+value, hasilText);

        boolean isDisplayed = calculatorPage.checkResults();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    //CALSCENARIO2 & CALSCENARIO3
    @When("user input {string} on first number field")
    public void userInputOnFirstNumberField(String value) {
        calculatorPage.invFirstInput(value);
    }
    @And("user input {string} on second number field")
    public void userInputOnSecondNumberField(String value) {
        calculatorPage.invSecondInput(value);
    }
    @Then("result should be {string}")
    public void resultShoulBe(String value) {
        String hasilText = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : "+value, hasilText);
        boolean isDisplayed = calculatorPage.checkResults();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }
}