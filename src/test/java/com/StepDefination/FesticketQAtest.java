package com.StepDefination;

import com.driverclass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class FesticketQAtest extends driverclass

{
    @When("^I click on log in button$")
    public void iClickOnLogInButton() {
    driver.findElement(By.xpath("//*[@id=\"root\"]/main/nav/ul/li[6]/div/button/span/span")).click();
    }

    @Then("^I should see login text as \"([^\"]*)\"$")
    public void iShouldSeeLoginTextAs(String logintext) throws Throwable {
        String expectedlogin  = "Log In";
        String actuallogin;
        actuallogin = driver.findElement(By.cssSelector(".styles__c-sc-1plpryh-2")).getText();
        assertEquals(expectedlogin,actuallogin);
        }

    @Given("^I enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String email) throws Throwable {
        driver.findElement(By.id("emailInput")).sendKeys("test1@gmail.com");
    }

    @Given("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) throws Throwable {
        driver.findElement(By.id("passwordInput")).sendKeys("festicket");
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() {
    driver.findElement(By.xpath("//*[@id=\"submitButton\"]/span")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
    }

    @When("^I click on cross button image on top right corner$")
    public void iClickOnCrossButtonImageOnTopRightCorner() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/nav/ul/li[6]/div/div/div[1]/span")).click();
    }

    @Then("^I should see expected user name$")
    public void iShouldSeeExpectedUserName() {
    String Actualname;
    String Expectedname = "Xyz abc";
    Actualname = driver.findElement(By.xpath("/html/body/div[1]/main/nav/ul/li[6]/div/div/div[2]/a/div/h3")).getText();
    assertEquals(Expectedname,Actualname);
    }
    @When("^I click on log out$")
    public void iClickOnLogOut() {
        driver.findElement(By.xpath("/html/body/div[1]/main/nav/ul/li[6]/div/div/div[2]/div/a[4]")).click();
    }
}
