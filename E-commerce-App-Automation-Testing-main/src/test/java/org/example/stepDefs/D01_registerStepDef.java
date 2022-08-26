package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D01_registerStepDef {

    registration reg = new registration();

    @Given("user go to register page")

    public void open_browser(){

      reg.RgisterBtn().click();


    }

    @And("user select gender type")

    public  void gender(){

      reg.Gender().click();
    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")

    public void enter_data(String Name1 , String Name2){

        reg.FullName(Name1, Name2);

    }

    @And("user enter date of birth")

    public void  birth(){

        reg.list1();
        reg.list2();
        reg.list3();

    }

    @Then("user enter email \"test@example.com\" field")

    public void enter_mail(){

      reg.maill();
    }

    @And("^user fills Password fields \"(.*)\" and \"(.*)\"$")

    public void security(String Password, String ConfirmPassword){

       Hocks.driver.findElement(By.id("Password")).sendKeys(Password);
        Hocks.driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);

    }


    @And("user clicks on register button")

    public void register(){

           reg.Btn().click();

    }

    @And("success message is displayed")

    public void success_message(){

       reg.message();

    }



}
