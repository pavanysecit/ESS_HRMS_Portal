package stepDefinition_PayrollAndCompensation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class Payroll_Payslip_PrintSalarySlip {
WebDriver driver;	
	
	@Given("^Payroll and Compensation module, Salary slip page, salary period, submit and print button$")
	public void Payroll_and_Compensation_module_Salary_slip_page_salary_period_submit_and_print_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Payslip link under Payroll & Compensation module, select the salary period, click on Submit button and then click on Print button$")
	public void Click_on_Payslip_link_under_Payroll_Compensation_module_select_the_salary_period_click_on_Submit_button_and_then_click_on_Print_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement SP =  driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/form/div/select"));
	    Select se =  new Select(SP);
	    se.selectByVisibleText("201805");
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/form/div/button[1]")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[3]/form/div/button[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display the salary slip of the current employee in print format$")
	public void System_should_display_the_salary_slip_of_the_current_employee_in_print_format() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[7]/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]/span")).getText();
		String expected_value = "May";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(1000);
		
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[7]/div/div/div[2]/div/div/table/tbody/tr[2]/td[2]/span")).getText();
		String expected_value1 = "2018";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[7]/div/div/button[2]/i")).click();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(1000);
		driver.quit();
	}
}