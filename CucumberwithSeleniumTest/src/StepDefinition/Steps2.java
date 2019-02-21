package StepDefinition;



import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps2 {

	WebDriver driver = null;
	
	@Given("^Open the firefox and launch the application$")
	public void open_the_firefox_and_launch_the_application()
	{ 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.demo.guru99.com/v4/");
	}
	@When("^Enter the username and password$")
	public void enter_the_username_and_password()
	{
		System.out.println("Enter the username and password");
		driver.findElement(By.name("uid")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("password");
		
	}
	@Then("^Login the credential$")
	public void login_the_credential()
	{
		System.out.println("Reset the page");
		driver.findElement(By.name("btnLogin")).click();
	}

}

