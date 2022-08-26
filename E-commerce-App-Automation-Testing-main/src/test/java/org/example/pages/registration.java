package org.example.pages;

import io.netty.handler.codec.spdy.SpdyWindowUpdateFrame;
import org.example.stepDefs.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class registration {


    public WebElement RgisterBtn() {

        WebElement RgisterBtn = Hocks.driver.findElement(By.className("ico-register"));

        return RgisterBtn;



    }


    public WebElement Gender() {

        WebElement Gender = Hocks.driver.findElement(By.className("female"));

        return Gender;
    }



    By  First_Name = By.name("FirstName");
    By Last_Name = By.id("LastName");

public  void EnterUsername1 (String Name1){

    Hocks.driver.findElement(First_Name).sendKeys(Name1);

}

    public  void EnterUsername2 (String Name2){

        Hocks.driver.findElement(Last_Name).sendKeys(Name2);

    }



public  void  FullName(String Name1, String Name2){

    Hocks.driver.findElement(First_Name).sendKeys(Name1);
    Hocks.driver.findElement(Last_Name).sendKeys(Name2);

}


         public  WebElement list1(){

             WebElement list1 = Hocks.driver.findElement(By.name("DateOfBirthDay"));
             Select  droplist1 = new Select(list1);
             droplist1.selectByIndex(3);

             return list1;
         }

    public  WebElement list2(){

        WebElement list2 = Hocks.driver.findElement(By.name("DateOfBirthMonth"));
        Select  droplist2 = new Select(list2);
        droplist2.selectByIndex(9);

        return list2;
    }

    public  WebElement list3(){

        WebElement list3 = Hocks.driver.findElement(By.name("DateOfBirthYear"));
        Select  droplist3 = new Select(list3);
        droplist3.selectByIndex(87);

        return list3;
    }

   public  void maill (){

       Hocks.driver.findElement(By.id("Email")).sendKeys("test@example.com");


    }


    public WebElement psw () {

     return Hocks.driver.findElement(By.id("Password"));

    }

    public WebElement Cpsw (){

       return Hocks.driver.findElement(By.id("ConfirmPassword"));
    }


    public  void  FPass(String Password, String ConfirmPassword){

       psw().sendKeys(Password);
       Cpsw().sendKeys(ConfirmPassword);

    }

     public WebElement  Btn (){

      WebElement Btn =    Hocks.driver.findElement(By.id("register-button"));

      return Btn ;
     }

     public void message (){

         String ExpectedResult = "Your registration completed";

         String  ActualResult = Hocks.driver.findElement(By.className("result")).getText();

         Assert.assertEquals(ActualResult.contains(ExpectedResult) , true);



     }


}
