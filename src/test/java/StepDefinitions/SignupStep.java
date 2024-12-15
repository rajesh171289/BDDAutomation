package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignupStep {
	static WebDriver driver;
	@Given("Browser is lanched with correct URL")
	public void browser_is_lanched_with_correct_url() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://magento.softwaretestingboard.com/");
		   // Pause execution for 10 seconds (10,000 milliseconds)
		try {
		    Thread.sleep(10000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		driver.close();
		//throw new io.cucumber.java.PendingException();
		
	}
	
	@Then("User navigates to testpage")
	public void user_navigates_to_testpage() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(driver.findElements(By.xpath("//div[@class='//*[@id=\"maincontent\"]/div[1]/h1/span']")).size()>0);
	}

}
