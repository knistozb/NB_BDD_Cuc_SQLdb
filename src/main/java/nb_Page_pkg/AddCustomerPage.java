
// Selenium Class 9.f:- July 9, 2023, Sunday with Instructor Shihabul Khandakar (Shibab) 


package nb_Page_pkg;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomerPage extends BasePage {

	
	
	
	
	
	
	
	
	// ==========================================================================
	
	
	WebDriver driver;
	WebDriverWait wait;

	
	// parameterizing the constructor to save it under a variable and globally declare in this class
	public AddCustomerPage(WebDriver driver) {
			
		this.driver = driver;
	}

	// WebElements:
	@FindBy(how = How.XPATH, using = "//div[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5") WebElement ADD_CUSTOMER_VALIDATION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]") WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]") WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]") WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id=\"country\"]") WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id=\"submit\"]") WebElement SAVE_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/button[2]") WebElement DELETE_OK_ELEMENT;

	
	
	public void validateAddCustomerPage(String expectedText) throws InterruptedException {
		Thread.sleep(2000);
		validateElement(ADD_CUSTOMER_VALIDATION_ELEMENT.getText(), expectedText, "Add Customer Page is not available!");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// globally declaring this variable so we can use it here and other methods below: 
	static String insertedName;
	
	public static String getInsertedName() {
		return insertedName;
	}

	public void insertFullName(String fullName) {
		insertedName = fullName + randomNumGenerator(999);    
		FULL_NAME_ELEMENT.sendKeys(insertedName);
	}
	
	public void selectCompany(String company) {
	
		selectDropdown(COMPANY_ELEMENT, company);
	}
	
	public void insertEmail(String email) {
		
		EMAIL_ELEMENT.sendKeys(randomNumGenerator(9999) + email );
	}
	
	public void insertPhone(String phone) {
		
		PHONE_ELEMENT.sendKeys(phone + randomNumGenerator(999));
	}
	
	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}
	
	public void insertCity(String city) {
		
		CITY_ELEMENT.sendKeys(city );
	}
	
	public void insertState(String state) {
		
		STATE_ELEMENT.sendKeys(state );
	}
	
	public void insertZip(String zip) {
		
		ZIP_ELEMENT.sendKeys(zip );
	}
	
	public void selectCountry(String country) {
		
		selectDropdown(COUNTRY_ELEMENT, country);
	}

	public void clickOnSaveButton() {
		
		SAVE_ELEMENT.click();
	}
	
}


