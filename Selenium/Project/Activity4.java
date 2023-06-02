package HRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) throws InterruptedException {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(4000);

        // Find the username field and enter the username
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("orange");
        // Find the password field and enter the password
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("orangepassword123");
        // Find the login button and click it
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        Thread.sleep(2000);


        // PIM option in the menu and click it.
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();
        Thread.sleep(3000);

        //Add button
        driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();

        //add employee
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Testsai");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Testing fst");

        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        Thread.sleep(2000);
        //Navigate back to the PIM page
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();
        Thread.sleep(2000);
        //employee search
        driver.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]")).sendKeys("Test");
        driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();

        driver.close();

    }
}
