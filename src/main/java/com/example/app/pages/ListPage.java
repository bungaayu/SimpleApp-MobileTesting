package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.sun.org.apache.xpath.internal.operations.And;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ListPage extends BasePageObject {

  public void swipeList() {
//    TouchAction action = new TouchAction(getDriver());
//    AndroidElement containerList = find(MobileBy.id("recycler_view"));
//    Point coordinate = containerList.getCenter();
//    PointOption start = PointOption.point(coordinate);
//    PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
//    //builder
//    action
//        .press(start)
//        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//        .moveTo(end)
//        .release()
//        .perform();
    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
  }
  public void longPressList(){
    AndroidElement elementLongPress = find(MobileBy.xpath("//*[contains(@text,\"List ke-1\")]")); //"//android.widget.TextView[@text='List ke-1']"
    TouchAction action = new TouchAction(getDriver());
    action.longPress(PointOption.point(elementLongPress.getCenter()))
            .waitAction(WaitOptions.waitOptions(
                    Duration.of(5, ChronoUnit.SECONDS))).release()
            .perform();
  }
  public void tapsList(){
    AndroidElement elementMultipleTap = find(MobileBy.xpath("//*[contains(@text,\"List ke-1\")]")); //"//android.widget.TextView[@text='List ke-1']"
    TouchAction action = new TouchAction(getDriver());
    action.tap(TapOptions.tapOptions().withTapsCount(5)
            .withElement(ElementOption.element(elementMultipleTap)))
            .perform();
  }
}
