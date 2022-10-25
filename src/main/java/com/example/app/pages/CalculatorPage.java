package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public String getCalTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id=" +
            "'com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }
  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions
            .presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }
  public void inputFirstNumber(int firstNumber){
    type(MobileBy.id("et_1"), firstNumber);
  }
  public void inputSecondNumber(int secondNumber){
    type(MobileBy.id("et_2"), secondNumber);
  }
  public void clickPenjumlahanOperation(){
    click(MobileBy.xpath("//android.widget.TextView[@text='+']")); //*[contains(@class,"android.widget.TextView")][1]
  }
  public void clickPenguranganOperation(){
    click(MobileBy.xpath("//android.widget.TextView[@text='-']"));
  }
  public void clickPerkalianOperation(){
    click(MobileBy.xpath("//android.widget.TextView[@text='*']"));
  }
  public void clickPembagianOperation(){
    click(MobileBy.xpath("//android.widget.TextView[@text='/']"));
  }
  public void clickDropdownButton(){
    click(MobileBy.id("spinner_1"));
  }
  public void clickEqualButton(){
    click(MobileBy.id("acb_calculate"));
  }
  public String getResult(){
    return getText(MobileBy.id("tv_result"));
  }
  public boolean checkResults() {
    By locator = MobileBy.id("tv_result");
//    AndroidElement resultBtn = driver.findElement(locator);
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement resultBtn = (AndroidElement) wait.until(ExpectedConditions
            .presenceOfElementLocated(locator));
    return resultBtn.isDisplayed();

    //explicit wait
//    By locator = MobileBy.id("tv_result");
//    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
//    AndroidElement resultBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//    return resultBtn.isDisplayed();
  }

  public void invFirstInput(String firstInput){
    type(MobileBy.id("et_1"), firstInput);
  }
  public void invSecondInput(String secondInput){
    type(MobileBy.id("et_2"), secondInput);
  }
}
