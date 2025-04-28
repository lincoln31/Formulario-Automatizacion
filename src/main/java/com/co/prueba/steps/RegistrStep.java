package com.co.prueba.steps;

import com.co.prueba.pageobjects.RegisterPage;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.regex.Matcher;

public class RegistrStep {

    RegisterPage registerPage = new RegisterPage();


    @Step
    public void openBrowser(){
        registerPage.open();
    }
    @Step
    public void enterName(){
        registerPage.getDriver().findElement(registerPage.getTXT_FIRST_NAME())
                .sendKeys("Juan Esteban");
    }
    @Step
    public void enterLastName(){
        registerPage.getDriver().findElement(registerPage.getTXT_LAST_NAME())
                .sendKeys("Collazos valencia");
    }

    @Step
    public void userName(){
        registerPage.getDriver().findElement(registerPage.getTXT_USERNAME())
                .sendKeys("Lincoln54");
    }
    @Step
    public void password(){
        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD())
                .sendKeys("entrar123");
    }
    @Step
    public void clickButton(){
        registerPage.getDriver().findElement(registerPage.getBT_REGISTER())
                .click();
    }
    @Step
    public void ValidaRegister(){
        Assert.assertThat(registerPage.getDriver()
                .findElement(registerPage.getLBL_LOGIN()).isDisplayed(),
                Matchers.is(true));
    }


}
