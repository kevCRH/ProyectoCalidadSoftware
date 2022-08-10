package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Test_2 {


    private String url = "https://demoqa.com/";
    WebDriver driver;

    @BeforeTest
    public void pruebaWebTablesSet() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void testCase() throws InterruptedException {
        String fname = "Marco";
        String lname = "Polo";
        String email = "marcp23@gmail.com";
        String edad = "20";
        String salario = "5000";
        String departamento = "Legal";
        String fname2 = "Andres";
        Thread.sleep(2500);

        //agregar nueva persona a la tabla.
        WebElement elementButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
        elementButton.click();
        WebElement textBoxButton = driver.findElement(By.xpath("//*[@id=\"item-3\"]/span"));
        textBoxButton.click();
        Thread.sleep(2500);
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        //identificamos los elementos de los espacios a rellenar
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement salaryInput = driver.findElement(By.id("salary"));
        WebElement departmentInput = driver.findElement(By.id("department"));
        Thread.sleep(2500);

        //mandamos la informacion a los espacios a rellenar
        firstNameInput.sendKeys(fname);
        Thread.sleep(2500);
        lastNameInput.sendKeys(lname);
        Thread.sleep(2500);
        emailInput.sendKeys(email);
        Thread.sleep(2500);
        ageInput.sendKeys(edad);
        Thread.sleep(2500);
        salaryInput.sendKeys(salario);
        Thread.sleep(2500);
        departmentInput.sendKeys(departamento);
        Thread.sleep(2500);

        //Apretamos el boton de guardado
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(2500);

        //editar informacion de un usuario
        WebElement editButton = driver.findElement(By.id("edit-record-1"));
        editButton.click();
        Thread.sleep(2500);
        WebElement firstNameInput2 = driver.findElement(By.id("firstName"));
        firstNameInput2.clear();
        Thread.sleep(2500);
        firstNameInput2.sendKeys(fname2);
        Thread.sleep(2500);
        WebElement submitButton2 = driver.findElement(By.id("submit"));
        submitButton2.click();
        Thread.sleep(2500);

        //eliminar uno de los usuarios
        WebElement deleteButton = driver.findElement(By.id("delete-record-2"));
        deleteButton.click();
        Thread.sleep(5000);
        driver.close();

    }

}
