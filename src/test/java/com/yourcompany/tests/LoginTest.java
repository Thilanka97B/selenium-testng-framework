package com.yourcompany.tests;

import com.yourcompany.PageObjects.LoginPage;
import com.yourcompany.base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        driver.get("https://example.com/login");

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("testuser", "testpassword");

        System.out.println("✅ Login Test Completed!");
    }
}
