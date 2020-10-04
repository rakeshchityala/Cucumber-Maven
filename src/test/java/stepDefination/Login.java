package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login {
	WebDriver driver;
	Action action;
	@Before
		public void bt() {
		 System.setProperty("webdriver.chrome.driver", "D://JigSaw Learning//Selenium//Drivers//Chrome Driver 85.0.4183.87//chromedriver_win32//chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@After
	public void at() throws InterruptedException {
		Thread.sleep(3000);
		  
		  driver.close();
	}
	
	@Given("I'm able to navigate on to login page")
	public void i_m_able_to_navigate_on_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  driver.manage().window().maximize();
	   
	}
	
	@When("I update the user name as {string}")
	public void i_update_the_user_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("txtUsername")).sendKeys(string);
	    
	}
	
	@When("I update the password as {string}")
	public void i_update_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	@When("I click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
	   String expected=driver.findElement(By.xpath("//div[@id='wrapper']/div/a[2]")).getText();
	   Assert.assertEquals(expected, string);
	   driver.findElement(By.xpath("//div[@id='wrapper']/div/a[2]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//a[@href=\"/index.php/auth/logout\"]")).click();
	   Thread.sleep(5000);
	}
	
	@Then("i should see error message as {string}")
	public void i_should_see_error_message_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		String expected=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		Assert.assertEquals(expected, string);
	}


}
