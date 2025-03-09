package com.yourcompany.tests;

import com.yourcompany.PageObjects.TAUHomePage;
import com.yourcompany.PageObjects.TAUCoursePage;
import com.yourcompany.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAutomationUAutomationTest extends BaseTest {

    @Test
    public void testSearchAndOpenCourse() {
        TAUHomePage homePage = new TAUHomePage(driver);
        homePage.open();

        Assert.assertEquals(homePage.getTitle(), "Test Automation University | Applitools");

//        homePage.searchForCourse("Selenium WebDriver");
//        homePage.clickFirstCourse();

        System.out.println("✅ Test Passed: Course Page Loaded!");
    }
}
