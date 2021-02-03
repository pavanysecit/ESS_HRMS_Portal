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

public class RolesAndRights_Role_AddNewRole_SearchByIdAndName {
WebDriver driver;
	
	@Given("^Admin module, IT Admin module, Roles & Rights page, Add Role button, search box and search link$")
	public void Admin_module_IT_Admin_module_Roles_Rights_page_Add_Role_button_search_box_and_search_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Roles and Rights link under IT Admin module, Click on add role button, enter the data in search box and click on search link$")
	public void Click_on_Roles_and_Rights_link_under_IT_Admin_module_Click_on_add_role_button_enter_the_data_in_search_box_and_click_on_search_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[2]/div/form/div/button")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should check the entered details with existing role details and display the matching role details$")
	public void System_should_check_the_entered_details_with_existing_role_details_and_display_the_matching_role_details() throws Throwable {
	    WebElement roleid = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/input"));
	    roleid.sendKeys("16");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/i")).click();
	    Thread.sleep(2000);
	    
	    String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]")).getText();
	    String expected =  "16";
	    Assert.assertEquals(expected, actual);
	    Thread.sleep(1000);
	    roleid.clear();
	    Thread.sleep(1000);
	    
	    WebElement rolename = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/input"));
	    rolename.sendKeys("IT");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/i")).click();
	    Thread.sleep(2000);
	    
	    String actual1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[3]")).getText();
	    String expected1 = "IT Specialist";
	    Assert.assertEquals(expected1, actual1);
	    Thread.sleep(1000);
	    rolename.clear();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div/div/div[3]/button")).click();
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	}
}