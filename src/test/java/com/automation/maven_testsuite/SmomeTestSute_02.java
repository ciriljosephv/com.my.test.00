package com.automation.maven_testsuite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SmomeTestSute_02 {
WebDriver driver = new FirefoxDriver();

    @Test
    public void reviewTest()
    {
        driver.findElement(By.id("searchTerm")).sendKeys("nike"+ Keys.ENTER);
        List<WebElement> reviewRatings = driver.findElements(By.cssSelector(".ac-facet__filters--rating .ac-facet__filter "));
        for(WebElement review :reviewRatings)
        {
            String customerRating = "3 or more";
            if(review.getText().equalsIgnoreCase(customerRating))
            {
                review.click();
                break;
            }


        }
    }





}
