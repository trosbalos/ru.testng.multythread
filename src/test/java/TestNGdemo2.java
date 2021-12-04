
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGdemo2 {
WebDriver driver = null;
    @BeforeMethod
    public void setUpTest(){

        WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
}
    @Test
    public void googleSearch() throws InterruptedException {
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("YU");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Assert.assertTrue(driver.findElement(By.id("result-stats")).isDisplayed());
    }
    @Test
    public void googleSearch2() throws InterruptedException {
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("HG");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Assert.assertTrue(driver.findElement(By.id("result-stats")).isDisplayed());
    }
    @Test
    public void googleSearch3() throws InterruptedException {
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("FG");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Assert.assertTrue(driver.findElement(By.id("result-stats")).isDisplayed());
    }
    @Test
    public void googleSearch4() throws InterruptedException {
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("SD");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Assert.assertTrue(driver.findElement(By.id("result-stats")).isDisplayed());
    }
    @AfterMethod
    public void close(){
        driver.close();
    }


@AfterTest
    public void tearDown(){
        driver.quit();
}
}
