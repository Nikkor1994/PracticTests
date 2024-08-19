import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingText2Test {

    @Test
    public void CheckingVasya2(){

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lm.skillbox.cc/qa_tester/module01/");
        driver.findElement(By.className("button")).click();
        String getText = driver.findElement(By.className("start-screen__res")).getText();
        System.out.println("На сайте выводится текст: "+getText);
        driver.quit();
    }

}
