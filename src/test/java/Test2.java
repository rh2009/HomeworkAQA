import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Test2 {
    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Home\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://a.testaddressbook.com/sign_in");

        driver.findElement(By.id("session_email")).sendKeys("rh.09@mail.ru");
        driver.findElement(By.id("session_password")).sendKeys("123");
        driver.findElement(By.name("commit")).click();

        driver.findElement(By.xpath("//a[@href='/addresses']")).click();
        driver.findElement(By.xpath("//a[@data-test='create']")).click();
        driver.findElement(By.cssSelector("input[id='address_first_name']")). sendKeys("ABC");
        driver.findElement(By.cssSelector("input[id='address_last_name']")). sendKeys("DEFG");
        driver.findElement(By.cssSelector("input[name='address[address1]']")). sendKeys("Street 62");
        driver.findElement(By.id("address_city")).sendKeys("Dallas");
        driver.findElement(By.xpath("//option [@value='TX']")).click();
        driver.findElement(By.id("address_zip_code")).sendKeys("00152");
        driver.findElement(By.xpath("//input [@value='us']")).click();
        driver.findElement(By.name("address[birthday]")). sendKeys("09111999");
        driver.findElement(By.id("address_age")).sendKeys("58");
        driver.findElement(By.id("address_website")).sendKeys("http://1WWW/com");
        driver.findElement(By.xpath("//input [@type='file']")).sendKeys("D:\\Home\\src\\main\\resources\\test");
        driver.findElement(By.id("address_phone")).sendKeys("+788 62 69");
        driver.findElement(By.id("address_interest_dance")).click();
        driver.findElement(By.xpath("//input [@data-test='submit']")).click();
        driver.findElement(By.xpath("//a[@data-test='list']")).click();

        driver.findElement(By.xpath("//a [contains (text(), 'Edit')]")).click();
        driver.findElement(By.cssSelector("input[name='address[address1]']")). clear();
        driver.findElement(By.cssSelector("input[name='address[address1]']")). sendKeys("Avenue 53");
        driver.findElement(By.name("commit"));

        driver.findElement(By.xpath("//a[@data-test='list']")).click();
        driver.findElement(By.xpath("//a [contains (text(), 'Destroy')]")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//a [@data-test = 'sign-out']")).click();

        driver.quit();

    }
}
