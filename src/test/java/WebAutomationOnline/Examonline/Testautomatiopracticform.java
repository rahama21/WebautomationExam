package WebAutomationOnline.Examonline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testautomatiopracticform extends BrowserConfig{
@Test (priority = 0)
	public void openUrl() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
	}
@Test (priority = 1)
	public void Textareapractice () throws InterruptedException {
		
		WebElement name = driver.findElement(By.id("name"));
		WebElement mobileNumber = driver.findElement(By.id("phone"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement address = driver.findElement(By.id("address"));
		
		WebElement submit = driver.findElement(By.name("submit"));
		
		
		name.sendKeys("Enid");
		
		mobileNumber.sendKeys("01521220527");
		
		email.sendKeys("enid@gmail.com");
		
		password.sendKeys("enid12345");
		
		address.sendKeys("Dhaka,Bangladesh");
		
		submit.click();
		
		Thread.sleep(5000);
	
}
}
