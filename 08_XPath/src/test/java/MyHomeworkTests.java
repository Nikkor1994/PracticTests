import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MyHomeworkTests {

    /* В этом классе можете описать тесты для домашнего задания */

    private WebDriver driver;

    @Before
    public void setUp()
    {

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void task1()
    {
        driver.get("https://qa.skillbox.ru/module19/");
        var locator1 = By.xpath("//span[@class='da-arrows-prev']"); //1
        var locator2 = By.xpath("//a[contains(@class,'da-link')][contains(@class,'button')]"); //2
        var locator3 = By.xpath("//a[@href='#noAction']"); //3
        var locator4 = By.xpath("//*[starts-with(@class,'button')]"); //4
        var locator5 = By.xpath("//a[text()='Подписаться сейчас']"); //5
        var locator6 = By.xpath("//ul[@id='clint-slider']//img"); //6
    }

    @Test
    public void task2()
    {
        driver.get("https://qa.skillbox.ru/module16/maincatalog/");
        var locator1 = By.xpath("//div[5]//span"); //1
        var locator2 = By.xpath("//div[@class='pageCreate__cards']//div[contains(@class,'baseCard')][contains(@class,'pageCreate__card')][8]//div[3]//p"); //2
    }

    @Test
    public void task3()
    {
        driver.get("https://qajava.skillbox.ru/index.html");
        var locator1 = By.xpath("//a[text()='О магазине']"); //1
        var locator2 = By.xpath("//li[@id='genres']//a[text()='Бестселлеры']"); //2
        var locator3 = By.xpath("//input[@id='search-input']"); //3
        driver.get("https://qajava.skillbox.ru/checkout.html");
        var locator4 = By.xpath("//div[@id='total']"); //4
        var locator5 = By.xpath("//div[text()='Ваш заказ: ']"); //5
        driver.get("https://qajava.skillbox.ru/search.html");
        var locator6 = By.xpath("//button[text()='Отменить']"); //6
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
