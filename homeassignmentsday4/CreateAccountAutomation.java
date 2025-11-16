package week2.homeassignmentsday4;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountAutomation {

    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Wait for elements to be found
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Load URL
        driver.get("http://leaftaps.com/opentaps/");

        // Login
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Accounts
        driver.findElement(By.linkText("Accounts")).click();

        // Create Account
        driver.findElement(By.linkText("Create Account")).click();

        // Enter details
        driver.findElement(By.id("accountName")).sendKeys("Deepak Automation Account");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

        // Industry Dropdown
        Select industry = new Select(driver.findElement(By.name("industryEnumId")));
        industry.selectByVisibleText("Computer Software");

        // Ownership Dropdown
        Select ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
        ownership.selectByVisibleText("S-Corporation");

        // Data Source Dropdown
        Select source = new Select(driver.findElement(By.id("dataSourceId")));
        source.selectByValue("LEAD_EMPLOYEE");

        // Marketing Campaign
        Select marketing = new Select(driver.findElement(By.id("marketingCampaignId")));
        marketing.selectByIndex(6);

        // State/Province Dropdown
        Select state = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
        state.selectByValue("TX");

        // Submit
        driver.findElement(By.className("smallSubmit")).click();

        // Verify account name
        String accountName = driver.findElement(By.id("accountName")).getText();
        System.out.println("Account Name Displayed: " + accountName);

        // Close
        driver.close();
    }
}
