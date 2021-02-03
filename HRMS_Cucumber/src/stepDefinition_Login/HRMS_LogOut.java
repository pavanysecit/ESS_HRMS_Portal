package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRMS_LogOut {
	
	public HRMS_LogOut (WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/header/div/div/span")).click();
		Thread.sleep(2000);
		driver.quit();
	}
} 