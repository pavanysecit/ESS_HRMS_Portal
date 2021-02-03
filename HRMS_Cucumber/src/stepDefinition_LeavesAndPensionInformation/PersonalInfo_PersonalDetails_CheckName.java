package stepDefinition_LeavesAndPensionInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class PersonalInfo_PersonalDetails_CheckName {
WebDriver driver;	
	
	@Given("^Personal information module, personal details page and name of the employee$")
	public void Personal_information_module_personal_details_page_and_name_of_the_employee() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on personal details link under personal information module$")
	public void Click_on_personal_details_link_under_personal_information_module() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[2]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^Personal details of the employee should get displayed$")
	public void Personal_details_of_the_employee_should_get_displayed() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[1]/div/span")).getText();
		String expected_value = "Personal Details";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);	
		
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div[1]/table[1]/tbody/tr/td")).getText();
		String expected_value1 = "Ashna Ramroop";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(2000);	
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}