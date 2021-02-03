package stepDefinition_ITAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class RolesAndRights_Menu_CreateNew {
WebDriver driver;	
	
	@Given("^Admin module, IT Admin module, Roles And Rights page, Add Menu button and Save button$")
	public void Admin_module_IT_Admin_module_Roles_And_Rights_page_Add_Menu_button_and_Save_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Roles and Rights link under IT Admin module, enter the menu title and click on Save button$")
	public void Click_on_Roles_and_Rights_link_under_IT_Admin_module_enter_the_menu_title_and_click_on_Save_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/form/div[1]/button")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[3]/div/div[1]/form/div[1]/div/input")).sendKeys("PF Details");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[3]/div/div[1]/form/div[2]/div/button[1]")).click();
	    Thread.sleep(1000);
	}

	@Then("^New Menu should get created successfully and should be visible in the left menu post creation$")
	public void New_Menu_should_get_created_successfully_and_should_be_visible_in_the_left_menu_post_creation() throws Throwable {
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[2]/span")).getText();
		String expected = "Menu Added";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[4]/button")).click();
		Thread.sleep(2000);
		
		new HRMS_LogOut(driver);
	}
}