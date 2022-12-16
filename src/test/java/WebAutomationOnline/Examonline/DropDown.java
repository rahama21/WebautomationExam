package WebAutomationOnline.Examonline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends BrowserConfig {
	@Test (priority = 0)
	
	public void openUrl() {
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		
	}
	
	@Test (priority = 1)
	public void travelDropdown() throws InterruptedException {
		
		WebElement travelDestination = driver.findElement(By.xpath("//body/div[1]/div[4]/div[2]/div[1]/select[1]"));
		
		Select select = new Select(travelDestination);
		
		select.selectByIndex(1);
		Thread.sleep(5000);
		
	}
	
	

}
