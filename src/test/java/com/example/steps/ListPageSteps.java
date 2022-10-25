package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ListPageSteps extends BaseTest {

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }
  @And("user do long press")
  public void userDoLongPress() {
    listPage.longPressList();
  }
  @And("user do taps")
  public void userDoTaps() {
    listPage.tapsList();
  }
}
