package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EBayTestingApp {
    public static final String SEARCHFIELD = "_nkw";
    public static final String SELECTFIELD = "_sacat";

    public static void main(String[] args) {
        WebDriver driverConfig = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverConfig.get("https://www.ebay.com/");

        WebElement searchField = driverConfig.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Laptop");
        Select dropdown = new Select(driverConfig.findElement(By.name(SELECTFIELD)));
        dropdown.selectByVisibleText("Computers/Tablets & Networking");
        searchField.submit();

    }
}
