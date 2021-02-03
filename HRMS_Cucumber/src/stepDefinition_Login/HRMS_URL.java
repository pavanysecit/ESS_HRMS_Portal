package stepDefinition_Login;

import org.openqa.selenium.WebDriver;

public class HRMS_URL {
	
	public HRMS_URL(WebDriver driver) throws InterruptedException {
		 driver.get("http://192.168.248.239:8039");
		 driver.manage().window().maximize();
	}
}