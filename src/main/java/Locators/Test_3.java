package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {

    public void pruebaSelect(){

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //Inicializar webdriver
        WebDriver driver = new ChromeDriver();

        //Abrir la pagina de pruebas
        driver.get("https://demoqa.com/");

        //Maximizamos
        driver.manage().window().maximize();


        //Interactions
        WebElement interactionsButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[3]/h5"));
        interactionsButton.click();
        driver.get("https://demoqa.com/selectable");
        //WebElement selectableButton = driver.findElement(By.id("item-0\""));
        //selectableButton.click();

        //identificar opcion Grid
        WebElement gridButton = driver.findElement(By.id("demo-tab-grid"));
        gridButton.click();
        //clickeamos sobre los botones establecidos
        WebElement oneButton = driver.findElement(By.xpath("//*[@id=\"row1\"]/li[1]"));
        oneButton.click();
        WebElement fiveButton = driver.findElement(By.xpath("//*[@id=\"row2\"]/li[2]"));
        fiveButton.click();
        WebElement nineButton = driver.findElement(By.xpath("//*[@id=\"row3\"]/li[3]"));
        nineButton.click();
        WebElement sevenButton = driver.findElement(By.xpath("//*[@id=\"row3\"]/li[1]"));
        sevenButton.click();
        WebElement threeButton = driver.findElement(By.xpath("//*[@id=\"row1\"]/li[3]"));
        threeButton.click();
    }
}
