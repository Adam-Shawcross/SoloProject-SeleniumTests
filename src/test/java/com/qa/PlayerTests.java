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
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shawc\\Desktop\\SoloProject-SeleniumTests\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void deletePlayer() throws InterruptedException{
        driver.get("http://34.89.36.254/TablePage.html");
        Thread.sleep(3000);
        String id = driver.findElementByXPath("/html/body/section/section[1]/table/tr[8]/td[1]").getText();
        WebElement input = driver.findElementByXPath("//*[@id=\"playerid\"]");
        input.sendKeys(id);
        Thread.sleep(2000);
        WebElement deleteButton = driver.findElementByXPath("//*[@id=\"deleteplayerform\"]/button");
        deleteButton.click();
        Thread.sleep(2000);
        assertEquals(driver.findElementsByXPath("/html/body/section/section[1]/table/tr[8]/td[1]").size() == 0, true);


    }

    @Test
    public void updatePlayer() throws InterruptedException{
        driver.get("http://34.89.36.254/TablePage.html");
        Thread.sleep(3000);
        String id = driver.findElementByXPath("/html/body/section/section[1]/table/tr[8]/td[1]").getText();
        WebElement idBox = driver.findElementByXPath("//*[@id=\"id\"]");
        WebElement firstNameBox = driver.findElementByXPath("//*[@id=\"firstName\"]");
        WebElement lastNameBox = driver.findElementByXPath("//*[@id=\"lastName\"]");
        WebElement ageBox = driver.findElementByXPath("//*[@id=\"age\"]");
        WebElement earningsBox = driver.findElementByXPath("//*[@id=\"earnings\"]");
        WebElement submitButton = driver.findElementByXPath("//*[@id=\"bulk\"]/div/div/div[1]/form[1]/button");
        idBox.sendKeys(id);
        Thread.sleep(1500);
        firstNameBox.sendKeys("Selenium Update");
        Thread.sleep(1500);
        lastNameBox.sendKeys("update");
        Thread.sleep(1500);
        ageBox.sendKeys("20");
        Thread.sleep(1500);
        earningsBox.sendKeys("2000");
        Thread.sleep(1500);
        submitButton.click();
        Thread.sleep(2000);

        assertEquals(driver.findElementByXPath("/html/body/section/section[1]/table/tr[8]/td[4]").getText(), "Selenium Update");
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

}
