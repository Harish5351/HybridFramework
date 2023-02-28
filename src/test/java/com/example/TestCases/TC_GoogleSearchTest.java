package com.example.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.Pages.GooglePage;

public class TC_GoogleSearchTest extends BaseClass{
    @Test
   public void SearchBox(){
        GooglePage Gp = new GooglePage(driver);
        driver.get(googlebaseurl);
        logger.info("URL is opened");
        if (driver.getTitle().equals("Google")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        Gp.writeText();
        logger.info("Text Entered");
   }
}
