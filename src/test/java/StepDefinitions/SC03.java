package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SC03 {
    WebDriver driver;
    
    String lastNameOfContact= "Harshit";
    
    @Given("I want to Launch the browser for TC03")
    public void i_want_to_launch_the_browser_for_tc03() {
    	WebDriverManager.firefoxdriver().setup();
		  driver= new FirefoxDriver();
		  driver.manage().window().maximize();
    }
    @And("I want to Login with valid username and password")
    public void i_want_to_login_with_valid_username_and_password() {
    	driver.navigate().to("http://localhost:8181/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
    }
    @When("Navigate to the Contacts module")
    public void navigate_to_the_contacts_module() {
        driver.findElement(By.linkText("Contacts")).click();
    }
    @Then("Select an existing contact")
    public void select_an_existing_contact() {
    	System.out.println("r1");
    }
    @And("Select a contact and click Delete")
    public void select_a_contact_and_click_delete() {
    	driver.findElement(By.xpath("//input[@name='search_text' and @class='txtBox']")).sendKeys(lastNameOfContact);
		WebElement ele= driver.findElement(By.name("search_field"));
		Select s= new Select(ele);
		s.selectByValue("Last Name");
		
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText(lastNameOfContact)).click(); 
    }
	@And("Confirm the deletion")
	public void confirm_the_deletion() {
		 driver.findElement(By.name("Delete")).click();  
	}

	
}
