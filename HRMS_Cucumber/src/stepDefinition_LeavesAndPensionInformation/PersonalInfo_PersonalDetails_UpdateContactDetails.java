package stepDefinition_LeavesAndPensionInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class PersonalInfo_PersonalDetails_UpdateContactDetails {
WebDriver driver;	
	
	@Given("^Personal information module, personal details page, contact details, edit and save links$")
	public void Personal_information_module_personal_details_page_contact_details_edit_and_save_links() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on personal details link under personal information module, click edit icon, change the contact details and click on save link$")
	public void Click_on_personal_details_link_under_personal_information_module_click_edit_icon_change_the_contact_details_and_click_on_save_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[2]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    // Updating mobile number
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/div[1]/table/tbody/tr[1]/td[4]/span[1]/i")).click();
	    Thread.sleep(2000);
	    WebElement mob = driver.findElement(By.id("txtMobile"));
	    mob.clear();
	    mob.sendKeys("9986106900");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/div[1]/table/tbody/tr[1]/td[4]/span[2]/i")).click();
	    Thread.sleep(2000);
	    
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[1]/span")).getText();
		String expected_value1 = "Personal details Updated Successfully";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(2000);	
		
	    // Updating Email id
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/div[1]/table/tbody/tr[2]/td[4]/span[1]/i")).click();
	    Thread.sleep(2000);
	    WebElement em = driver.findElement(By.id("txtEmail"));
	    em.clear();
	    em.sendKeys("gmail@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[3]/div/div[1]/table/tbody/tr[2]/td[4]/span[2]/i")).click();
	    Thread.sleep(2000);
	}

	@Then("^Contact details should get updated for current user and confirmation message should be displayed$")
	public void Contact_details_should_get_updated_for_current_user_and_confirmation_message_should_be_displayed() throws Throwable {
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[1]/span")).getText();
		String expected_value1 = "Personal details Updated Successfully";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(2000);	
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}