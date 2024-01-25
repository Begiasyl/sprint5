package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private static  WebDriver driver ;
    private static String browser = Config.getValue("browser");


    public static WebDriver getDriver(){

      if(driver == null){
          if(browser.equalsIgnoreCase("chrome")){
              driver = new ChromeDriver();
              return driver;
          }else if(browser.equalsIgnoreCase("firefox")){
              driver = new FirefoxDriver();
          }
          else {
              driver = new ChromeDriver();
          }
          int pageLoadTimeOut = Integer.parseInt(Config.getValue("pageLoadTimeOut"));
          int implicitlyWait = Integer.parseInt(Config.getValue("implicitlyWait"));
          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.manage().window().maximize();
          return driver;


      }
      return  driver;
    }
    public static void quitBrowser(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }

    }


}
