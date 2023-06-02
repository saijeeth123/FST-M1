package HRM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
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


        // My info option in the menu and click it.
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();
        Thread.sleep(3000);
        //edit
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        //edit details
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).sendKeys("Sai");
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpLastName\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpLastName\"]")).sendKeys("Jeeth");
        driver.findElement(By.xpath("//*[@id=\"personal_optGender_1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"personal_DOB\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"personal_DOB\"]")).sendKeys("1999-07-01");
        //save details
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

        driver.close();
    }

}
