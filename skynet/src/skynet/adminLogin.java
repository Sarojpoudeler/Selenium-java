package skynet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class adminLogin {

	public static void main(String[] args) {
		// declaration
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://dev.omgskynet.io");

		// maximize window
		driver.manage().window().maximize();

		// click on loginwith email
		driver.findElement(By.id("toggle-login-form")).click();

		// enter email
		driver.findElement(By.id("Username")).sendKeys("skynet-admin-au@yopmail.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// enter password
		driver.findElement(By.id("Password")).sendKeys("-M3A8V=");

		// click loginbutton
		driver.findElement(By.tagName("button")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get("https://dev-skynet.resolutiondigital.com.au/mbasystem/mba/dashboard");
		// Create MBA
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/main/div/div[1]/div[2]/div/div/div/a/span")).click();

		WebElement clientdropdown = driver.findElement(By.cssSelector("#vs1__combobox > div.vs__selected-options > input"));
		clientdropdown.click();

		List<WebElement> allOptions = driver.findElements(By.cssSelector("#vs1__listbox > li"));

		System.out.println(allOptions);
		allOptions.get(8).click();

		WebElement brand = driver.findElement(By.xpath("//input[@placeholder='Brand']"));
		brand.click();
		brand.sendKeys("this is brand");
		
		

		// Campaign name

		WebElement campaign = driver.findElement(By.xpath("//input[@placeholder='Campaign']"));
		campaign.click();
		campaign.sendKeys("this is my first campaign");
		
		// Save 
		driver.findElement(By.xpath("//*[@id=\'app\']/div/div/main/div[1]/div[3]/div/div[2]/div/form/div[3]/div[2]/div[1]/button/div")).click();

	}

}
