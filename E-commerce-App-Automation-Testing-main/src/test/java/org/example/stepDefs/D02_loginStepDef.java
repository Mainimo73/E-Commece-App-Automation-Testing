package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class D02_loginStepDef {

   Login log = new Login();

   @Given("user go to login page")

    public void LOGIN(){

       log.loginBtn().click();
   }

  @And("^user enter  \"(.*)\" and \"(.*)\"$")

    public void EnterValidData(String Mail , String Pass){

       log.Data("test@example.com", "P@ssw0rd");

  }

    @And("^user enter invalid \"(.*)\" and \"(.*)\"$")

    public void EnterInValidData(String WMail , String WPass){

       log.WData("wrong@example.com" , "P@ssw0rd");

    }


    @When("user press on login button")

    public void LogBtn(){

        log.LBtn().sendKeys(Keys.ENTER);
   }

   @Then("user login to the system successfully")

    public void LogPass(){

       log.Successmsg();


   }


   @Then("user could not login to the system")

   public void LogFailed(){

        log.FailedLogin();
   }
}
