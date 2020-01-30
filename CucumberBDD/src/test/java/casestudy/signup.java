package casestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class signup {
	
	WebDriver driver;
	
	@Given("user must be on sign up page")
	public void user_must_be_on_sign_up_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignUp")).click();
	   
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		driver.findElement(By.id("userName")).sendKeys(username);
	    
	}

	@When("user enters firstname {string}")
	public void user_enters_firstname(String firstname) {
		driver.findElement(By.id("firstName")).sendKeys(firstname);
	    
	}

	@When("user enters lastname {string}")
	public void user_enters_lastname(String lastname) {
		driver.findElement(By.id("lastName")).sendKeys(lastname);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("user re-enters password {string}")
	public void user_re_enters_password(String password) {
		driver.findElement(By.name("confirmPassword")).sendKeys(password);
		
	    
	}

	@When("user selects gender as Female")
	public void user_selects_gender_as_Female() {
		 driver.findElement(By.xpath("//input[@value= 'Female' and @type='radio']")).click();
	    
	}

	@When("user enters emailid {string}")
	public void user_enters_emailid(String emailid) {
		 driver.findElement(By.id("emailAddress")).sendKeys("abc@gmail.com");
	}

	@When("user enters mobilenumber {string}")
	public void user_enters_mobilenumber(String mobilenumber) {
		driver.findElement(By.id("mobileNumber")).sendKeys("8867567890");
	    
	}

	@When("user enters DOB {string}")
	public void user_enters_DOB(String DOB) {
		 driver.findElement(By.name("dob")).sendKeys("12-12-2018");
	}

	@When("user enters address {string}")
	public void user_enters_address(String address) {
		 driver.findElement(By.id("address")).sendKeys("Bangalore");
	    
	}

	@When("user selects security question")
	public void user_selects_security_question() {
		Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		  sel.selectByIndex(1);
	}

	@When("user enters the answer {string}")
	public void user_enters_the_answer(String answer) {
		driver.findElement(By.id("answer")).sendKeys("Blue");
	   
	}

	@When("user clicks register")
	public void user_clicks_register() {
		 driver.findElement(By.name("Submit")).click();
	}

	@Then("user should be on login page")
	public void user_should_be_on_login_page() {
	   Assert.assertEquals("Login", driver.getTitle());
	   System.out.println("logged in!");

	}


}
