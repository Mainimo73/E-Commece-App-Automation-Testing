package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.FollowUs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followusStepDef {

    FollowUs follow = new FollowUs();


    @Given("customer navigate to facebook")
    public void navigateF() throws InterruptedException {

            follow.Face().click();

            Thread.sleep(3000);
    }

    @Then("link is opened in new tab for facebook")
    public void LinkF() {

        follow.assertF();

    }

    @Given("customer navigate to twitter")
    public void navigateT() throws InterruptedException {

        follow.Twit().click();
        Thread.sleep(3000);
    }

    @Then("link is opened in new tab for twitter")
    public void LinkT(){

      follow.assertT();

    }

    @Given("customer navigate to rss")
    public void navigateRss() throws InterruptedException {

        follow.Rss().click();

        Thread.sleep(3000);

    }

    @Then("link is opened in new tab for rss")
    public void LinkRss(){

        follow.assertRss();

    }

    @Given("customer navigate to youtube")
    public void navigateYou() throws InterruptedException {

             follow.Youtube().click();

             Thread.sleep(3000);
    }

    @Then("link is opened in new tab for youtube")
    public void LinkYou(){

        follow.assertYou();

    }
}
