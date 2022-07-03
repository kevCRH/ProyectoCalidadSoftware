package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public void pruebaElements(){


        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //Inicializar webdriver
        WebDriver driver = new ChromeDriver();

        //Abrir la pagina de pruebas
        driver.get("https://demoqa.com/");

        //Maximizamos
        driver.manage().window().maximize();

        //informacion
        String fullname = "Jorge Carranza Cespedes";
        String email = "ufyrCarranza@gmail.com";
        String currentAddress = "San Roque de Barva, Heredia.";
        String permanentAddress = "San Roque de Barva, Heredia.";

        //Localizamos por Xpath para las acciones de "Elements". En la opcion de "text Box"
        WebElement elementButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
        elementButton.click();
        WebElement textBoxButton = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
        textBoxButton.click();

        //Localizamos por id los espacios que vamos a llenar
        WebElement fullNameInput = driver.findElement(By.id("userName"));
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));

        // les mandamos la informacion con la que se desea llenar los espacios
        fullNameInput.sendKeys(fullname);
        emailInput.sendKeys(email);
        currentAddressInput.sendKeys(currentAddress);
        permanentAddressInput.sendKeys(permanentAddress);

        //indentificamos por id el buton de submit y lo clickeamos
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();


    }
}
