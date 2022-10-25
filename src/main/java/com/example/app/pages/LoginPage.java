package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePageObject {

  public void inputUsername(String username) {
//    By locator = MobileBy.id("com.isl.simpleapp:id/username");
//    AndroidElement tfUsername = driver.findElement(locator);
//    tfUsername.clear();
//    tfUsername.sendKeys(username);
    type(MobileBy.id("username"), username);
  }

  public void inputPassword(String password) {
//    By locator = MobileBy.id("password");
//    AndroidElement tfPassword = driver.findElement(locator);
//    tfPassword.clear();
//    tfPassword.sendKeys(password);
    type(MobileBy.id("password"), password);
  }

  public void clickLoginBtn() {
//    By locator = MobileBy.id("login");
//    AndroidElement btnLogin = driver.findElement(locator);
//    btnLogin.click();
    click(MobileBy.id("login"));
  }
  public String getAppTitle(){
    return getText(MobileBy.xpath("//<android.view.ViewGroup[resource-id=" + "'com.isl.simpleapp:id/action_bar']//<android.widget.TextView>"));

  }
  public boolean checkSignInButton() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.id("login");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement signInButton = (AndroidElement) wait.until(ExpectedConditions
            .presenceOfElementLocated(locator));
    return signInButton.isDisplayed();
  }
}
