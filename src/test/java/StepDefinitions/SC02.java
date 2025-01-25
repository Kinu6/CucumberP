package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SC02 {
    WebDriver driver;
    
	@Given("I want to launch the browser for SC02")
	public void i_want_to_launch_the_browser() {
		WebDriverManager.firefoxdriver().setup();
		  driver= new FirefoxDriver();
		  driver.manage().window().maximize();
	}
	@And("Log in to vTiger CRM.")
	public void log_in_to_v_tiger_crm() {
		driver.navigate().to("http://localhost:8181/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	}
	@When("Navigate to the Leads module.")
	public void navigate_to_the_leads_module() {
	   driver.findElement(By.linkText("Leads")).click();
	}
	@And("Click on Add New Lead")
	public void click_on_add_new_lead() {
	    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	}
	@Then("Fill in the required fields Last Name")
	public void fill_in_the_required_fields_last_name() {
	    driver.findElement(By.name("lastname")).sendKeys("Shanti K");
	    driver.findElement(By.name("company")).sendKeys("Taliban");
	}
	@And("Click Save")
	public void click_save() {
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	}
	@And("Validate for Lead is created")
	public void validate_for_lead_is_created() {
	    String headerText=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	    
	    Assert.assertTrue(headerText.contains("Shanti K"), headerText);  
	}

}
