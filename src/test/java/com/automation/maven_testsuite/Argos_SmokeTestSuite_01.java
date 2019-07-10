package com.automation.maven_testsuite;


import org.hamcrest.text.IsEqualIgnoringCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Argos_SmokeTestSuite_01
{
        WebDriver driver;
        private Object assertThat;

        @Before
        public void browserSetUp()
        {
            driver = new FirefoxDriver();
            driver.get("https://www.argos.co.uk/");
            driver.manage().window().maximize();
            //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        }

        @Test
        public void searchBoxTest() {
            driver.findElement(By.id("searchTerm")).sendKeys("nike" + Keys.ENTER);
            //        //driver.findElement(By.className("ac-icon__search")).click();
            String actualDomValue = driver.findElement(By.className("search-title__term")).getText();
            String MyExepctedValue = "nike";
            Assert.assertEquals(actualDomValue, MyExepctedValue);
        }
            @Test
            public void recievstr()
        {
            List<Double> starValue = new ArrayList<>();
            List<WebElement> rewstrs = driver.findElements(By.className("ac-star-rating__filled-stars"));
            for(WebElement rewstr:rewstrs){
                String noOfStars= rewstr.getAttribute("data-");

        }

        }


            //Assertion / comparison using hamcrest

            //assertThat(actualDomValue,is(equalTo("nike")));




        @Test
        public void reviewTest()
        {
            driver.findElement(By.id("searchTerm")).sendKeys("nike"+ Keys.ENTER);
            List<WebElement> reviewRatings = driver.findElements(By.cssSelector(".ac-facet__filters--rating .ac-facet__label--rating"));
            for(WebElement review :reviewRatings)
            {
               String customerRating = "4or more";
                if(review.getText().equalsIgnoreCase(customerRating))
                {
                    review.click();
                     break;
                }


        }
    }

   @After
    public void browserQuit()
    {
      driver.quit();
    }
}



