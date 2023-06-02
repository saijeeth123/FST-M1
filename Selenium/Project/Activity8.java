package HRM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {
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
        //dashboard option
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[8]/a/b")).click();
        Thread.sleep(2000);
        //apply for leave
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[4]/div/a/img")).click();
        //fill details
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"applyleave_txtFromDate\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"applyleave_txtFromDate\"]")).sendKeys("2023-07-04");
        driver.findElement(By.xpath("//*[@id=\"applyleave_txtToDate\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"applyleave_txtToDate\"]")).sendKeys("2023-07-06");

        driver.findElement(By.xpath("//*[@id=\"applyleave_txtComment\"]")).sendKeys("Vacation");
        //submit
        driver.findElement(By.xpath("//*[@id=\"applyBtn\"]")).click();

        //verify leave
        driver.findElement(By.xpath("//*[@id=\"menu_leave_viewMyLeaveList\"]")).click();

        driver.close();
    }

}
