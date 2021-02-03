package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HRMS_Login_Admin {
	
	public HRMS_Login_Admin (WebDriver driver) throws InterruptedException {
		
		WebElement un = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/div[2]/div[1]/input"));
		un.click();
		un.sendKeys("admin");
		Thread.sleep(2000);

		WebElement pwd = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/div[3]/div[1]/input"));
		pwd.click();
		pwd.sendKeys("12345");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/div[4]/div/button")).click();
		Thread.sleep(4000);
	}
}