package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_2 {

    public void pruebaWebTables() {

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        //Inicializar webdriver
        WebDriver driver = new ChromeDriver();

        //Abrir la pagina de pruebas
        driver.get("https://demoqa.com/");

        //Maximizamos
        driver.manage().window().maximize();

        String fname = "Marco";
        String lname = "Polo";
        String email = "marcp23@gmail.com";
        String edad = "20";
        String salario = "5000";
        String departamento = "Legal";

        String fname2 = "Andres";

        //agregar nueva persona a la tabla.
        WebElement elementButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
        elementButton.click();
        WebElement textBoxButton = driver.findElement(By.xpath("//*[@id=\"item-3\"]/span"));
        textBoxButton.click();
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        //identificamos los elementos de los espacios a rellenar
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement salaryInput = driver.findElement(By.id("salary"));
        WebElement departmentInput = driver.findElement(By.id("department"));

        //mandamos la informacion a los espacios a rellenar
        firstNameInput.sendKeys(fname);
        lastNameInput.sendKeys(lname);
        emailInput.sendKeys(email);
        ageInput.sendKeys(edad);
        salaryInput.sendKeys(salario);
        departmentInput.sendKeys(departamento);
        //Apretamos el boton de guardado
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //editar informacion de un usuario
        WebElement editButton = driver.findElement(By.id("edit-record-1"));
        editButton.click();
        WebElement firstNameInput2 = driver.findElement(By.id("firstName"));
        firstNameInput2.clear();
        firstNameInput2.sendKeys(fname2);
        WebElement submitButton2 = driver.findElement(By.id("submit"));
        submitButton2.click();

        //eliminar uno de los usuarios
        WebElement deleteButton = driver.findElement(By.id("delete-record-2"));
        deleteButton.click();

    }

}
