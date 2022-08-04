import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomeWork {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elad\\OneDrive\\שולחן העבודה\\Chorm Folder\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.automationtesting.in/");
        Thread.sleep(3000);
        driver.get("https://practice.automationtesting.in/my-account/");


       WebElement REG = driver.findElement(By.id("reg_email"));
        REG.click();
        REG.sendKeys("elad450@gmail.com");
        Thread.sleep(3000);
        WebElement REGPassword = driver.findElement(By.id("reg_password"));
        REGPassword.click();
        REGPassword.sendKeys("@#DS58888X478");
        Thread.sleep(1500);
        WebElement Register = driver.findElement(By.name("register"));
        Register.click();
        Thread.sleep(3000);

        driver.get("https://practice.automationtesting.in/shop/");
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());

        driver.quit();




    }






}
