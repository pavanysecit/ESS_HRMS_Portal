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

public class NewUser_Creation_SearchCriteria {
WebDriver driver;	
	
	@Given("^Admin module, IT Admin module, New User creation page, search box and search button$")
	public void Admin_module_IT_Admin_module_New_User_creation_page_search_box_and_search_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on New User details link under IT Admin module, enter the data in search box and click on search icon$")
	public void Click_on_New_User_details_link_under_IT_Admin_module_enter_the_data_in_search_box_and_click_on_search_icon() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[7]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement eid = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/input"));
	    eid.sendKeys("5151");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[1]")).getText();
		String expected = "5151";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		eid.clear();
		Thread.sleep(1000);
	}

	@Then("^System should check the entered details with existing user details and display the matching user details$")
	public void System_should_check_the_entered_details_with_existing_user_details_and_display_the_matching_user_details() throws Throwable {
	    WebElement efname = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/input"));
	    efname.sendKeys("namik");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[2]")).getText();
		String expected1 = "Namik";
		Assert.assertEquals(expected1, actual1);
		Thread.sleep(2000);
		efname.clear();
		Thread.sleep(1000);
		
	    WebElement elname = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/input"));
	    elname.sendKeys("kisoor");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[3]")).getText();
		String expected2 = "Kisoor";
		Assert.assertEquals(expected2, actual2);
		Thread.sleep(2000);
		elname.clear();
		Thread.sleep(1000);
		
	    WebElement pwd = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/input"));
	    pwd.sendKeys("12345");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual3 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[4]")).getText();
		String expected3 = "12345";
		Assert.assertEquals(expected3, actual3);
		Thread.sleep(2000);
		pwd.clear();
		Thread.sleep(1000);
		
	    WebElement role = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/input"));
	    role.sendKeys("Manager");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual4 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[5]")).getText();
		String expected4 = "Manager";
		Assert.assertEquals(expected4, actual4);
		Thread.sleep(2000);
		role.clear();
		Thread.sleep(1000);
		
	    WebElement status = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/input"));
	    status.sendKeys("Active");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[1]/div/div[1]/div/i")).click();
	    Thread.sleep(2000);
	    
		String actual5 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[6]")).getText();
		String expected5 = "Active";
		Assert.assertEquals(expected5, actual5);
		Thread.sleep(2000);
		status.clear();
		Thread.sleep(1000);
		
		new HRMS_LogOut(driver);
	}
}