package HRM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
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
        Thread.sleep(3000);
        //qualification button
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a")).click();
        //add qualification
        driver.findElement(By.xpath("//*[@id=\"addWorkExperience\"]")).click();
        Thread.sleep(3000);
        //fill details
        driver.findElement(By.xpath("//*[@id=\"experience_employer\"]")).sendKeys("IBM");
        driver.findElement(By.xpath("//*[@id=\"experience_jobtitle\"]")).sendKeys("Automation Tester");
        //submit
        driver.findElement(By.xpath("//*[@id=\"btnWorkExpSave\"]")).click();

        driver.close();
    }
}
