package com.automation.maven_testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import splitSute.Hooks;

import javax.swing.*;
import java.util.List;

public class Smoke_test_next_03 extends Hooks
{
    WebDriver driver;

    @Before
    public void browserSetUp() {
        driver = new FirefoxDriver();
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    @Test
    public void searchBoxTest() {
        driver.findElement(By.id("sli_search_1")).sendKeys("nike" + Keys.ENTER);
        driver.findElement(By.className("SearchButton")).click();
        List<WebElement> genderList = driver.findElements(By.cssSelector(".Gender .OptionName"));
        for(WebElement genders : genderList){
           String givenValue= "Men";
            if (genders.getText().equalsIgnoreCase(givenValue)){
                genders.click();
                break;
            }

        }

//        String actualDomValue = driver.findElement(By.className("search-title__term")).getText();
//        String MyExepctedValue = "nike";
//        Assert.assertEquals(actualDomValue,MyExepctedValue);

    }
}