package WebAutomationOnline.Examonline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertExample extends BrowserConfig{
	
	
@Test(priority = 0)
	
	
	
	public void Url() {
		
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	
	
	}
@Test(priority = 1)
	public void AlertCheck() throws InterruptedException {
		
		WebElement JSalert =	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement Jsconfirm =	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement JSprompt =	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		JSalert.click();
		Thread.sleep(5000);
	
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String resultText=result.getText();
		if (resultText.contains("You successfully clicked an alert")) {
			System.out.println(resultText);
			
		}
		
		//Assert.assertEquals(resultText, "You successfully clicked  alert");
		//SoftAssert softAssert = new SoftAssert();
		//softAssert.assertEquals(resultText, "You successfully clicked  alert");
	//	softAssert.assertAll();
		Jsconfirm.click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		JSprompt.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Hello Js prompt");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}

}


