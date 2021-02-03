package stepDefinition_ITAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_Admin;
import stepDefinition_Login.HRMS_URL;

public class NewUser_Creation_ClearData {
WebDriver driver;	
	
	@Given("^Admin module, IT Admin module, New User creation page and Clear button$")
	public void Admin_module_IT_Admin_module_New_User_creation_page_and_Clear_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on New user details link under IT Admin module, enter the details and click on Clear button$")
	public void Click_on_New_user_details_link_under_IT_Admin_module_enter_the_details_and_click_on_Clear_button() throws Throwable {
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
	    driver.findElement(By.id("txtUsername")).click();
	    Thread.sleep(2000);
	    
	    WebElement UserId = driver.findElement(By.id("ddlUserid"));
	    Select id = new Select(UserId);
	    id.selectByVisibleText("100");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("txtPassword")).sendKeys("12345");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/form/button[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^All the entered data in the user creation page should get cleared$")
	public void All_the_entered_data_in_the_user_creation_page_should_get_cleared() throws Throwable {
	    new HRMS_LogOut(driver);
	}
}