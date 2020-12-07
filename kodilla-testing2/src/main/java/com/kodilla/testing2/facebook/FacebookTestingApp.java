package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String BUTTON_ACCEPT_COOKIE ="//button[@title = \"Akceptuj wszystkie\"]";
    public static final String FIELD_FIRSTNAME = "//input[@name=\"firstname\"]";
    public static final String FIELD_LASTNAME = "//input[@name=\"lastname\"]";
    public static final String FIELD_EMAIL = "//input[@name=\"reg_email__\"]";
    public static final String FIELD_PASSWORD = "//input[@name = \"reg_passwd__\"]";
    public static final String FIELD_SEX = "//input[@type = \"radio\" and @name = \"sex\" and @value=\"1\"]";
    public static final String FIELD_BIRTHDAY_DAY = "//select[@name=\"birthday_day\"]";
    public static final String FIELD_BIRTHDAY_MONTH = "//select[@name=\"birthday_month\"]";
    public static final String FIELD_BIRTHDAY_YEAR = "//select[@name=\"birthday_year\"]";
    public static final String BUTTON_SUBMIT = "//button[@name=\"websubmit\" and @class=\"_6j mvm _6wk _6wl _58mi _6o _6v\"]";

    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/r.php?locale=pl_PL&display=page/");
        driver.manage().window().maximize();

        WebElement buttonAcceptCookie = driver.findElement(By.xpath(BUTTON_ACCEPT_COOKIE));
        buttonAcceptCookie.click();

        WebElement fieldFirstname = driver.findElement(By.xpath(FIELD_FIRSTNAME));
        fieldFirstname.sendKeys("Agnieszka");

        WebElement fieldLastname = driver.findElement(By.xpath(FIELD_LASTNAME));
        fieldLastname.sendKeys("Falandys");

        WebElement fieldEmail = driver.findElement(By.xpath(FIELD_EMAIL));
        fieldEmail.sendKeys("123123123");

        WebElement fieldPassword = driver.findElement(By.xpath(FIELD_PASSWORD));
        fieldPassword.sendKeys("haslo12345");

        WebElement fieldSex = driver.findElement(By.xpath(FIELD_SEX));
        fieldSex.click();

        WebElement selectBirthdayDay = driver.findElement(By.xpath(FIELD_BIRTHDAY_DAY));
        Select selectBoard = new Select(selectBirthdayDay);
        selectBoard.selectByIndex(17);

        WebElement selectBirthdayMonth = driver.findElement(By.xpath(FIELD_BIRTHDAY_MONTH));
        selectBoard = new Select(selectBirthdayMonth);
        selectBoard.selectByIndex(11);

        WebElement selectBirthdayYear = driver.findElement(By.xpath(FIELD_BIRTHDAY_YEAR + "/option[@value = \"1986\"]"));
        selectBirthdayYear.click();

        WebElement buttonSubmit = driver.findElement(By.xpath(BUTTON_SUBMIT));
        buttonSubmit.click();

    }
}
