package com.example.bbcselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {


    @Test
    public void seleniumTest()  {

        new ChromeDriver().get("https://www.google.com");
    }
}
