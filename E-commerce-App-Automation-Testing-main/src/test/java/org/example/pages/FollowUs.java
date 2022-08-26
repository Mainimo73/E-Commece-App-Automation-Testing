package org.example.pages;

import org.example.stepDefs.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

public class FollowUs {

    public WebElement Face(){

        WebElement Face = Hocks.driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));

        return  Face;

    }

    public void assertF(){

        ArrayList<String> tabs = new ArrayList<>(Hocks.driver.getWindowHandles());
        Hocks.driver.switchTo().window(tabs.get(1));

        System.out.println(Hocks.driver.getCurrentUrl());
        System.out.println(Hocks.driver.getTitle());

        Assert.assertEquals(Hocks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");

        Hocks.driver.close();

        Hocks.driver.switchTo().window(tabs.get(0));

        System.out.println(Hocks.driver.getCurrentUrl());
        System.out.println(Hocks.driver.getTitle());

    }

    public WebElement Twit(){

        WebElement Twit = Hocks.driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));

        return  Twit;
    }

    public void assertT(){

        ArrayList<String> twitter = new ArrayList<>(Hocks.driver.getWindowHandles());
        Hocks.driver.switchTo().window(twitter.get(1));

        System.out.println(Hocks.driver.getCurrentUrl());
        System.out.println(Hocks.driver.getTitle());

        Assert.assertEquals(Hocks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");

        Hocks.driver.close();

        Hocks.driver.switchTo().window(twitter.get(0));

        System.out.println(Hocks.driver.getCurrentUrl());
        System.out.println(Hocks.driver.getTitle());
    }

    public WebElement Rss(){

        WebElement Rss = Hocks.driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));

        return  Rss;

    }

    public void  assertRss(){

        ArrayList<String> Rss = new ArrayList<>(Hocks.driver.getWindowHandles());
        Hocks.driver.switchTo().window(Rss.get(1));

        System.out.println(Hocks.driver.getCurrentUrl());
        System.out.println(Hocks.driver.getTitle());

        Assert.assertEquals(Hocks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");

        Hocks.driver.close();

        Hocks.driver.switchTo().window(Rss.get(0));

        System.out.println(Hocks.driver.getCurrentUrl());
        System.out.println(Hocks.driver.getTitle());
    }

    public WebElement Youtube(){

        WebElement Youtube = Hocks.driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));

        return  Youtube;
    }

    public void assertYou(){

        ArrayList<String> Youtube = new ArrayList<>(Hocks.driver.getWindowHandles());
        Hocks.driver.switchTo().window(Youtube.get(1));

        System.out.println(Hocks.driver.getCurrentUrl());
        System.out.println(Hocks.driver.getTitle());

        Assert.assertEquals(Hocks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");

        Hocks.driver.close();

        Hocks.driver.switchTo().window(Youtube.get(0));

        System.out.println(Hocks.driver.getCurrentUrl());
        System.out.println(Hocks.driver.getTitle());
    }
}
