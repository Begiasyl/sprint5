package Cashwise_Tests;

import Cashwise_Pages.KarinaPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KarinaSteps {

    WebDriver driver = new ChromeDriver();
    KarinaPage karinaPage = new KarinaPage(driver);

    @Given("user logs in Cashwise account")
    public void user_logs_in_cashwise_account() throws InterruptedException {

        driver.get(" https://www.cashwise.us/main");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("admin555@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Codewiser123");
        driver.findElement(By.xpath("(//button[text()='Sign in'])[2]")).click();
        Thread.sleep(7000);
        karinaPage.salesButton.click();
        Thread.sleep(3000);
        karinaPage.invoiceButton.click();
    }
    @Given("user clicks to create invoice button")
    public void user_clicks_to_create_invoice_button() {
        karinaPage.createInvoiceButton.click();
    }
    @Then("user enters all the valid fields")
    public void user_enters_all_the_valid_fields() {
        Faker faker = new Faker();
        karinaPage.invoiceName.sendKeys(faker.name().name());

        Actions actionsTest = new Actions(driver);
        actionsTest.click(karinaPage.whomButton).pause(500).sendKeys(Keys.ENTER).perform();


        karinaPage.payUntil.click();
        Actions actions = new Actions(driver);
        actions.sendKeys("12/02/2024").perform();

        karinaPage.description.click();
        Actions actionsDescription = new Actions(driver);
        actions.sendKeys("Invoice").perform();



    }
        @Then("user have to select product or service")
    public void user_have_to_select_product_or_service() {
         karinaPage.selectProductButton.click();

         karinaPage.pickTitle.click();

        }
    @Then("user clicks to save  button")
    public void user_clicks_to_save_button() {
        karinaPage.saveButton.click();

    }
    @Given("user chooses the first invoice")
    public void user_chooses_the_first_invoice() {
    }
    @Then("user click on three dots")
    public void user_click_on_three_dots() throws InterruptedException {
        Thread.sleep(3000);
        karinaPage.treeDots.click();

    }
    @Then("user clicks on show PDF version")
    public void user_clicks_on_show_pdf_version() throws InterruptedException {
        Thread.sleep(300);
        karinaPage.PDFversion.click();
    }
    @Then("user scroll up and clicks to Download PDF")
    public void user_scroll_up_and_clicks_to_download_pdf() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, -500)");
        Thread.sleep(300);

        karinaPage.download.click();
        driver.quit();
    }

}