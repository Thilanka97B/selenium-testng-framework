package com.yourcompany.tests;

import com.yourcompany.PageObjects.LoginPage;
import com.yourcompany.PageObjects.TAUHomePage;
import com.yourcompany.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnrollTest extends BaseTest {

    @Test
    public void testEnrollNow() {
        TAUHomePage homePage = new TAUHomePage(driver);
        homePage.open();
        System.out.println("Opened Test Automation University!");

        // Verify Page Title
        Assert.assertEquals(homePage.getTitle(), "Test Automation University | Applitools");

        // Click "Enroll Now" Button
        homePage.clickEnrollNow();
        System.out.println("✅ Clicked 'Enroll Now' button!");

        // Wait for login page to load
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        // Sign in with Google
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickGoogleSignIn();
        System.out.println("✅ Clicked 'Sign in with Google'!");

        loginPage.signInWithGoogle("bhagyathilanka@gmail.com", "973383566Vb");
        System.out.println("✅ Successfully signed in with Google!");
    }
}
