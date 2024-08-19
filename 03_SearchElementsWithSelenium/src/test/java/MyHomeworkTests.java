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
    public void setUp(){
    System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    }

    @Test
    public void negativeChecking1(){
        driver.get("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        driver.findElement(By.id("size")).sendKeys("33");
        driver.findElement(By.id("check-size-button")).click();
        String actualResult = driver.findElement(By.id("size-error")).getText();
        System.out.println("На сайте выводится текст: "+ actualResult);
        Assert.assertEquals("Выводится сообщение: ","В нашем магазине нет обуви вашего размера",actualResult);
    }

    @Test
    public void positiveChecking1(){
        driver.get("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        driver.findElement(By.id("size")).sendKeys("35");
        driver.findElement(By.id("check-size-button")).click();
        String actualResult = driver.findElement(By.className("error")).getText();
        System.out.println("На сайте выводится текст: "+ actualResult);
        Assert.assertEquals("Выводится сообщение: ","В нашем магазине есть обувь вашего размера",actualResult);
    }

    @Test
    public void findElementOfBookShop(){
        driver.get("https://qajava.skillbox.ru/");
        driver.findElement(By.linkText("Обратная связь"));
        driver.findElement(By.linkText("Предзаказы"));
        driver.findElement(By.className("book-add"));
        driver.findElement(By.id("cart_count"));
        driver.findElement(By.id("genres"));
        driver.findElement(By.name("search-input-form"));
        }

    @Test
    public void checkingElementsBookShop(){
        driver.get("https://qajava.skillbox.ru/");
        var actualResult = driver.findElements(By.className("book-info")).size();
        Assert.assertEquals("количество элементов:",15,actualResult );
    }

    @Test
    public void checking1OnlineCinema(){
        String favoriteMovies = "Комедии";
        String favoriteSeries = "Миллиарды";
        driver.get("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        driver.findElement(By.name("films")).sendKeys(favoriteMovies);
        driver.findElement(By.name("serials")).sendKeys(favoriteSeries);
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("two")).click();
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("ok")).click();
        String actualFilms = driver.findElement(By.id("best_films")).getText();
        String actualSerials = driver.findElement(By.id("best_serials")).getText();
        Assert.assertEquals("любимые фильмы: ",favoriteMovies,actualFilms);
        Assert.assertEquals("любимые сериалы: ",favoriteSeries,actualSerials);
    }

    @Test
    public void checking2OnlineCinema(){
        String favoriteMovies = "";
        String favoriteSeries = "";
        driver.get("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        driver.findElement(By.name("films")).sendKeys(favoriteMovies);
        driver.findElement(By.name("serials")).sendKeys(favoriteSeries);
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("two")).click();
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("ok")).click();
        String actualFilms = driver.findElement(By.id("best_films")).getText();
        String actualSerials = driver.findElement(By.id("best_serials")).getText();
        Assert.assertEquals("любимые фильмы: ",favoriteMovies,actualFilms);
        Assert.assertEquals("любимые сериалы: ",favoriteSeries,actualSerials);
    }

    @Test
    public void checking3OnlineCinema(){
        String favoriteMovies = "Комедии";
        String favoriteSeries = "Миллиарды";
        driver.get("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        driver.findElement(By.name("films")).sendKeys(favoriteMovies);
        driver.findElement(By.name("serials")).sendKeys(favoriteSeries);
        driver.findElement(By.id("two")).click(); //без сохранения
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("ok")).click();
        String actualFilms = driver.findElement(By.id("best_films")).getText();
        String actualSerials = driver.findElement(By.id("best_serials")).getText();
        Assert.assertEquals("любимые фильмы: ",favoriteMovies,actualFilms);
        Assert.assertEquals("любимые сериалы: ",favoriteSeries,actualSerials);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
