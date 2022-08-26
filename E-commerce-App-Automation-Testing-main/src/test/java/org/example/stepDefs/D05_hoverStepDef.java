package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Hover;



public class D05_hoverStepDef {

    Hover hov = new Hover();

    @Given("customer cane make hover fo example \"Computers\" category")
    public void MAkeHover(){

          hov.MouseHover();
    }


    @When("select one of the three sub categories like \"Software\" sub category")

    public void SubSelect(){

            hov.subclick().click();

    }

    @Then("get text of page for sub category and assert that the it title is equal or contains the result from get text")

    public void getAssert() {

        hov.asserttext();

    }
}
