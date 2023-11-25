
// On Saturday, July 30, 2023, BDD class 3, sess 3 with MS Islam

package nb_Steps_pkg;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
// import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import nb_Page_pkg.DatabasePage;
import nb_Page_pkg.LoginPage;
import nb_Util_pkg.BrowserFactory_or_TestBase;

public class LoginStepDefinition extends BrowserFactory_or_TestBase {

	// Link to download Eclipse 2019-R manually:
	// https://www.eclipse.org/downloads/packages/release/2019-06/r

	// Link to download TestNG manually:
	// https://testng.org/testng-eclipse-update-site/

	// IQA 1: What are test suite, test case, and test steps?
		// Test suite: .feature
		// Test case: different scenarios, scenario outline, etc.
		// Test steps: all those given, then, when, etc.

	// IQA 2: What is the background keyword in cucumber, and how is it executed? Why does it work its typical way?
		// Background is the keyword used in the feature
		// It takes the common steps from different scenarios and stores it under
		// Background so that everytime before the test scenario executes it, this one executes first...
		// if the chain is broken with any lines being different, then the codes below
		// it cannot be kept under background despite being similar codes only till the chain is broken steps, they can be put under background.
		// only if certain codes are repeatedly executed for both or multiple scenarios, then they can be kept under background

	
	// Null pointer exception: when something is being used to run the code, but has not been defined yet when you run the code.
		// Ex: object is not defined yet...but you are using the object to invoke some methods from other class.

	// Smoke testing: testing whether the major features are functioning or not this will be the additional testing including negative scenarios for us to test

	// Sanity Testing: testing done after unit testing and smoke testing?
		// logging in with correct credentials is sanity testing to ensure the login scenario is good?
		// because that's the feature that has been just added and we want to test if it passes

	// @tags : while using @desiredtags above scenarios, and features, you can use anything as long as we know what we are using...HOWEVER,
		// THE INDUSTRY STANDARD ARE @REGRESSION, @SMOKE, AND @TEST
			// 1. @Regression: usually used with feature... runs everything inside that feature
			// 2. @Smoke: using used with desired test scenarios and the major functionalities
			// 3. @Sanity: this is done before smoke...if this fails, there is no need to do smoke testing

	// monochrome = true, and plugin = "pretty" are paired together --> they work together in creating a clean report
		// make sure to use true and pretty together
		// pretty is all lowercase....CANNOT start with Pretty.

	// dryrun = true
		// its only just checking whether your feature is defined or not...
		// meaning if those each test steps run for specific test scenario are coupled with their steps definition in their respective locations like
		// pkg.class.method
		// if it cannot match, then it must error out....the final report will say null
		// since it the test steps and the steps definition method don't match this is useful if you need to just quickly test those 2 are paired perfectly or not....
	
	// dryrun = false
		// it is not only matching test steps with steps definition, but it is also running every codes inside those steps definition methods

	// CQA 1: While checking the html report... why is the one the dashboard validation failed in the first case while it passed on the second though they were both the same? no?
		// I thought only the login credentials were set different...dashboard
		// validation stuffs weren't manipulated right?
		// -->

	
	// Scenario Outline: combining different scenarios in 1 and running it differently by putting under Examples
		// Examples: |key1|key2|
				  // |value1|value2|
	// However, if you want to run specific scenario then it's better not to use this outline technique since it can only run everything inside the examples pipes


	

	// ========== =============== =============== ============ =============== =============== ============ ===============

	
	
	
	// Global declaration for the object:
	LoginPage loginPage;
	DatabasePage databasePage;
	

	@Before
	public void setup() {

		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
//		takeScreenshot(driver);
	}

	@When("^User enters \"([^\"]*)\" from mysqldb database$")
	public void user_enters_from_mysqldb_database(String loginData) {

		if (loginData.equalsIgnoreCase("username")) {
			
			loginPage.enterUserName(databasePage.getDataFromMySQLDb("username"));
			System.out.println("Username from DB: " + databasePage.getDataFromMySQLDb("username"));
		}
		else if (loginData.equalsIgnoreCase("password")){
			
			loginPage.enterPassword(databasePage.getDataFromMySQLDb("password"));
			System.out.println("Password from DB: " + databasePage.getDataFromMySQLDb("password"));
		} 
		else {
			System.out.println("Unable to retrieve login data: " + "'" + loginData + "'" +  " from mySQL db.");
			
			
		}
	}

	// you dont really need these below two methods as they have already been called above 
	@When("User enters username as {string}") // lowercase string here is just a variable name
	public void user_enters_username_as(String username) { // String here is datatype
		loginPage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();
	}
	
	
	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
//		takeScreenshot(driver);
	}
	

	/*
	@When("User enters {string} from mysql database")
	public void user_enters_from_mysql_database(String loginData) {

		if (loginData.equalsIgnoreCase("username")) {
		} else if (loginData.equalsIgnoreCase("password")) {
		} else {
			System.out.println("Please Enter either username or password!");
		}
	}
	*/

	@After
	public void tearDown() {
		try {
			Thread.sleep(1500);
			driver.close();
			driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}

}
