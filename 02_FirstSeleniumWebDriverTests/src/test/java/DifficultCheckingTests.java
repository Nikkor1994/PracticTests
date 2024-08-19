import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifficultCheckingTests {
    @Test
    public void Checking1(){

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.className("button")).click();
        String getText = driver.findElement(By.className("start-screen__res")).getText();
        System.out.println("На сайте выводится текст: "+getText);
        Assert.assertEquals("Здравствуйте, .\n" +
                "На вашу почту () отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: .",getText);
        driver.quit();
    }

    @Test
    public void Checking2(){

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Kolya");
        driver.findElement(By.className("button")).click();
        String getText = driver.findElement(By.className("start-screen__res")).getText();
        System.out.println("На сайте выводится текст: "+getText);
        Assert.assertEquals("Здравствуйте, Kolya.\n" +
                "На вашу почту () отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: .",getText);
        driver.quit();
    }

    @Test
    public void Checking3(){

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("email")).sendKeys("Test@test.ru");
        driver.findElement(By.className("button")).click();
        String getText = driver.findElement(By.className("start-screen__res")).getText();
        System.out.println("На сайте выводится текст: "+getText);
        Assert.assertEquals("Здравствуйте, .\n" +
                "На вашу почту (Test@test.ru) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: .",getText);
        driver.quit();
    }

    @Test
    public void Checking4(){

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("phone")).sendKeys("+77001112233");
        driver.findElement(By.className("button")).click();
        String getText = driver.findElement(By.className("start-screen__res")).getText();
        System.out.println("На сайте выводится текст: "+getText);
        Assert.assertEquals("Здравствуйте, .\n" +
                "На вашу почту () отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: +77001112233.",getText);
        driver.quit();
    }

    @Test
    public void Checking5(){

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Kolya");
        driver.findElement(By.name("email")).sendKeys("Test@test.ru");
        driver.findElement(By.name("phone")).sendKeys("+77001112233");
        driver.findElement(By.className("button")).click();
        String getText = driver.findElement(By.className("start-screen__res")).getText();
        System.out.println("На сайте выводится текст: "+getText);
        Assert.assertEquals("Здравствуйте, Kolya.\n" +
                "На вашу почту (Test@test.ru) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: +77001112233.",getText);
        driver.quit();
    }

}
