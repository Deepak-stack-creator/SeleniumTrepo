package week2.homeassignmentsday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

    public static void main(String[] args) throws InterruptedException {

        // 1. Launch Chrome
        WebDriver driver = new ChromeDriver();

        // 2. Load URL
        driver.get("https://en-gb.facebook.com/");

        // 3. Maximize
        driver.manage().window().maximize();

        // 4. Implicit Wait
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        // 5. Click Create New Account
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        // 6. Enter First Name
        driver.findElement(By.name("firstname")).sendKeys("Deepak");

        // 7. Enter Surname
        driver.findElement(By.name("lastname")).sendKeys("Klaus");

        // 8. Enter Mobile number or Email
        driver.findElement(By.name("reg_email__")).sendKeys("testuser@gmail.com");

        // 9. Enter New Password
        driver.findElement(By.id("password_step_input")).sendKeys("Password@123");

        // 10. Handle DOB – DAY Dropdown
        WebElement day = driver.findElement(By.id("day"));
        Select ddDay = new Select(day);
        ddDay.selectByVisibleText("28");

        // 11. Handle DOB – MONTH Dropdown
        WebElement month = driver.findElement(By.id("month"));
        Select ddMonth = new Select(month);
        ddMonth.selectByValue("1");  // January

        // 12. Handle DOB – YEAR Dropdown
        WebElement year = driver.findElement(By.id("year"));
        Select ddYear = new Select(year);
        ddYear.selectByVisibleText("1995");

        // 13. Select Gender Radio Button (Male or Female)
        driver.findElement(By.xpath("//label[text()='Male']")).click();

        // 14. Optional pause to see result
        Thread.sleep(3000);

        // 15. Close browser
        driver.close();
    }
}
