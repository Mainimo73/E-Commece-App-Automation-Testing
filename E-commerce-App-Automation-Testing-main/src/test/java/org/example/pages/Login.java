package org.example.pages;

import org.example.stepDefs.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Login {

    public WebElement loginBtn()
    {
        WebElement loginBtn = Hocks.driver.findElement(By.className("ico-login"));

         return  loginBtn;
    }



    public WebElement Email(){

        return  Hocks.driver.findElement(By.id("Email"));

    }

    public WebElement Password(){

        return Hocks.driver.findElement(By.id("Password"));
    }

    public void Data(String Mail , String Pass){

        Email().sendKeys(Mail);
        Password().sendKeys(Pass);
    }


    public void WData(String WMail , String WPass){

        Email().sendKeys(WMail);
        Password().sendKeys(WPass);
    }
    public WebElement  LBtn (){

        WebElement LBtn =  Hocks.driver.findElement(By.id("Password"));

        return LBtn ;
    }



    public void Successmsg(){
        SoftAssert soft = new SoftAssert();


        soft.assertEquals(Hocks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

        soft.assertAll();
    }

    public  void FailedLogin() {

        SoftAssert soft = new SoftAssert();

        String Expected = "#e4434b";

        WebElement msg = Hocks.driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));

        String Colorr = msg.getCssValue("color");

        String hexColor = Color.fromString(Colorr).asHex();

        String Actual = hexColor;
        soft.assertEquals(Actual, Expected);

        soft.assertAll();


    }
}
