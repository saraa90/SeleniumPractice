package installationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webHomeWork {

	public static void main(String[] args) 
			throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");

		WebDriver driver = new ChromeDriver();
		
		
		/*driver.get("https://ebay.com/");
		WebElement searchBox = driver.findElement(By.id("gh-ac"));
		searchBox.sendKeys("coffee mug");
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();

		// task class 1 
driver.get("https://facebook.com");
		
		WebElement emailorPhoneField = driver.findElement(By.name("email or phone"));
		emailorPhoneField.sendKeys("automation");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("automation");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		
		// task class 2 
		
		driver.get("https://facebook.com");
		
		WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
		createAccountButton.click();
		
		Thread.sleep(1000);
		
		WebElement firstName = driver.findElement(By.name("firstname "));
		firstName.sendKeys("automation");
				
		WebElement lastName = driver.findElement(By.name("lastname "));
		lastName.sendKeys("automation");
				
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("automation");
				
		WebElement Password = driver.findElement(By.name("reg_passwd__"));
		Password.sendKeys("automation");
				
		
		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();
		
		
		System.out.println(" Current URL is : "+ driver.getCurrentUrl());
		
		WebElement nonUserNoticeLink = driver.findElement(By.id("non-user-notice-linl"));
		String noticeLinkText = nonUserNoticeLink.getText();
		System.out.println("Notice Link Text is : "+ noticeLinkText);
		driver.close();
		driver.quit();
		
		
		// task 1
		driver.get("https://etsy.com");
			Thread.sleep(1000);
		WebElement signInButton1 = driver.findElement(By.name("sign in"));
		signInButton1.click();
	
		WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("automation");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("automation");
		
		WebElement signInButton = driver.findElement(By.name("sign in"));
		signInButton.click();
		
		
		
		//task 2
		
		
		        driver.get("https://www.indeed.com/");

		        String homeURL = driver.getCurrentUrl();

		        String homeTitle = driver.getTitle();

		        WebElement whatField = driver.findElement(By.name("q"));
		        whatField.sendKeys("SDET");
		        
				Thread.sleep(1000);

		        WebElement searchButton = driver.findElement(By.id("whatWhereFormId"));
		        searchButton.submit();

		        String searchURL = driver.getCurrentUrl();
		        String searchTitle = driver.getTitle();

		        if (!searchURL.equals(homeURL) && searchURL.contains("SDET")) {
		            System.out.println("Search URL is correct");
		        } else {
		            System.out.println("Search URL is incorrect");
		        }

		        if (!searchTitle.equals(homeTitle) && searchTitle.contains("SDET")) {
		            System.out.println("Search title is correct");
		        } else {
		            System.out.println("Search title is incorrect");
		        }

		        WebElement jobsInLocationField = driver.findElement(By.id("where"));
		        String jobsInLocationText = jobsInLocationField.getAttribute("value");
		        if (jobsInLocationText.equals("SDET")) {
		            System.out.println("Jobs in location text is correct");
		        } else {
		            System.out.println("Jobs in location text is incorrect");
		        }

			        
		    	//Test case 1 - (Use only Xpath)
			    // go to facebook.com
				driver.get("https://facebook.com");
			    
				//find the Email or phone number field and type Automation
				WebElement emailorPhoneField = driver.findElement(By.xpath("//input[@name='email']"));
				emailorPhoneField.sendKeys("automation");
			    
				//find the Password field and type Automation
				WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
				Password.sendKeys("automation");
			    
				//  find the Login button and click on it.

				WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
				loginButton.click();
				
		       */
		
		
		
		//Test case 2 - (Use only Xpath)
	    // go to facebook.com
		driver.get("https://facebook.com");
		
	    // find the Create New Account button and click on it
		WebElement createAccountButton = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		createAccountButton.click();
		
		Thread.sleep(2000);
		
	    // find the FirstName, LastName, Email and Password fields and type Automation
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("automation");
	
		
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("automation");
		
	
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__"));
		email.sendKeys("automation");
	
	
		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Password.sendKeys("automation");
	  
		

		//  find the Sign Up button and click on it.
		WebElement signup = driver.findElement(By.xpath("//button[contains(text(),'Sign up']"));
		signup.click();
		
	

		
		    }
		

		
		
		
		
		
		


	

	}


