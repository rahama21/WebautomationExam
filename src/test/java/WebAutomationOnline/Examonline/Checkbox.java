package WebAutomationOnline.Examonline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Checkbox extends BrowserConfig {
	@Test (priority = 0)
	
	public void oprnUrl() {
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
	}
	
	@Test (priority = 1)
	public void radioButton() throws InterruptedException {
		
		WebElement gender = driver.findElement(By.id("female"));
		
		WebElement day1 =  driver.findElement(By.id("friday"));
		WebElement day2  = driver.findElement(By.id("wednesday"));
		gender.click();
		
		day1.click();
		day2.click();
		Thread.sleep(4000);
		
	}

}
