package com.myfirstproject;

import org.junit.Assert;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class Day08_JavascriptExecutor extends TestBase {
    @Test
    public void scrollIntoView() throws InterruptedException {
//        CREATING javascript executor object
//        Casting driver
        JavascriptExecutor je= (JavascriptExecutor) driver;
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);
        WebElement ourRooms = driver.findElement(By.xpath("//*[.='Our Rooms']"));
        je.executeScript("arguments[0].scrollIntoView(true);",ourRooms);
    }

    @Test
    public void clickWithJS(){
        driver.get("http://a.testaddressbook.com/sign_in");
//        click on sign in button using js executor
        WebElement signInButton=driver.findElement(By.xpath("//input[@type='submit']"));
//        signInButton.click();
//      Normally, click() method wors wiht selenium. We use this when it is good.
//        Some elements can be challenging to click
//        In that case, we have javascriptexecutor click as an alternative
//        This performs better on some applications
//        Note that we can use js click anytime
//        1. create javascriptexecutor object
        JavascriptExecutor je=(JavascriptExecutor) driver;
//        2. use the aproppriate method
        je.executeScript("arguments[0].click();",signInButton);
//        Assert that the click happened using the message
        Assert.assertTrue(driver.getPageSource().contains("Bad email or password."));
    }
    @Test
    public void scrollDownWithJS() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);
//        Scroll down to the page using js executor
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }
}
