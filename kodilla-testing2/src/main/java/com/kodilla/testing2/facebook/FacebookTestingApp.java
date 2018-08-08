package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"5k_5\")]/span/span/select[3]";


    public static void main(String [] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        Select selectDay = new Select(driver.findElement(By.xpath(XPATH_SELECT_DAY)));
        selectDay.selectByVisibleText("1");
        Select selectMonth = new Select(driver.findElement(By.xpath(XPATH_SELECT_MONTH)));
        selectMonth.selectByVisibleText("sty");
        Select selectYear = new Select(driver.findElement(By.xpath(XPATH_SELECT_YEAR)));
        selectYear.selectByVisibleText("1960");

    }
}
