package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_4 {


    public void pruebaDragDrop() {

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //Inicializar webdriver
        WebDriver driver = new ChromeDriver();

        //Abrir la pagina de pruebas
        driver.get("https://demoqa.com/droppable");

        //Maximizamos
        driver.manage().window().maximize();

        //Actions class
        Actions action = new Actions(driver);

        //from - to
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));

        //Method Drag and Drop
        action.dragAndDrop(from,to).build().perform();

    }
}
