package stepDefinition_Benifits_LearningAndDevelopment;

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

public class Benefits_TipDetails_DisplayTipDetails {
WebDriver driver;
	
	@Given("^Benefits module, Tip Details page, salary period drop down and submit button$")
	public void Benefits_module_Tip_Details_page_salary_period_drop_down_and_submit_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on Tip Details under Benefits module, select the salary period from drop down and click on submit button$")
	public void Click_on_Tip_Details_under_Benefits_module_select_the_salary_period_from_drop_down_and_click_on_submit_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[4]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[4]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    
	    WebElement SSP = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/section/div[1]/form/div[2]/select"));
	    Select se = new Select(SSP);
	    se.selectByVisibleText("201801");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/section/div[1]/form/div[2]/button")).click();
	    Thread.sleep(3000);
	}

	@Then("^System should display the tip details of the current employee for selected salary period$")
	public void System_should_display_the_tip_details_of_the_current_employee_for_selected_salary_period() throws Throwable {
	    String actual_value = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/section/div[3]/div/div/div/div/div/div/table/thead/tr[1]/th")).getText();
	    String expected_value = "Summary";
	    Assert.assertEquals(actual_value, expected_value);
	    Thread.sleep(1000);
	    
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}