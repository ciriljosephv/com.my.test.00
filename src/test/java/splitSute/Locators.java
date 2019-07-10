package splitSute;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Locators extends Hooks {
    @Test
    public void reviewTest() {
        driver.findElement(By.id("searchTerm")).sendKeys("nike" + Keys.ENTER);
        List<WebElement> reviewRatings = driver.findElements(By.cssSelector(".ac-facet__filters--rating .ac-facet__label--rating"));
        for (WebElement review : reviewRatings) {
            String customerRating = "4or more";
            if (review.getText().equalsIgnoreCase(customerRating)) {
                review.click();
                break;
            }

           @Test
            public void recievstr ()
            {
                List<Double> starValue = new ArrayList<>();
                List<WebElement> rewstrs = driver.findElements(By.className("ac-star-rating__filled-stars"));
                for (WebElement rewstr : rewstrs) {
                    String noOfStars = rewstr.getAttribute("data-");

                }

            }

        }
    }
}
