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
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class Payroll_ViewTaxForm_TaxForm_ViewLink {
WebDriver driver;
	
	@Given("^Payroll and Compensation module, view tax form page, salary period, submit button and view button$")
	public void Payroll_and_Compensation_module_view_tax_form_page_salary_period_submit_button_and_view_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on View Tax Form link under Payroll & Compensation module, select the salary perios, click on submit button and then click on View link$")
	public void Click_on_View_Tax_Form_link_under_Payroll_Compensation_module_select_the_salary_perios_click_on_submit_button_and_then_click_on_View_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[3]/ul/li[4]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement SP = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/form/div/select"));
	    Select se = new Select(SP);
	    se.selectByVisibleText("201805");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[2]/form/div/button")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[4]/div[1]/table/tbody/tr/td[6]/a")).click();
	    Thread.sleep(4000);
	}

	@Then("^System should display the tax details in detailed for the selected salary period for current employee$")
	public void System_should_display_the_tax_details_in_detailed_for_the_selected_salary_period_for_current_employee() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[4]/div[3]/div/div/div[1]/h4")).getText();
		String expected_value = "View Tax Form";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div[4]/div[3]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}