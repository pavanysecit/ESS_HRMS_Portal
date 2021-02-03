package stepDefinition_ITAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class NewUser_Creation_EditDetails {
WebDriver driver;	
	
	@Given("^Admin module, IT Admin module, New User creation page, edit icon and Submit button$")
	public void Admin_module_IT_Admin_module_New_User_creation_page_edit_icon_and_Submit_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on New User details link under IT Admin module, click on Edit icon, update the details and click on Submit button$")
	public void Click_on_New_User_details_link_under_IT_Admin_module_click_on_Edit_icon_update_the_details_and_click_on_Submit_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[7]/i")).click();
	    Thread.sleep(3000);
	    
	    WebElement location = driver.findElement(By.id("ddlLocation"));
	    Select loc = new Select(location);
	    loc.selectByVisibleText("Suribet n.v.");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("txtPassword")).sendKeys("12345");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/form/button[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("^User details should get updated successfully with new changes$")
	public void User_details_should_get_updated_successfully_with_new_changes() throws Throwable {
		String actual = driver.findElement(By.id("spSuccessMsg")).getText();
		String expected = "User Details Updated Successfully";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
	   
	    new HRMS_LogOut(driver);
	}
}