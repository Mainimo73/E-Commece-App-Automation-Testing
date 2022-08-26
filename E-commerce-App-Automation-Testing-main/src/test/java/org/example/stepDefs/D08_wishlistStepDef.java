package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.WishList;

public class D08_wishlistStepDef {

    WishList wishlist = new WishList();


    @Given("click on wishlist button on this product \"HTC One M8 Android L 5.0 Lollipop\"")

    public void wish(){

        wishlist.WishBtn().click();

    }

    @Then("assert on success message and his background color")

    public void SuccessSMS(){


        wishlist.assertonsms();
    }

    @Given("click on wishlist button on the same product")
    public  void Clic2(){

        wishlist.WishBtnAgain().click();
    }
    @When("click on wishlist button")

    public void ListClick(){

        wishlist.WishListBtn().click();

    }

    @Then("assert that Qty value bigger than 0")

    public void getvalue(){

        wishlist.QTY();
    }
}
