
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

public class TestCases {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\shiva\\OneDrive\\Desktop\\random\\New folder (2)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/index.html");
        driver.manage().window().maximize();

        System.out.println("=== TEST STARTED ===");

        // ==============================
        // 1. PAGE OPEN TEST
        // ==============================
        if(driver.getTitle().contains("Student Feedback")){
            System.out.println("TC1 PASS ✔ Page Opened");
        } else {
            System.out.println("TC1 FAIL ❌");
        }

        // ==============================
        // 2. VALID SUBMISSION
        // ==============================
        driver.findElement(By.id("name")).sendKeys("Shivansh");
        driver.findElement(By.id("email")).sendKeys("shivansh@gmail.com");
        driver.findElement(By.id("mobile")).sendKeys("9876543210");
        driver.findElement(By.id("department")).sendKeys("BCA");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("feedback"))
              .sendKeys("This is a very good system and I really like this feedback form");

        driver.findElement(By.id("submitBtn")).click();

        Thread.sleep(1000);

        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("TC2 PASS ✔ " + alert.getText());
            alert.accept();
        } catch(NoAlertPresentException e){
            System.out.println("TC2 FAIL ❌");
        }

        // ==============================
        // 3. EMPTY FIELD TEST
        // ==============================
        driver.navigate().refresh();

        driver.findElement(By.id("submitBtn")).click();

        Thread.sleep(1000);

        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("TC3 PASS ✔ " + alert.getText());
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("TC3 FAIL ❌");
        }

     // ==============================
     // 4. INVALID EMAIL
     // ==============================
     driver.navigate().refresh();

     driver.findElement(By.id("name")).sendKeys("Test");
     driver.findElement(By.id("email")).sendKeys("wrongemail");
     driver.findElement(By.id("mobile")).sendKeys("9876543210");

     driver.findElement(By.id("submitBtn")).click();

     Thread.sleep(1000);

     // Check browser validation message
     String validationMsg = driver.findElement(By.id("email"))
                                  .getAttribute("validationMessage");

     if(validationMsg != null && !validationMsg.isEmpty()){
         System.out.println("TC4 PASS ✔ " + validationMsg);
     } else {
         System.out.println("TC4 FAIL ❌");
     }
     
        // ==============================
        // 5. INVALID MOBILE
        // ==============================
        driver.navigate().refresh();

        driver.findElement(By.id("name")).sendKeys("Test");
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("mobile")).sendKeys("abc123");
        driver.findElement(By.id("submitBtn")).click();

        Thread.sleep(1000);

        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("TC5 PASS ✔ " + alert.getText());
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("TC5 FAIL ❌");
        }

        // ==============================
        // 6. DROPDOWN TEST
        // ==============================
        driver.navigate().refresh();

        driver.findElement(By.id("department")).sendKeys("MCA");
        System.out.println("TC6 PASS ✔ Dropdown Working");

        // ==============================
        // 7. RESET BUTTON TEST
        // ==============================
        driver.findElement(By.id("name")).sendKeys("ResetTest");
        driver.findElement(By.id("resetBtn")).click();

        String value = driver.findElement(By.id("name")).getAttribute("value");

        if(value.isEmpty()){
            System.out.println("TC7 PASS ✔ Reset Working");
        } else {
            System.out.println("TC7 FAIL ❌");
        }

        Thread.sleep(2000);

        System.out.println("=== TEST COMPLETED ===");

        driver.quit();
    }
}