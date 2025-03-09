package com.yourcompany.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TAUHomePage {
    WebDriver driver;

    // Locators
    By enrollNowButton = By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[1]/div/div[1]/section[1]/p[2]/a");

    public TAUHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://testautomationu.applitools.com/");
    }

    public String getTitle() {
        return driver.getTitle();
    }

    // Method to click "Enroll Now"
    public void clickEnrollNow() {
        WebElement enrollButton = driver.findElement(enrollNowButton);
        enrollButton.click();
    }
}
