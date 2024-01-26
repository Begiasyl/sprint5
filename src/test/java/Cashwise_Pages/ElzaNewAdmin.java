package Cashwise_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElzaNewAdmin {
    public WebDriver driver;

    public ElzaNewAdmin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement signInBtn;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement logInEmail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement logInPassword;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement confirmSignInBtn;

    @FindBy(xpath = "(//*[@fill='none'])[9]")
    public WebElement changeLanguage;

    @FindBy(xpath = "//span[text()='Русский']")
    public WebElement russian;

    @FindBy(xpath = "//h2[text()='Инфографика']")
    public WebElement Infanographica;

    @FindBy(xpath = "//li[text()='Продажи']")
    public WebElement SalePage;

    @FindBy(xpath = "(//li[text()='Расходы'])[1]")
    public WebElement ExpensesPage;

    @FindBy(xpath = "//li[text()='Отчеты']")
    public WebElement reportsPage;

    @FindBy(xpath = "//a[text()='План счетов']")
    public WebElement invoicesPanButton;

    @FindBy(xpath = "//button[text()='Категория доходов (1)']")
    public WebElement categoryIncome;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement edit;

    @FindBy(xpath = "//input[@name='category_title']")
    public WebElement nameTitle;

    @FindBy(xpath = "//button[text()='Сохранить']")
    public WebElement saveChanges;

    @FindBy(xpath = "//span[text()='English']")
    public WebElement englishLanguage;
}
