import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyHomeworkTests {
    private By email1 = By.className("email");
    private By writeToMe = By.id("write-to-me");
    private By textResult = By.className("result-text");
    private By email = By.id("email");
    private By password = By.name("password");
    private By button = By.tagName("button");
    private By boy = By.id("boy");
    private By girl = By.id("girl");
    private By email2 = By.name("email");
    private By sendMe = By.id("sendMe");
    private By resultText = By.className("result-text");


    /* В этом классе можете описать тесты для домашнего задания */

    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void checkingKitten1(){
        driver.get("https://qajava.skillbox.ru/module04/lesson2/");
        driver.findElement(email1).sendKeys("test@test.ru");
        driver.findElement(writeToMe).click();
        var message = driver.findElement(textResult).isDisplayed();
        Assert.assertTrue("Сообщение появилось",message);
    }

    @Test
    public void checkingPuppy1(){
        driver.get("https://qajava.skillbox.ru/module04/lesson2/practice/");
        driver.findElement(boy).click();
        driver.findElement(email2).sendKeys("test@test.ru");
        driver.findElement(sendMe).click();
        var message2 = driver.findElement(resultText).isDisplayed();
        Assert.assertTrue("Сообщение появилось",message2);
    }

    @Test
    public void checkingPuppy2(){
        driver.get("https://qajava.skillbox.ru/module04/lesson2/practice/");
        driver.findElement(girl).click();
        driver.findElement(email2).sendKeys("test@test.ru");
        driver.findElement(sendMe).click();
        var message2 = driver.findElement(resultText).isDisplayed();
        Assert.assertTrue("Сообщение появилось",message2);
    }

    @Test
    public void checkingError(){
        driver.get("https://qajava.skillbox.ru/module04/homework/auth/index.html");
        driver.findElement(email).sendKeys("@");
        driver.findElement(password).sendKeys("123");
        driver.findElement(button).click();
        var error = driver.findElement(By.className("form-error-password-email")).isDisplayed();
        Assert.assertTrue("Ошибка появилась",error);
    }

    @Test
    public void checkingError2(){
        driver.get("https://qajava.skillbox.ru/module04/homework/auth/changed.html");
        driver.findElement(By.cssSelector(".form-input.input-data")).sendKeys("@");
        driver.findElement(By.cssSelector(".form-input.password")).sendKeys("123");
        driver.findElement(By.cssSelector(".form-submit")).click();
        var error = driver.findElement(By.cssSelector(".form-error-password-email")).isDisplayed();
        Assert.assertTrue("Ошибка появилась",error);
    }

    @Test
    public void checkingError3(){
        driver.get("https://qajava.skillbox.ru/module04/homework/auth/changed.html");
        driver.findElement(By.cssSelector("input#email")).sendKeys("@");
        driver.findElement(By.cssSelector("input#password")).sendKeys("123");
        driver.findElement(By.cssSelector("button#submit")).click();
        var error = driver.findElement(By.cssSelector("pre#error")).isDisplayed();
        Assert.assertTrue("Ошибка появилась",error);
    }

    @Test
    public void checkingError4(){
        driver.get("https://qajava.skillbox.ru/module04/homework/auth/changed.html");
        driver.findElement(By.cssSelector("input.form-input.input-data")).sendKeys("@");
        driver.findElement(By.cssSelector("input.form-input.password")).sendKeys("123");
        driver.findElement(By.cssSelector("button.form-submit#submit")).click();
        var error = driver.findElement(By.cssSelector("pre.form-error-password-email#error")).isDisplayed();
        Assert.assertTrue("Ошибка появилась",error);
    }

    @Test
    public void checkingError5(){
        driver.get("https://qajava.skillbox.ru/module04/homework/auth/changed.html");
        driver.findElement(By.cssSelector("input.form-input.input-data#email")).sendKeys("@");
        driver.findElement(By.cssSelector("input.form-input.password#password")).sendKeys("123");
        driver.findElement(By.cssSelector("button.form-submit")).click();
        var error = driver.findElement(By.cssSelector("pre#error")).isDisplayed();
        Assert.assertTrue("Ошибка появилась",error);
    }



    @After
    public void tearDown()
    {
        driver.quit();
    }
}
