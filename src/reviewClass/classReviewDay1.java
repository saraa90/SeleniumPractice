package reviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classReviewDay1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");
	    
	    test1();
	}
	public static void test1() throws InterruptedException {
		
  // Test case 1:
	
			
			//WebDriver driver = new ChromeDriver();
		//	driver.manage().window().maximize();
		/*	
//			Go to "https://automationtesting.co.uk"
			driver.get("https://automationtesting.co.uk");
			driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
			
			WebElement ConactUsForm = driver.findElement(By.xpath("//a[@href='contactForm.html']"));
			ConactUsForm.click();

			WebElement firstNameField = driver.findElement(By.xpath("//input[@name='first_name']"));
			WebElement lastNameField = driver.findElement(By.xpath("//input[@name='last_name']"));
			WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
			WebElement messageField = driver.findElement(By.xpath("//textarea[@name='message']"));
			
			String fNameText = "Hamzah";
			String lNameText = "Aldeen";
			String emailText = "hamazah@gmail.com";
			String messageText = "Hello, this is my message"; 
			String actualMsg = "Thank you for your mail!";
			
			
			WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));

			Thread.sleep(2000);
//				Click on Contact Us Form Test.
			
//				Find the Test field for first name and 	Enter a first name
			Thread.sleep(2000);
			
			firstNameField.sendKeys(fNameText);
			
//				Find the Test field for last name and Enter last name.
			lastNameField.sendKeys(lNameText);
			
//				Find the Test field for email and Enter email address
			emailField.sendKeys(emailText);
			
//				Find the Test field for massage	and Enter a massage
			
			messageField.sendKeys(messageText);

//				Click on Submit
			submitBtn.click();
			
			Thread.sleep(2000);
//				Verify you get the error message:
//				" Thank you for your mail! "
			
			String  expectedMsg = driver.findElement(By.xpath("//h3[text()='Thank you for your mail!']")).getText();
			
			if(expectedMsg.equals(actualMsg)) {
				System.out.println("Test Pass");
			}else {
				System.out.println("Test Fail");
			}
			
			Thread.sleep(1000);
			
			driver.quit();
			
			
			
			
//			Test2

			
			driver.get("https://automationtesting.co.uk");
			driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
			
			
			WebElement ConactUsForm = driver.findElement(By.xpath("//a[@href='contactForm.html']"));
			ConactUsForm.click();
			WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
			WebElement messageField = driver.findElement(By.xpath("//textarea[@name='message']"));
			
			WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));

			
			String emailText = "saraa@gmail.com";
			String messageText = "Hello, this is my message"; 
			String actualMsg = "Error: all fields are required";
			
			
			emailField.sendKeys(emailText);
			messageField.sendKeys(messageText);

		submitBtn.click();
		
		Thread.sleep(2000);
		
		String  expectedMsg = driver.findElement(By.xpath("html/body")).getText();
		
		if(expectedMsg.equals(actualMsg)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		
		Thread.sleep(1000);
		
		driver.quit();
		
		*/
			
			
//			HomeWork for Friday.  
//			Go to 'https://demoqa.com/text-box'
			 WebDriver driver = new ChromeDriver();
			    driver.get("https://demoqa.com/text-box");
				driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();

			
//			Find the Full Name field and store it in a variable  
//			Enter a full name 
				 WebElement fullNameField = driver.findElement(By.id("userName"));
				    fullNameField.sendKeys("John Doe");
				
//			Find the email field 
//			Enter an email 
				    WebElement emailField = driver.findElement(By.id("userEmail"));
				    emailField.sendKeys("johndoe@gmail.com");
				    
				    
//			Find the current address field and enter address
				    WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
				    currentAddressField.sendKeys("20 h St");
				    
//			Find the permanent address field and enter address
			
				    WebElement permanentAddressField = driver.findElement(By.id("permanentAddress"));
				    permanentAddressField.sendKeys("20 h St");
				    WebElement submitButton = driver.findElement(By.id("submit"));
				    submitButton.click();
					Thread.sleep(2000);

//			Validate each entry of the text field 
				    

			
					  WebElement nameOutput = driver.findElement(By.id("name"));
					    nameOutput.getText();
					    WebElement emailOutput = driver.findElement(By.id("email"));
					    emailOutput.getText();
					    WebElement currentAddressOutput = driver.findElement(By.cssSelector("#output #currentAddress"));
					    currentAddressOutput.getText();
					    WebElement permanentAddressOutput = driver.findElement(By.cssSelector("#output #permanentAddress"));
					    permanentAddressOutput.getText();
					    driver.quit();
					
			
			
			
		}

	}










	   
