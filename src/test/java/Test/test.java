package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kevin\\Desktop\\Universidad\\2022\\7mo Cuatrimestre" +
                "\\Calidad de software\\InstallationProject\\Proyecto\\untitled\\src\\main\\resources\\Drivers\\chromedriver.exe");

        //initialize browser
        WebDriver driver = new ChromeDriver();

        // Open Youtube;
        driver.get("https://demoqa.com/");

        //Maximize browser
        driver.manage().window().maximize();

        //driver.close();

    }


}

