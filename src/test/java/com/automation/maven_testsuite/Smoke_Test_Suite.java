package com.automation.maven_testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Smoke_Test_Suite {
    WebDriver driver;

 @Test
    public void browserSetUp() {
        driver = new FirefoxDriver();
        driver.get("https://www.argos.co.uk/");


    }


    @After
    public void broserQuit() {

    }


    @Test

    public void doSearch() {

    }


}
