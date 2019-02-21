package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver = null;
	
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application()
	{ 
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/v4/");
		//driver.manage().window().maximize();
	}
	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password()
	{
		//System.out.println("Enter the username and password");
		driver.findElement(By.name("uid")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("password");
	}
	@Then("^Reset the credential$")
	public void reset_the_credential()
	{
		//System.out.println("Reset the page");
		driver.findElement(By.name("btnReset")).click();
	}

}
