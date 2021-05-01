import com.microsoft.demo.Demo;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyTest {
	public static WebDriver driver;
    @Test
    public void test_method_1() throws InterruptedException {
    	By textbox_firstname=By.id("usernamereg-firstName");
    	By textbox_lastname=By.id("usernamereg-lastName");
    	By textbox_username=By.id("usernamereg-yid");
    	By textbox_password=By.id("usernamereg-password");
    	By textbox_mobileno=By.id("usernamereg-phone");
    	By select_dob_month=By.id("usernamereg-month");
    	By textbox_dob_day=By.id("usernamereg-day");
    	By textbox_dob_year=By.id("usernamereg-year");
    	By continuebtn=By.id("reg-submit-button");
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Raunak\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	driver=new ChromeDriver();
    	
    	driver.navigate().to("https://login.yahoo.com/account/create");
    	
    	driver.findElement(textbox_firstname).sendKeys("Divya");
    	Thread.sleep(5000);
    	driver.findElement(textbox_lastname).sendKeys("Patel");
    	Thread.sleep(5000);
    	driver.findElement(textbox_username).sendKeys("Divya.test1234");
    	Thread.sleep(5000);
    	driver.findElement(textbox_username).sendKeys(Keys.TAB);
    	//driver.findElement(username).click();
    	Thread.sleep(5000);
    	driver.findElement(textbox_password).sendKeys("Testing@1");
    	Thread.sleep(5000);
    	driver.findElement(textbox_mobileno).sendKeys("9877665540");
    	Thread.sleep(5000);
    	Select select=new Select(driver.findElement(select_dob_month));
    	select.selectByIndex(1);
    	Thread.sleep(5000);
    	driver.findElement(textbox_dob_day).sendKeys("12");
    	Thread.sleep(5000);
    	driver.findElement(textbox_dob_year).sendKeys("1990");
    	Thread.sleep(5000);
    	//click on continue
    	driver.findElement(continuebtn).click();
    	
    	driver.quit();
    	
    	
    }

    @Test
    public void test_method_2() {
    }
}
