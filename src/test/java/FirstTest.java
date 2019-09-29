import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class FirstTest {

        @Test
        public void firstTest(){
            System.setProperty("webdriver.chrome.driver","D:\\QA_Auto\\CreateIssue123\\chromedriver.exe");
             ChromeDriver driver = new ChromeDriver();

            driver.get("https://www.bbc.com/");
            driver.findElement(By.id("idcta-link")).click();
            driver.findElement(By.id("user-identifier-input")).sendKeys("a.a.piluck@gmail.com");
            driver.findElement(By.id("password-input")).sendKeys("q1q1q1q1");
            driver.findElement(By.id("submit-button")).click();
            Assert.assertTrue(driver.getTitle().contains("Homepage"));
        }
    }

