package com.example.TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.Pages.LoginPage;
import com.google.common.io.Files;

public class TC_LoginTest extends BaseClass{
    @Test
    public void LoginToWebsite(){
        LoginPage Lp = new LoginPage(driver);
        driver.get(loginbaseurl);
        Lp.enterUsername(uname);
        logger.info("Entered Username");
        Lp.enterPassword(upwd);
        logger.info("Entered Password");
        Lp.submitButton();
        logger.info("Clicked on login button");
        if (driver.getCurrentUrl().equals(SuccessURL)) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(screen, new File("Screenshots/login.jpg"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
