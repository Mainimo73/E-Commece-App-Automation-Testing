package org.example.pages;

import org.example.stepDefs.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Currensies {

    public void ero(){


        List<WebElement>  list = Hocks.driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));

         int elements = list.size();

         for (int i =0 ; i < elements ; i++){

           String  NoElements = Hocks.driver.findElements(By.xpath("//span[@class=\"price actual-price\"]")).get(i).getText();

                System.out.println(i);
                System.out.println(NoElements);

             Assert.assertTrue(NoElements.contains("$"));

         }

    }



}
