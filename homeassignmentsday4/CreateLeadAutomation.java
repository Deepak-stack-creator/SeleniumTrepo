package week2.homeassignmentsday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadAutomation {

    public static void main(String[] args) throws InterruptedException {

        // 1. Launch Chrome
        WebDriver driver = new ChromeDriver();

        // 2. Load URL
        driver.get("http://leaftaps.com/opentaps/");

        // 3. Maximize browser
        driver.manage().window().maximize();

        // 4. Enter username & password
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // 5. Click Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // 6. Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // 7. Click Leads tab
        driver.findElement(By.linkText("Leads")).click();

        // 8. Click Create Lead
        driver.findElement(By.linkText("Create Lead")).click();

        // 9. Enter FirstName
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepak");

        // 10. Enter LastName
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");

        // 11. Enter CompanyName
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf Tech");

        // 12. Enter Title
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation Engineer");

        // 13. Click Create Lead button
        driver.findElement(By.className("smallSubmit")).click();

        // 14. Verify Title
        String displayedTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();

        if (displayedTitle.equals("Selenium Automation Engineer")) {
            System.out.println("Title Verified Successfully: " + displayedTitle);
        } else {
            System.out.println("Title Verification FAILED");
        }

        // 15. Close the browser
        driver.close();
    }
}