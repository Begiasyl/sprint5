package Cashwise_Tests;

import Cashwise_Pages.Begimai_page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;

public class Begimai_Tests {
    WebDriver driver = new ChromeDriver();
    Begimai_page begimaiPage = new Begimai_page(driver);

    @Given("user logs in Cashwise account")
    public void user_logs_in_cashwise_account() throws InterruptedException {
        driver.get(" https://www.cashwise.us/main");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("admin555@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Codewiser123");
        driver.findElement(By.xpath("(//button[text()='Sign in'])[2]")).click();
    }

    @When("user clicks on the Admin Codewise drop menu")
    public void user_clicks_on_the_admin_codewise_drop_menu() throws InterruptedException {
        Thread.sleep(2000);
        begimaiPage.adminCodewiseDropdown.click();
    }

    @When("user selects the Create Account option")
    public void user_selects_the_create_account_option() throws InterruptedException {
        Thread.sleep(2000);
        begimaiPage.createAccount.click();
    }

    @When("And the user enters new account all the valid fields")
    public void and_the_user_enters_new_account_all_the_valid_fields(DataTable dataTable) throws InterruptedException {
        Map<String, String> accountDetails = dataTable.asMap(String.class, String.class);

        begimaiPage.name.sendKeys(accountDetails.get("Name"));
        begimaiPage.surename.sendKeys(accountDetails.get("Surname"));
        begimaiPage.email.sendKeys(accountDetails.get("Email"));
        Thread.sleep(3000);
        begimaiPage.password.sendKeys(accountDetails.get("Password"));
        begimaiPage.confirmPassword.sendKeys(accountDetails.get("Confirm Password"));

        System.out.println("Test 1: User creates a new account with valid  credentials");
    }
    @When("user enters an invalid phone number with only zeros {string}")
    public void user_enters_an_invalid_phone_number_with_only_zeros(String string) {
        begimaiPage.phonenumber.sendKeys(string);
    }


    @When("user clicks on the Create button")
    public void user_clicks_on_the_create_button() {
        begimaiPage.create.click();
    }

    @When("clicks on the Admin Codewise drop menu")
    public void clicks_on_the_admin_codewise_drop_menu() throws InterruptedException {
        Thread.sleep(2000);
        begimaiPage.adminCodewiseDropdown.click();
    }

    @When("selects the Create Account option")
    public void selects_the_create_account_option() throws InterruptedException {
        Thread.sleep(2000);
        begimaiPage.createAccount.click();
    }

    @Then("enters invalid name {string}")
    public void enters_invalid_name(String string) {
        begimaiPage.name.sendKeys(string);
    }

    @Then("And the user enters new account details")
    public void and_the_user_enters_new_account_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        Map<String, String> accountDetails = dataTable.asMap(String.class, String.class);

        begimaiPage.surename.sendKeys(accountDetails.get("Surname"));
        begimaiPage.email.sendKeys(accountDetails.get("Email"));
        begimaiPage.phonenumber.sendKeys(accountDetails.get("Phone Number"));
        Thread.sleep(3000);
        begimaiPage.password.sendKeys(accountDetails.get("Password"));
        begimaiPage.confirmPassword.sendKeys(accountDetails.get("Confirm Password"));

        System.out.println("Test 1: User creates a new account with valid  credentials");
    }

    @Then("the user clicks on the Create button")
    public void the_user_clicks_on_the_create_button() {
        begimaiPage.create.click();
    }


}
