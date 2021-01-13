
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Two {
    WebDriver driver = new ChromeDriver();
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
//        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test2() throws Exception {
        driver.get("https://www.google.ru/");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("QA Engeener");
        driver.findElement(By.xpath("//form[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li[2]/div/div[2]/div/span/b")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/a/h3/span")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
        driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div/div/div[2]/div[3]/div/a/span[4]")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }
    
}
