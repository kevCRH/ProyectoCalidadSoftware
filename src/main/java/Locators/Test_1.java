package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Test_1 {

    private String url = "https://demoqa.com/";
    WebDriver driver;

    @BeforeTest
    public void setBaseUrl() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void testCase() throws InterruptedException {

        String fullname = "Jorge Carranza Cespedes";
        String email = "ufyrCarranza@gmail.com";
        String currentAddress = "San Roque de Barva, Heredia.";
        String permanentAddress = "San Roque de Barva, Heredia.";
        Thread.sleep(2500);

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
        Thread.sleep(2500);

        // les mandamos la informacion con la que se desea llenar los espacios
        fullNameInput.sendKeys(fullname);
        Thread.sleep(2500);
        emailInput.sendKeys(email);
        Thread.sleep(2500);
        currentAddressInput.sendKeys(currentAddress);
        Thread.sleep(2500);
        permanentAddressInput.sendKeys(permanentAddress);
        Thread.sleep(2500);

        //indentificamos por id el buton de submit y lo clickeamos
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(5000);
        driver.close();
    }

}
