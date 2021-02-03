package stepDefinition_ITAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class RolesAndRights_Role_AddNewRole {
WebDriver driver;	
	
	@Given("^Admin module, IT Admin module, Roles And Rights module, Add Role button and Save button$")
	public void Admin_module_IT_Admin_module_Roles_And_Rights_module_Add_Role_button_and_Save_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Roles and Rights link under IT Admin module, Click on Add Role button, enter the role name and click on Save button$")
	public void Click_on_Roles_and_Rights_link_under_IT_Admin_module_Click_on_Add_Role_button_enter_the_role_name_and_click_on_Save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[2]/div/form/div/button")).click();
	    Thread.sleep(2000);
	    
	    WebElement role = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div[1]/div/input"));
	    role.sendKeys("IT Specialist");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/form/button[1]")).click();
	    Thread.sleep(2000);   
	}

	@Then("^New Role should get created and should be visible in the role drop down list post creation$")
	public void New_Role_should_get_created_and_should_be_visible_in_the_role_drop_down_list_post_creation() throws Throwable {
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/form/span[1]")).getText();
		String expected = "Roles Added";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		new HRMS_LogOut(driver);
	}
}