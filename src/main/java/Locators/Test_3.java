package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {

    public void pruebaForms(){

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //Inicializar webdriver
        WebDriver driver = new ChromeDriver();

        //Abrir la pagina de pruebas
        driver.get("https://demoqa.com/");

        //Maximizamos
        driver.manage().window().maximize();

        //elegir los ultimos 2 unos faciles porque falta investigar TestNG y otras cosas


    }
}
