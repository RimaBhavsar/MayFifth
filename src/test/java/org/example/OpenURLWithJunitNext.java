package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLWithJunitNext {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test
    public void openNext(){
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();

    }
    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();

    }
}
