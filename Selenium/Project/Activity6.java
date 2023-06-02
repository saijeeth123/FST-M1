package HRM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity6 {
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


        // Verify Directory option in the menu
        WebElement directory =driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[9]/a/b"));
        if (directory.isDisplayed()){
            System.out.println("directory is verified and clickable");
        }
        else {
            System.out.println("Directory is not verified");
        }
        Thread.sleep(2000);
        //click on directory
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[9]/a/b")).click();
        //edit details
        WebElement head=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/a"));
        if (head.isDisplayed()){
            System.out.println("Heading is verified");
        }
        else {
            System.out.println("Heading not verified");
        }
        driver.close();
    }
}
