package StepDefinitions;

import defaultpackage.pageObjects;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
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
		    Assert.assertTrue(driver.findElements(By.xpath("//a[@class='logo']/img[contains(@src,'images/logo.svg')]")).size()>0);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

		try {
			driver.findElement(By.xpath("//a[contains(@href, 'customer/account/create')]")).click();
		} catch (NoSuchElementException e) { // Handling the exception
		    System.out.println("Element not found: " + e.getMessage());
		    // Optional: Log the exception or take specific recovery steps here
		}
		// Create an instance of PageObjects
       
	}
	
	@Then("User navigates to testpage")
	public void user_navigates_to_testpage() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(driver.findElements(By.xpath("//a[@class='logo']/img[contains(@src,'images/logo.svg')]")).size()>0);
	
	}
	@And("Close the Browser")
	public void Close_the_Browser() {
		driver.close();
	}

}
