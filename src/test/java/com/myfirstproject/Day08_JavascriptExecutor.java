package com.myfirstproject;
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
}
