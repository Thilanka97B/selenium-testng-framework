package com.yourcompany.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;

public class LoginPage {
    WebDriver driver;

    // Locators for Google Sign-in
    By signInWithGoogleButton = By.xpath("//*[@id=\"firebaseui-auth-container\"]/div/div[1]/form/ul/li[2]/button/span[2]");
    By emailField = By.xpath("//input[@type='email']");
    By nextButton = By.xpath("//*[@id=\"firebaseui-auth-container\"]/div/form/div[3]/div/button[2]");
    By signInWithGoogle = By.xpath("//*[@id=\"firebaseui-auth-container\"]/div/form/div[3]/div/button");
    By passwordField = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click "Sign in with Google"
    public void clickGoogleSignIn() {
        driver.findElement(signInWithGoogleButton).click();
    }

    // Handle Google Authentication
    public void signInWithGoogle(String email, String password) {
        // Store the main window
        String mainWindow = driver.getWindowHandle();

        // Switch to Google Login Window
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        // Enter Email
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(nextButton).click();
        driver.findElement(signInWithGoogle).click();

        // Wait for password field to appear (adjust timing if needed)
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        // Enter Password
//        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(signInWithGoogle).click();

        // Switch back to main window
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        driver.switchTo().window(mainWindow);
    }
}
