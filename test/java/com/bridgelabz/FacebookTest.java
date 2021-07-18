package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTest extends BasePage {
    @Test
    public void loginTo_Application_with_valid_credentials() throws InterruptedException {
        //create object of Login Class
        LogIn login = new LogIn(driver);
        login.loginTo_Application("nk404788@gmail.com", "@mango987");

    }


}
