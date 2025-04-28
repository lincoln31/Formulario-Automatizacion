package com.co.prueba.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.globalsqa.com/angularJs-protractor/registration-login-example/#/register")
public class RegisterPage extends PageObject {

    By TXT_FIRST_NAME = By.xpath("// input[@id=\"firstName\"]");
    By TXT_LAST_NAME = By.xpath("// input[@id=\"Text1\"]");
    By TXT_USERNAME = By.xpath("// input[@id=\"username\"]");
    By TXT_PASSWORD = By.xpath("// input[@id=\"password\"]");
    By BT_REGISTER = By.xpath("// button[@type=\"submit\"]");

    By LBL_LOGIN = By.xpath("//*[text()=\"Login\"]");

    public By getLBL_LOGIN() {
        return LBL_LOGIN;
    }

    public void setLBL_LOGIN(By LBL_LOGIN) {
        this.LBL_LOGIN = LBL_LOGIN;
    }

    public By getTXT_FIRST_NAME() {
        return TXT_FIRST_NAME;
    }

    public void setTXT_FIRST_NAME(By TXT_FIRST_NAME) {
        this.TXT_FIRST_NAME = TXT_FIRST_NAME;
    }

    public By getTXT_LAST_NAME() {
        return TXT_LAST_NAME;
    }

    public void setTXT_LAST_NAME(By TXT_LAST_NAME) {
        this.TXT_LAST_NAME = TXT_LAST_NAME;
    }

    public By getTXT_USERNAME() {
        return TXT_USERNAME;
    }

    public void setTXT_USERNAME(By TXT_USERNAME) {
        this.TXT_USERNAME = TXT_USERNAME;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }

    public By getBT_REGISTER() {
        return BT_REGISTER;
    }

    public void setBT_REGISTER(By BT_REGISTER) {
        this.BT_REGISTER = BT_REGISTER;
    }





}
