package homeWorkForManday;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HomeWork {

	public static void main(String[] args) throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver", "/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");

		/*
		//Homework1:
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		signin.click();
		WebElement emailField = driver.findElement(By.id("ap_email"));
		if(emailField.isDisplayed()) {
			System.out.println("You are on the sign-in page");
		}
		driver.navigate().back();
		driver.navigate().forward();
		if(emailField.isDisplayed()) {
			System.out.println("You are on the account page");
		WebElement firstName = driver.findElement(By.id("ap_customer_name"));
		if(firstName.isDisplayed()) {
			System.out.println("First name element is dipalyed.");
		}
		driver.navigate().back();
		if(emailField.isDisplayed()) {
			System.out.println("You are on the sign-in page");
		}
		driver.navigate().forward();
		WebElement createAccount = driver.findElement(By.id("createAccountSubmit"));
		createAccount.clear();
		WebElement nameError = driver.findElement(By.xpath("//div[@class='a-alert-content']/ul/li[1]"));
		WebElement emailError = driver.findElement(By.xpath("//div[@class='a-alert-content']/ul/li[2]"));
		WebElement passwordError = driver.findElement(By.xpath("//div[@class='a-alert-content']/ul/li[3]"));
		if (nameError.getText().equals("Enter your name") && emailError.getText().equals("Enter your email or mobile phone number") && passwordError.getText().equals("Minimum 6 characters required")) {
			System.out.println("Error messages displayed and verified.");
		}
}

		
		// HomeWork 2
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		WebElement searchBox = driver.findElement(By.name("_nkw"));
		searchBox.sendKeys("coffee mug");
		searchBox.submit();
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='s-item__info clearfix']/div[1]/span[1]"));
		for (WebElement item : items) {
		System.out.println(item.getText());
		}
		driver.quit();

		*/
		
		// HomeWork 3
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		 //go to amazon.com
		
		driver.get("https://amazon.com");
	     //verify that you are on the amazon home page. (verify with title). 
		String homeTitle = "Amazon.com. Spend less. Smile more.";
		if (driver.getTitle().equals(homeTitle)) {
			System.out.println("Title matches!, Test Pass.");
		}else {
			System.out.println("Title Doesn't match!, Test Fail.");
		}
	     //verify dropdown value is by default "All Departments"
		
		String defaultDepartment = "All Departments";
		
		     // first we need to locate the dropdown element
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		    // we need to create an object select class
		Select letsSelect = new Select(dropdown);
		
		    if (letsSelect.getFirstSelectedOption().getText().equals(defaultDepartment)) {
				System.out.println("Default department is All Departments, Test Pass.");
			}else {
				System.out.println("Default department is NOT All Departments, Test Fail.");
			}
		
	     //select department Home & Kitchen, and search coffee mug.
		    letsSelect.selectByVisibleText("Home & Kitchen");
		    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee mug", Keys.ENTER);
		    
	     //verify you are on coffee mug search results page (use title).
		    if (driver.getTitle().contains("Coffee mug")) {
				System.out.println("Title contains the coffee mug search.");
			}else {
				System.out.println("Title Doesn't contain the coffee mug search.");
			}
		    
		    Select letsSelect2 = new Select(driver.findElement(By.id("searchDropdownBox")));
		    
	     //verify you are in Home & Kitchen department.
		    if (letsSelect2.getFirstSelectedOption().getText().equals("Home & Kitchen")) {
				System.out.println("The selected department is Home & Kitchen. Test pass.");
			} else {
				System.out.println("The selected department is NOT Home & Kitchen. Test fail.");
			}
		    
	}
}


		