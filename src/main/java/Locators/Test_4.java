package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class Test_4 {


    private String url = "https://demoqa.com";
    WebDriver driver;


    @BeforeTest
    public void pruebaDragSet() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void testCase() throws InterruptedException {
        //Abrir la pagina de pruebas
        WebElement interactionsButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[3]/h5"));
        interactionsButton.click();
        Thread.sleep(2000);
        driver.get("https://demoqa.com/droppable");

        //Maximizamos
        driver.manage().window().maximize();
        //Actions class
        Actions action = new Actions(driver);
        Thread.sleep(2000);

        //from - to
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));

        //Method Drag and Drop
        action.dragAndDrop(from, to).build().perform();
        Thread.sleep(7000);
        driver.close();
    }

}
