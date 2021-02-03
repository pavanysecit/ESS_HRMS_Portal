package stepDefinition_LeavesAndPensionInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinition_Login.HRMS_LogOut;
import stepDefinition_Login.HRMS_Login_NormalUser;
import stepDefinition_Login.HRMS_URL;

public class PersonalInfo_FoodHandler_Navigation {
WebDriver driver;	
	
	@Given("^Personal information module and food handler page$")
	public void Personal_information_module_and_food_handler_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	    new HRMS_Login_NormalUser(driver);
	    Thread.sleep(3000);
	}

	@When("^Click on food handler link under personal information module and then click on food handler link$")
	public void Click_on_food_handler_link_under_personal_information_module_and_then_click_on_food_handler_link() throws Throwable {
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[2]/a/span[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/section[1]/div[2]/div[2]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	}

	@Then("^System should navigate to the food handler page$")
	public void System_should_navigate_to_the_food_handler_page() throws Throwable {
		String actual_value1 = driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div[1]/div/span")).getText();
		String expected_value1 = "Food Handler";
		Assert.assertEquals(actual_value1, expected_value1);
		Thread.sleep(2000);	
		
	    new HRMS_LogOut(driver);
	    Thread.sleep(1000);	
	    driver.quit();
	}
}