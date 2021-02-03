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

public class RolesAndRights_Menu_Search {
WebDriver driver;	
	
	@Given("^Admin module, IT Admin module, Roles & Rights page, Add Menu button, search box and search link$")
	public void Admin_module_IT_Admin_module_Roles_Rights_page_Add_Menu_button_search_box_and_search_link() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Roles and Rights link under IT Admin module, Click on add menu button, enter the data in search box and click on search link$")
	public void Click_on_Roles_and_Rights_link_under_IT_Admin_module_Click_on_add_menu_button_enter_the_data_in_search_box_and_click_on_search_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div[1]/div/form/div[1]/button")).click();
	    Thread.sleep(3000);
	}

	@Then("^System should check the entered details with existing menu details and display the matching menu details$")
	public void System_should_check_the_entered_details_with_existing_menu_details_and_display_the_matching_menu_details() throws Throwable {
	    WebElement search = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[3]/div/div[2]/div/div/div/input"));
	    search.sendKeys("personal");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[3]/div/div[2]/div/div/div/i")).click();
	    Thread.sleep(2000);
		
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[3]/div/div[2]/table/tbody/tr/td[2]")).getText();
		String expected = "Personal Information";
		Assert.assertEquals(expected, actual);
		Thread.sleep(1000);
		search.clear();
		Thread.sleep(1000);
		
	    WebElement search1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[3]/div/div[2]/div/div/div/input"));
	    search1.sendKeys("learning");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[3]/div/div[2]/div/div/div/i")).click();
	    Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[3]/div/div[2]/table/tbody/tr/td[2]")).getText();
		String expected1 = "Learning & Development";
		Assert.assertEquals(expected1, actual1);
		Thread.sleep(1000);
		search1.clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[3]/div/div/div[4]/button")).click();
		Thread.sleep(2000);
		
		new HRMS_LogOut(driver);
	}
}