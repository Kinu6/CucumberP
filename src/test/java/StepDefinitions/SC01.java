package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SC01 {
	WebDriver driver;
	
	
	@Given("I want to launch the browser for SC01")
	public void i_want_to_launch_the_browser() throws InterruptedException {
	  WebDriverManager.firefoxdriver().setup();
	  driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	}
	@And("I want to Open the vTiger CRM login page")
	public void i_want_to_open_the_v_tiger_crm_login_page() {
	    
		driver.navigate().to("http://localhost:8181/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
	}
	@And("Enter valid username and password")
	public void enter_valid_username_and_password() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
	}
	@Then("Click the Login button")
	public void click_the_login_button() {
		 driver.findElement(By.id("submitButton")).click();
	}
	@And("Validate for HomePage")
	public void validate_for_home_page() {
		String title=" Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		
	     Assert.assertEquals(title, driver.getTitle());
	}


}
