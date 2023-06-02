package HRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity9 {
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
        //my info
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"btnAddContact\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"emgcontacts_name\"]")).sendKeys("ram");
        driver.findElement(By.xpath("//*[@id=\"emgcontacts_relationship\"]")).sendKeys("brother");
        driver.findElement(By.xpath("//*[@id=\"emgcontacts_homePhone\"]")).sendKeys("9876543212");
        driver.findElement(By.xpath("//*[@id=\"btnSaveEContact\"]")).click();

        Thread.sleep(2000);
        WebElement contactName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/table/tbody/tr[1]/td[2]"));
        String name = contactName.getText();
        WebElement Relation=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/table/tbody/tr[1]/td[3]"));
        String relation = Relation.getText();
        WebElement mobile=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/table/tbody/tr/td[4]"));
        String mob = mobile.getText();
        System.out.println("Name = " +name);
        System.out.println("Relation = " +relation);
        System.out.println("Mobile = " +mob);
        driver.close();
    }


    }

