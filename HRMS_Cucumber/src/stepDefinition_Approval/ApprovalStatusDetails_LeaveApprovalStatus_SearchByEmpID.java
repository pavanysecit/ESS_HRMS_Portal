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

public class ApprovalStatusDetails_LeaveApprovalStatus_SearchByEmpID {
WebDriver driver;
	
	@Given("^Admin module, Approval module, Approval status details page, leave approval status tab, drop down to select employee id$")
	public void Admin_module_Approval_module_Approval_status_details_page_leave_approval_status_tab_drop_down_to_select_employee_id() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_Admin(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Approval status details under approval module, select the employee id from the drop down$")
	public void Click_on_Approval_status_details_under_approval_module_select_the_employee_id_from_the_drop_down() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[6]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[1]/div[1]/span[1]/select"));
	    Select se = new Select(dropdown);
	    se.selectByVisibleText("4490");
	    Thread.sleep(2000);
	    
	    String actual = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]")).getText();
	    String expected = "4490";
	    Assert.assertEquals(expected, actual);
	    Thread.sleep(2000);
	}

	@Then("^System should display the selected employee leave request approval status details button$")
	public void System_should_display_the_selected_employee_leave_request_approval_status_details_button() throws Throwable {
	    WebElement dropdown1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[1]/div[1]/span[1]/select"));
	    Select se1 = new Select(dropdown1);
	    se1.selectByVisibleText("5645");
	    Thread.sleep(2000);
	    
	    String actual1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]")).getText();
	    String expected1 = "5645";
	    Assert.assertEquals(expected1, actual1);
	    Thread.sleep(2000);
	    
	    WebElement dropdown2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[1]/div[1]/span[1]/select"));
	    Select se2 = new Select(dropdown2);
	    se2.selectByVisibleText("4490");
	    Thread.sleep(2000);
	    
	    String actual2 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/section/div/div/div/div[1]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]")).getText();
	    String expected2 = "4490";
	    Assert.assertEquals(expected2, actual2);
	    Thread.sleep(2000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}