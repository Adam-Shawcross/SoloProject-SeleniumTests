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

    public class HomeButtonTests{
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
    public void bannerTableTest() throws InterruptedException {
        driver.get("http://34.89.36.254/TablePage.html");
        Thread.sleep(2000);
        WebElement idBox = driver.findElementByClassName("banner");
       idBox.click();
        Thread.sleep(3000);
        assertEquals("Respotted Black", driver.getTitle());
        Thread.sleep(3000);
    }


    @Test
    public void bannerHomeTest() throws InterruptedException {
        driver.get("http://34.89.36.254/HomePage.html");
        Thread.sleep(2000);
        WebElement banner = driver.findElementByClassName("banner");
        banner.click();
        Thread.sleep(3000);
        assertEquals("Respotted Black", driver.getTitle());
        Thread.sleep(3000);
    }

    @Test
    public void bannerCreatePlayerTest() throws InterruptedException {
        driver.get("http://34.89.36.254/CreatePlayer.html");
        Thread.sleep(2000);
        WebElement banner = driver.findElementByClassName("banner");
        banner.click();
        Thread.sleep(3000);
        assertEquals("Respotted Black", driver.getTitle());
        Thread.sleep(3000);
    }

    @Test
    public void bannerCreateTournamentTest() throws InterruptedException {
        driver.get("http://34.89.36.254/CreateTournament.html");
        Thread.sleep(2000);
        WebElement banner = driver.findElementByClassName("banner");
        banner.click();
        Thread.sleep(3000);
        assertEquals("Respotted Black", driver.getTitle());
        Thread.sleep(3000);
    }

    @Test
    public void returnCreatePlayerTest() throws InterruptedException {
        driver.get("http://34.89.36.254/CreatePlayer.html");
        Thread.sleep(2000);
        WebElement banner = driver.findElementByXPath("/html/body/button");
        banner.click();
        Thread.sleep(3000);
        assertEquals("Respotted Black", driver.getTitle());
        Thread.sleep(3000);
    }

    @Test
    public void returnCreateTableTest() throws InterruptedException {
        driver.get("http://34.89.36.254/CreateTournament.html");
        Thread.sleep(2000);
        WebElement banner = driver.findElementByXPath("/html/body/button");
        banner.click();
        Thread.sleep(3000);
        assertEquals("Respotted Black", driver.getTitle());
        Thread.sleep(3000);
    }

    @Test
    public void returnTableTest() throws InterruptedException {
        driver.get("http://34.89.36.254/TablePage.html");
        Thread.sleep(2000);
        WebElement banner = driver.findElementByXPath("//*[@id=\"homeButton\"]");
        banner.click();
        Thread.sleep(3000);
        assertEquals("Respotted Black", driver.getTitle());
        Thread.sleep(3000);
    }



}