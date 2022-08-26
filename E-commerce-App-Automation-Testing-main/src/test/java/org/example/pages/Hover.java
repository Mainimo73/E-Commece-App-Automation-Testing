package org.example.pages;

import org.example.stepDefs.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Hover {

    public  void  MouseHover(){

        WebElement  choose = Hocks.driver.findElement(By.xpath("//a[@href=\"/computers\"]"));

        Actions test = new Actions(Hocks.driver);

        test.moveToElement(choose).perform();
    }

    public WebElement subclick(){


     WebElement subclick  =  Hocks.driver.findElement(By.xpath("//a[@href=\"/software\"]"));

     return subclick;
    }

    public void asserttext(){

        String expect = Hocks.driver.findElement(By.cssSelector("div[class=\"page-title\"] h1\n")).getText();
        String act = "https://demo.nopcommerce.com/software";

        String expect2 = act.toLowerCase().trim();
        System.out.println(expect2);

        if (act.contains(expect2)) {

            Assert.assertEquals(act.contains(expect2), true);

            System.out.println("Assertion is success");
        }else {
            System.out.println("MAke Error While Assetion");

        }

    }
}
