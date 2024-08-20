import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MyHomeworkTests {

    /* В этом классе можете описать тесты для домашнего задания */

    private WebDriver driver;
    private WebDriverWait wait;
    private final By firstLocator = By.cssSelector("button.articlePreview__link");

    private By secondLocator = By.cssSelector("div.vb-content > div.articlePreview.pageArticle__articlePreview:first-child p:nth-child(2)");


    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //1 часть:
        //a. $$("section.header p")

        //b. $$("div.text > a:first-of-type(1)")

        //c. $$("section > div.text:nth-of-type(2) a")

    @Test
    public void part2()
    {
        driver.get("https://lm.skillbox.cc/qa_tester/module04/practice1/");
        driver.findElement(By.cssSelector("input:not([id])"));
        driver.findElement(By.cssSelector("p[class^='form']:not(p[class$='error'])"));
        driver.findElement(By.cssSelector("div.form-inner p.form-row:nth-of-type(1)"));
    }

    @Test
    public void part3()
    {

        driver.get("https://qa.skillbox.ru/module15/bignotes/#/statistic");

        var expectedTitle = "План на следующий месяц";
        var expectedText = "Прочитать книгу «Искусство цвета».";
        driver.findElement(firstLocator).click();
        Assert.assertTrue("Справа не появилась выбранная запись в разделе Все записи",driver.findElement(secondLocator).isDisplayed());
        Assert.assertEquals("Заголовок не равен только что выбранной записи",expectedTitle,driver.findElement(secondLocator).getText());
        Assert.assertEquals("Текст не равен только что выбранной записи",expectedText,driver.findElement(By.cssSelector("div.vb-content > div.articlePreview.pageArticle__articlePreview:first-child p:nth-child(3)")).getText());
        driver.findElement(By.cssSelector("div.pageArticle__buttons > button:nth-child(2)")).click();
        driver.findElement(By.cssSelector("button.articlePreview__link")).click();
        driver.findElement(By.cssSelector("div.pageArticle__buttons > button:nth-child(2)")).click();
        Assert.assertEquals("В разделе Все записи есть записи",driver.findElement(By.cssSelector("div.vb-content div")).isDisplayed());
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
