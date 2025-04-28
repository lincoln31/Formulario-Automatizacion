package com.co.prueba.stepsdefinitions;

import com.co.prueba.pageobjects.RegisterPage;
import com.co.prueba.steps.RegistrStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Registerstepsdefinitions {


    @Steps
    RegistrStep registrStep;


    @Given("He user is on the web page")
    public void heUserIsOnTheWebPage() {
        registrStep.openBrowser();

    }
    @When("He user enter the data for the register")
    public void heUserEnterTheDataForTheRegister() {
        registrStep.enterName();
        registrStep.enterLastName();
        registrStep.userName();
        registrStep.password();
        registrStep.clickButton();

        try {

            Thread.sleep(3000);

        }catch (InterruptedException e) {

            e.printStackTrace();

        }


    }
    @Then("He could see login")
    public void heCouldSeeLogin() {

        registrStep.ValidaRegister();
        try {

            Thread.sleep(3000);

        }catch (InterruptedException e) {

            e.printStackTrace();

        }

    }
}
