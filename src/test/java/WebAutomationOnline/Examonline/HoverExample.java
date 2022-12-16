package WebAutomationOnline.Examonline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverExample extends BrowserConfig{
	
	@Test(priority = 0)
	

	public void Url() throws InterruptedException {
		
	driver.get("https://www.daraz.com.bd/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	}
	@Test(priority = 1)
	
	public void HoverTest() throws InterruptedException {
		Actions action = new Actions(driver);
		
		WebElement Automotive= driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement motorCycleriding = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		WebElement helmat = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		
		action.moveToElement(Automotive).perform();
		Thread.sleep(3000);
		action.moveToElement(motorCycleriding).perform();
		Thread.sleep(3000);
		action.moveToElement(helmat).perform();
		Thread.sleep(3000);
		helmat.click();
		Thread.sleep(3000);

}
}
