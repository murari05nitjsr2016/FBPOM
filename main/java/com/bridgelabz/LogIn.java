package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn extends BasePage {
    //declaration
    @FindBy(id = "email")
    WebElement email;

    @FindBy(name = "pass")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;


    public LogIn(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void inputEmail(String inputEmail) {
        email.sendKeys(inputEmail);
    }

    public void inputPassword(String inputPassword) {
        password.sendKeys(inputPassword);
    }

    public void clickOnLogIn() {
        loginBtn.click();
    }

    public void loginTo_Application(String email,String pwd ) throws InterruptedException {
        Thread.sleep(2000);
        inputEmail(email);
        Thread.sleep(2000);
        inputPassword(pwd);
        Thread.sleep(2000);
        clickOnLogIn();
        Thread.sleep(2000);


    }
}
