package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.Currensies;

public class D03_currencyStepDef {

    Currensies currency = new Currensies();



    @Given("Select Euro currency from products and assert that \"$\" already found in 4 products")

    public void select(){

        currency.ero();


    }


}
