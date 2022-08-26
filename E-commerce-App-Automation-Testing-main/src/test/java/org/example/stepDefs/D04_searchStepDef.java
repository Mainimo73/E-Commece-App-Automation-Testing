package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import io.cucumber.java.eo.Se;
import org.example.pages.Search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class D04_searchStepDef {

    Search srh = new Search();

    @Given("user write \"laptop\" in search tab")

    public void ProductName(){

          srh.SName();
    }

    @When("enter on search button")
    public void SBtn(){

        srh.SearchBtn().click();

    }

    @And("make sure that link contain the mentioned link")

    public void Link(){

        srh.PageLink();
    }

    @And("get the number of products and make sure that every result contain the product name")
    public void  NofProducts(){

           srh.NumberOfResult();

    }



//       List <WebElement> list = (List<WebElement>) Hocks.driver.findElements(By.cssSelector("//img[@src='https://demo.nopcommerce.com/images/thumbs/0000026_asus-n551jk-xo076h-laptop_415.jpeg']"));
//
//
//        System.out.println("The Total of Results = "   + list.size());
//
//        for (int i=0 ; i < list.size() ; i ++){
//
//            System.out.println(list.get(i).getText());
//
//            if (list.get(i).getText().contains("laptop")){
//
//                list.get(i).click();
//            }
//        }


    }


