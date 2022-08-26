package org.example.pages;

import org.example.stepDefs.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomeSlider {

    public WebElement Cslider(){

        WebElement Cslider = Hocks.driver.findElement(By.tagName("img"));

        Hocks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            return Cslider;

    }

    public void  ass1(){
        String expectedresult = "https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualresult = Hocks.driver.getCurrentUrl();

        Assert.assertEquals(actualresult.contains(expectedresult) , true);


    }

    public WebElement slider2(){

        WebElement slider2 = Hocks.driver.findElement(By.tagName("img"));

        Hocks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return slider2;
    }

    public void ass2(){

            String ER = " https://demo.nopcommerce.com/iphone-6";
            String AR = Hocks.driver.getCurrentUrl();

            Assert.assertEquals(AR.contains(ER) , true);

    }
}
