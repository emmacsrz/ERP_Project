package com.briteerp.pages;


import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="login")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;



    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(name = "_submit")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

    public void loginDynamic(String userType){

        userType = userType.replace(" ","_");

        String username= ConfigurationReader.getProperty(userType + "_username");
        String password= ConfigurationReader.getProperty(userType + "_password");

        login(username,password);


    }

}
