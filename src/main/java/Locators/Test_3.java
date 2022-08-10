package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Test_3 {

    private String url = "https://demoqa.com";
    WebDriver driver;


    @BeforeTest
    public void pruebaFormSet() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void testCase() throws InterruptedException {

        //Interactions
        WebElement interactionsButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[3]/h5"));
        interactionsButton.click();
        Thread.sleep(2000);
        driver.get("https://demoqa.com/selectable");
        Thread.sleep(5000);
        //WebElement selectableButton = driver.findElement(By.id("item-0\""));
        //selectableButton.click();

        //identificar opcion Grid
        WebElement gridButton = driver.findElement(By.id("demo-tab-grid"));
        gridButton.click();
        Thread.sleep(2000);
        //clickeamos sobre los botones establecidos
        WebElement oneButton = driver.findElement(By.xpath("//*[@id=\"row1\"]/li[1]"));
        oneButton.click();
        Thread.sleep(1500);
        WebElement fiveButton = driver.findElement(By.xpath("//*[@id=\"row2\"]/li[2]"));
        fiveButton.click();
        Thread.sleep(1500);
        WebElement nineButton = driver.findElement(By.xpath("//*[@id=\"row3\"]/li[3]"));
        nineButton.click();
        Thread.sleep(1500);
        WebElement sevenButton = driver.findElement(By.xpath("//*[@id=\"row3\"]/li[1]"));
        sevenButton.click();
        Thread.sleep(1500);
        WebElement threeButton = driver.findElement(By.xpath("//*[@id=\"row1\"]/li[3]"));
        threeButton.click();
        Thread.sleep(2500);
        driver.close();
    }

}
