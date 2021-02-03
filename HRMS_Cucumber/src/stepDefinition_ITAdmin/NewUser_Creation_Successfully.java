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

public class NewUser_Creation_Successfully {
WebDriver driver;
	
	@Given("^Admin module, IT Admin module, New User creation page, location, select role, user id and password$")
	public void Admin_module_IT_Admin_module_New_User_creation_page_location_select_role_user_id_and_password() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on New user details link under IT Admin module, enter all the mandatory fields and click on submit button$")
	public void Click_on_New_user_details_link_under_IT_Admin_module_enter_all_the_mandatory_fields_and_click_on_submit_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement location = driver.findElement(By.id("ddlLocation"));
	    Select loc = new Select(location);
	    loc.selectByVisibleText("Suribet n.v.");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/form/div[5]/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/form/div[5]/div/div/ul/li[2]")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.id("txtUsername")).click();
	    //Thread.sleep(2000);
	    
	    WebElement UserId = driver.findElement(By.id("ddlUserid"));
	    Select id = new Select(UserId);
	    id.selectByVisibleText("100");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("txtPassword")).sendKeys("12345");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/form/button[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("^New user should get created successfully and should able to login to the website post creation$")
	public void New_user_should_get_created_successfully_and_should_able_to_login_to_the_website_post_creation() throws Throwable {
		String actual = driver.findElement(By.id("spSuccessMsg")).getText();
		String expected = "User Details Inserted Successfully";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
	   
	    new HRMS_LogOut(driver);
	}
}