package org.example.pages;

import io.cucumber.java.mk_latn.No;
import org.example.stepDefs.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Search {


    public void SName(){

       Hocks.driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
    }


    public WebElement SearchBtn(){

         WebElement SearchBtn = Hocks.driver.findElement(By.xpath("//button[@type=\"submit\"]"));

         return SearchBtn;
    }

    public void PageLink(){

        SoftAssert softass = new SoftAssert();

        String expected = "https://demo.nopcommerce.com/search?q=";

        softass.assertEquals(Hocks.driver.getCurrentUrl().contains(expected) , "https://demo.nopcommerce.com/search?q=");


    }

    public void NumberOfResult(){

        List <WebElement> list = Hocks.driver.findElements(By.xpath("//ul[@id='ui-id-1']//li/descendant::a[@id='ui-id-20']"));


           int SRH = list.size();

        for (int i=0 ; i < SRH ; i ++){

             String NoSearch = Hocks.driver.findElements(By.xpath("//ul[@id='ui-id-1']//li/descendant::a[@id='ui-id-20']")).get(i).getText();

                 System.out.println(i);
                System.out.println(NoSearch);

            Assert.assertTrue(NoSearch.contains("laptop"));

            System.out.println("Assertion true");

        }

    }
}
