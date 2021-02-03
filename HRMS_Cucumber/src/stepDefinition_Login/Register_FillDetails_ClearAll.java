package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_FillDetails_ClearAll {
WebDriver driver;	
	
	@Given("^Login page, SingUp link and clearall button$")
	public void Login_page_SingUp_link_and_clearall_button() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
	    new HRMS_URL(driver);
	    Thread.sleep(2000);
	}

	@When("^Click on SingUp link, enter all the details and click on ClearAll button$")
	public void Click_on_SingUp_link_enter_all_the_details_and_click_on_ClearAll_button() throws Throwable {
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
	    
	    driver.findElement(By.xpath("/html/body/div[2]/ui-view/div/div/div/div/div/form/div[12]/div/div/button[2]")).click();
	    Thread.sleep(2000);
	}

	@Then("^All the entered details should get cleared in the registration page$")
	public void All_the_entered_details_should_get_cleared_in_the_registration_page() throws Throwable {
	    driver.quit();
	}
}