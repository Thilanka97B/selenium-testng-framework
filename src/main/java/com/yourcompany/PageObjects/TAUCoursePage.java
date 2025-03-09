package com.yourcompany.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TAUCoursePage {
    WebDriver driver;

    // Locator for the course title on the course page
    By courseTitle = By.className("course-title"); // Update the locator if needed

    // Constructor
    public TAUCoursePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to get the course title text
    public String getCourseTitle() {
        return driver.findElement(courseTitle).getText();
    }
}
