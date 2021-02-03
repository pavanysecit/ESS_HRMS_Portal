package stepDefinition_Approval;

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

public class ApprovalDetails_LA_SearchLeaves_ByEmployeeID {
WebDriver driver;	
	
	@Given("^Admin module, Approval module, Approval details page, leave approval tab, drop down to select employee id$")
	public void Admin_module_Approval_module_Approval_details_page_leave_approval_tab_drop_down_to_select_employee_id() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Approval details under approval module, select the employee id from the drop down$")
	public void Click_on_Approval_details_under_approval_module_select_the_employee_id_from_the_drop_down() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[1]/a")).click();
	    Thread.sleep(3000);
	    
	    WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[1]/div[1]/span[1]/select"));
	    Select se  = new Select(dropdown);
	    se.selectByVisibleText("5645");
	    
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/table/tbody/tr[1]/td[1]")).getText();
	    String expected_value = "5645";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(2000);
	}

	@Then("^System should display the selected employee leave details$")
	public void System_should_display_the_selected_employee_leave_details() throws Throwable {
	    WebElement dropdown1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[1]/div[1]/span[1]/select"));
	    Select se1  = new Select(dropdown1);
	    se1.selectByVisibleText("5151");
	    
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/table/tbody/tr[1]/td[1]")).getText();
	    String expected_value1 = "5151";
	    Assert.assertEquals(actual_value1, expected_value1);
	    Thread.sleep(2000);
	    
	    WebElement dropdown2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[1]/div[1]/span[1]/select"));
	    Select se2  = new Select(dropdown2);
	    se2.selectByVisibleText("5513");
	    
		String actual_value2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/section/div/div/div/div[1]/div/div[2]/div[4]/div/table/tbody/tr[1]/td[1]")).getText();
	    String expected_value2 = "5513";
	    Assert.assertEquals(actual_value2, expected_value2);
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}