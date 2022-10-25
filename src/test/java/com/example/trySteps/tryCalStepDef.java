//package com.example.trySteps;
//
//import com.example.BaseTest;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.hamcrest.MatcherAssert;
//import org.hamcrest.Matchers;
//import org.junit.jupiter.api.Assertions;
//
//public class tryCalStepDef extends BaseTest {
//    @When("user input a is {int}")
//    public void userInputAIs(int value) {
//        calculatorPage.inputFirstNumber(value);
//    }
//    @And("user input b is {int}")
//    public void userInputBIs(int value) {
//        calculatorPage.inputSecondNumber(value);
//    }
//    @And("user click pengurangan operation")
//    public void userClickMinusOperation() {
//        calculatorPage.clickPenguranganOperation();
//    }
//    @And("user click perkalian operation")
//    public void userClickMultiplyOperation() {
//        calculatorPage.clickPerkalianOperation();
//    }
//    @And("user click pembagian operation")
//    public void userClickPembagianOperation() {
//        calculatorPage.clickPembagianOperation();
//    }
////    @Then("penjumlahan result should be {int}")
////    public void penjumlahanResultShouldBe(int hasil) {
////        String hasilText = calculatorPage.getResult();
////        Assertions.assertEquals("Hasil : 5", hasilText);
////
////        boolean isDisplayed = calculatorPage.checkResults();
////        Assertions.assertTrue(isDisplayed);
////        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
////    }
////    @Then("pengurangan result should be {int}")
////    public void penguranganResultShouldBe(int result) {
////        String resultText = calculatorPage.getResult();
////        Assertions.assertEquals("Hasil : 3", resultText);
////
////        boolean isDisplayed = calculatorPage.checkResults();
////        Assertions.assertTrue(isDisplayed);
////        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
////    }
////    @Then("perkalian result should be {int}")
////    public void perkalianResultShouldBe(int result) {
////        String resultText = calculatorPage.getResult();
////        Assertions.assertEquals("Hasil : 4", resultText);
////
////        boolean isDisplayed = calculatorPage.checkResults();
////        Assertions.assertTrue(isDisplayed);
////        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
////    }
//
////    @Then("pembagian result should be {int}")
////    public void pembagianResultShouldBe(int result) {
////        String resultText = calculatorPage.getResult();
////        Assertions.assertEquals("Hasil : 10", resultText);
////
////        boolean isDisplayed = calculatorPage.checkResults();
////        Assertions.assertTrue(isDisplayed);
////        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
////    }
//}
