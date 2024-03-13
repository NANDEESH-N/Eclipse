package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep {
	@Before
    public void setUp() {
        // Set up WebDriver instance
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thisi\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
	
	WebDriver driver; 
	@Given("Go to Register page")
	public void go_to_register_page() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized");
        }
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	    
	    
	}

	@When("enter the login details with {string},{string},{string},{string} and {string}")
	public void enter_the_login_details_with_and(String string, String string2, String string3, String string4, String string5) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(string2);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(string3);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(string4);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(string5);
		
	
	}

	@Then("click on register button")
	public void click_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='register-button']")).click();

	}

}
