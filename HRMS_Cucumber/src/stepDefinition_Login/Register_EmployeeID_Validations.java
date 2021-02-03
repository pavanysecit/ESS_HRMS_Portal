package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_EmployeeID_Validations {
WebDriver driver;	
	
	@Given("^Login page, SingUp link, register button and validation messages for employeeid$")
	public void Login_page_SingUp_link_register_button_and_validation_messages_for_employeeid() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	}

	@When("^Click on SingUp link, enter all the details with employeeid which is not exists in the HRM and click on register button$")
	public void Click_on_SingUp_link_enter_all_the_details_with_employeeid_which_is_not_exists_in_the_HRM_and_click_on_register_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/div[4]/div/span")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[2]/div/input")).sendKeys("534645");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[3]/div/input")).sendKeys("998856414");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[4]/div/input")).sendKeys("20-Nov-1988");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[7]/div/input")).sendKeys("9986416710");
	    Thread.sleep(2000);
	    
	    WebElement cntry = driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[8]/div/div/select"));
	    Select se = new Select(cntry);
	    se.selectByVisibleText("Suriname");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[10]/div/input")).sendKeys("test@123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[11]/div/input")).sendKeys("test@123");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[12]/div/div/button[3]")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should display validation message if the entered employeeid doesn't exist in the HRM$")
	public void System_should_display_validation_message_if_the_entered_employeeid_doesn_t_exist_in_the_HRM() throws Throwable {
		String actual_value = driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[1]")).getText();
		String expected_value = "EmployeeId does not exists.please check employee Id / Government Id / Date Of Birth!!";
		Assert.assertEquals(actual_value, expected_value);
		Thread.sleep(2000);
		driver.quit();
	}
}