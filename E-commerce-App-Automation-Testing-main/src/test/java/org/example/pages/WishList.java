package org.example.pages;

import org.example.stepDefs.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WishList {

    public WebElement WishBtn(){

        WebElement WishBtn = Hocks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));

        return  WishBtn ;

    }

    public void assertonsms(){

               String ExpectedSMS = "The product has been added to your wishlist";
               String ActualSMS  = Hocks.driver.findElement(By.className("content")).getText();

               Assert.assertEquals(ActualSMS.contains(ExpectedSMS) , true);

               String ExpectedColor = "#4bb07a";

         String ActualColor =  Hocks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div")).getCssValue("background-color");

               String  HexValue = Color.fromString(ActualColor).asHex();
              Assert.assertEquals(HexValue.contains(ExpectedColor) , true);


        System.out.println(ActualSMS);
        System.out.println(ActualColor);
        System.out.println(HexValue);


    }

    public WebElement WishListBtn(){

        WebElement WishListBtn = Hocks.driver.findElement(By.xpath("//a[@href=\"/wishlist\"]"));

        return WishListBtn;

    }

    public WebElement WishBtnAgain(){

        WebElement WishBtnAgain = Hocks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));

        return WishBtnAgain ;
    }

    public void QTY(){

        String quantity = Hocks.driver.findElement(By.className("qty-input")).getAttribute("value");


//        WebDriverWait wait = new WebDriverWait(Hocks.driver , Duration.ofSeconds(5));
//
//        wait.until(ExpectedConditions.alertIsPresent());

        Assert.assertNotNull(quantity);

        System.out.println(quantity);



    }
}
