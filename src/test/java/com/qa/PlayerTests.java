package com.qa;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class PlayerTests {

    private ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SoloProject-SeleniumTests\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void createPlayer() throws InterruptedException{
        driver.get("http://34.89.36.254/CreatePlayer.html");
        Thread.sleep(2000);
        WebElement firstName =  driver.findElementByXPath("/html/body/section/form/p[1]/input");
        firstName.sendKeys("Selenium");

        WebElement lastName = driver.findElementByXPath("/html/body/section/form/p[2]/input");
        Thread.sleep(2000);
        lastName.sendKeys("test");

        WebElement age = driver.findElementByXPath("/html/body/section/form/p[3]/input");
        Thread.sleep(1000);
        age.sendKeys("20");

        WebElement ranking = driver.findElementByXPath("/html/body/section/form/p[4]/input");
        Thread.sleep(1000);
        ranking.sendKeys("100");

        WebElement earnings = driver.findElementByXPath("/html/body/section/form/p[5]/input");
        Thread.sleep(1000);
        earnings.sendKeys("20000");

        WebElement submit = driver.findElementByXPath("/html/body/section/form/button");
        Thread.sleep(1000);
        submit.click();
        Thread.sleep(2000);

        assertEquals(driver.findElementByXPath("/html/body/section/section[1]/table/tr[8]/td[4]").getText(), "Selenium");
    }

    @Test
    public void deletePlayer() throws InterruptedException{
        driver.get("http://34.89.36.254/CreatePlayer.html");
        Thread.sleep(2000);
        String id = driver.findElementByXPath("/html/body/section/section[1]/table/tr[8]/td[4]").getText());


    }


}
