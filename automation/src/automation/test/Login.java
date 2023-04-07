package automation.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) {
	
	//declaration
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	driver.navigate().to("https://dev-skynet.resolutiondigital.com.au");
	
	//maximize window
	driver.manage().window().maximize();  
	
	//click on loginwith email
	driver.findElement(By.id("toggle-login-form")).click();
	
	//enter email
	driver.findElement(By.id("Username")).sendKeys("skynet-admin-au@yopmail.com");
	
	
	
	//enter password
	driver.findElement(By.id("Password")).sendKeys("-M3A8V=");
	
	//click loginbutton
	driver.findElement(By.tagName("button")).click();
	
	//driver.close();
	
}
}
