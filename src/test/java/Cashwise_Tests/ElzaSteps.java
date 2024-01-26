package Cashwise_Tests;

import Cashwise_Pages.ElzaNewAdmin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class ElzaSteps {

    WebDriver driver = Driver.getDriver();
    ElzaNewAdmin elzaNewAdmin = new ElzaNewAdmin(driver);

    @Given("user go on {string}")
    public void user_go_on(String page) {
        driver.get(page);
    }

    @When("user clicks on SignIn button")
    public void user_clicks_on_sign_in_button() throws InterruptedException {
        Thread.sleep(2000);
        elzaNewAdmin.signInBtn.click();
    }

    @Then("user clicks on email line and delete previous users credential")
    public void user_clicks_on_email_line_and_delete_previous_users_credential() {
        elzaNewAdmin.logInEmail.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.COMMAND).perform();

    }

    @Then("user add correct {string}")
    public void user_add_correct(String email) {
        elzaNewAdmin.logInEmail.sendKeys(email);
    }

    @Then("user clicks on password line and delete previous users credential")
    public void user_clicks_on_password_line_and_delete_previous_users_credential() {
        elzaNewAdmin.logInPassword.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.COMMAND).perform();
    }

    @Then("user insert correct {string}")
    public void user_insert_correct(String password) {
        elzaNewAdmin.logInPassword.sendKeys(password);
    }

    @Then("user clicks on SignIn2 button")
    public void user_clicks_on_sign_in2_button() {
        elzaNewAdmin.confirmSignInBtn.click();
    }


    @Given("user clicks on change language dropdown")
    public void user_clicks_on_change_language_dropdown() throws InterruptedException {
        Thread.sleep(10000);
        elzaNewAdmin.changeLanguage.click();

    }
    @When("user choose russian language")
    public void user_choose_russian_language() throws InterruptedException {
        Thread.sleep(3000);
        elzaNewAdmin.russian.click();
    }
    @Then("user scrolldown the page to verify that all main page now in russian language")
    public void user_scrolldown_the_page_to_verify_that_all_main_page_now_in_russian_language() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
    }
    @Then("user clicks on Sales button")
    public void user_clicks_on_sales_button() {
        elzaNewAdmin.SalePage.click();
    }
    @Then("user checks Expenses button")
    public void user_checks_expenses_button() {
        elzaNewAdmin.ExpensesPage.click();
    }
    @Then("user clicks on Reports button")
    public void user_clicks_on_reports_button() {
        elzaNewAdmin.reportsPage.click();
    }
    @Then("user choose invoices from Reports page")
    public void user_choose_invoices_from_reports_page() {
        elzaNewAdmin.invoicesPanButton.click();
    }
    @Then("user clicks on income category")
    public void user_clicks_on() {
        elzaNewAdmin.categoryIncome.click();
    }
    @Then("user edit english note")
    public void user_edit_english_note() {
        elzaNewAdmin.edit.click();
    }
    @Then("user print name in Russian language")
    public void user_print_name_in_russian_language() throws InterruptedException {
        elzaNewAdmin.nameTitle.click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.COMMAND).perform();
        elzaNewAdmin.nameTitle.sendKeys("Категория");

    }
    @Then("user clicks on save")
    public void user_clicks_on_save() throws InterruptedException {
        Thread.sleep(2000);
        elzaNewAdmin.saveChanges.click();
    }
    @Then("user change back for English language")
    public void user_change_back_for_english_language() {
        elzaNewAdmin.changeLanguage.click();
        elzaNewAdmin.englishLanguage.click();
    }






}

