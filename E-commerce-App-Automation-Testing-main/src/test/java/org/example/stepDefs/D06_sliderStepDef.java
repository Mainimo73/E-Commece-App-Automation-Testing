package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomeSlider;

public class D06_sliderStepDef {

    HomeSlider slider = new HomeSlider();

    @Given("user click on first slider")

    public void clickslider(){

       slider.Cslider().click();

    }
    @Then("make assert onn url for expected and actual")
    public void assertslider(){

               slider.ass1();
    }

    @When("user click on second slider")
    public void clickslider2(){

         slider.slider2().click();
    }

    @Then("make assert on url for expected and actual")
    public void assertslider2(){

        slider.ass2();

    }
}
