import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyHomeworkTests {

    /* В этом классе можете описать тесты для домашнего задания */

    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void part1()
    {
        driver.get("https://qajava.skillbox.ru/index.html");
        driver.findElement(By.cssSelector("[test-info='about-us']"));
        driver.findElement(By.cssSelector("a[href='']"));
        driver.get("https://qajava.skillbox.ru/search.html");
        driver.findElement(By.cssSelector("option[selected]"));
        driver.get("https://qajava.skillbox.ru/index.html");
        driver.findElement(By.cssSelector("div.book-price"));
        driver.findElement(By.cssSelector("button[class^='book']"));
        driver.findElement(By.cssSelector("[class$='main']"));
        driver.findElement(By.cssSelector("a[class*='menu']"));
    }

    @Test
    public void part2()
    {
        driver.get("https://qajava.skillbox.ru/index.html");
        driver.findElement(By.cssSelector("footer#footer>div"));
        driver.findElement(By.cssSelector("li#genres + *"));
        driver.get("https://qajava.skillbox.ru/search.html");
        driver.findElement(By.cssSelector("div.filter-container ~ *"));
    }

    @Test
    public void part3()
    {
        driver.get("https://qajava.skillbox.ru/module05/auth/index.html/");
        driver.findElement(By.cssSelector("section.important-section-block > h1:first-child"));
        driver.findElement(By.cssSelector("form#login-form > p:last-child"));
        driver.findElement(By.cssSelector("body > *:nth-child(3)"));
        driver.findElement(By.cssSelector("div.footer__menuList > a:first-of-type"));
    }

    @Test
    public void part4()
    {

        driver.get("https://qa.skillbox.ru/module15/bignotes/#/statistic");

        var expectedTitle = "План на следующий месяц";
        var expectedText = "Прочитать книгу «Искусство цвета».";
//        var thirdLocator = );

        driver.findElement(firstLocator).click();

        Assert.assertTrue("Справа не появилась выбранная запись в разделе Все записи",driver.findElement(secondLocator).isDisplayed());
        Assert.assertEquals("Заголовок не равен только что выбранной записи",expectedTitle,driver.findElement(secondLocator).getText());
        Assert.assertEquals("Текст не равен только что выбранной записи",expectedText,driver.findElement(By.cssSelector("div.vb-content > div.articlePreview.pageArticle__articlePreview:first-child p:nth-child(3)")).getText());
        driver.findElement(By.cssSelector("div.pageArticle__buttons > button:nth-child(2)")).click();


        driver.findElement(By.cssSelector("button.articlePreview__link")).click();

        driver.findElement(By.cssSelector("div.pageArticle__buttons > button:nth-child(2)")).click();
        Assert.assertEquals("В разделе Все записи есть записи",driver.findElement(By.cssSelector("div.vb-content div")).isDisplayed());

//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.articlePreview__content > p:nth-of-type(3) ")));
//
//        String actualTextLocator = driver.findElement(By.cssSelector("div.articlePreview__content > p:nth-of-type(3)")).getText();
//        //String actualTextLocator = driver.findElement(By.cssSelector("div.articlePreview__content > p:nth-of-type(3)")).getText();
//        System.out.println(actualTextLocator);
//
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(titleOfarticleLocator, "План на следующий месяц"));
//
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(textOfarticleLocator, "Прочитать книгу «Искусство цвета»."));
//
//        String titleOfArticle = driver.findElement(titleOfarticleLocator).getText();
//
//        String textOfArticle = driver.findElement(textOfarticleLocator).getText();
//
//        Assert.assertEquals("Текст равен: ","Прочитать книгу «Искусство цвета».",actualTextLocator);
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.pageArticle__buttons > button:nth-of-type(2)")));
//        driver.findElement(By.cssSelector("div.pageArticle__buttons > button:nth-of-type(2)")).click();
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.articlePreview.pageArticle__articlePreview .articlePreview__link")));
//        driver.findElement(By.cssSelector("div.articlePreview.pageArticle__articlePreview .articlePreview__link")).click();
//        driver.findElement(By.cssSelector("div.pageArticle__buttons > button:nth-of-type(2)")).click();
//        var size = driver.findElements(By.cssSelector(".vb-content")).size();
//        System.out.println(size);
//        Assert.assertEquals("Столько записей есть: ",0,size);
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
