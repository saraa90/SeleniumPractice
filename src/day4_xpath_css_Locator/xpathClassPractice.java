package day4_xpath_css_Locator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathClassPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");
		    WebDriver driver = new ChromeDriver();
		    
			driver.get("https://etsy.com");
			//Find Sign in button and click on it
			WebElement signinBtn = driver.findElement(By.className("select-signin"));
			signinBtn.click();
			//whenever you navigate to a new page, a wait should happen. 
			//Most of the time, you need to wait when you click on something.
			Thread.sleep(500);
			
			//Find email address field and type "automation"
			WebElement emailField = driver.findElement(By.id("join_neu_email_field"));
			emailField.sendKeys("automation");
			//Find the password field and type "automation"
			WebElement passwordField = driver.findElement(By.id("join_neu_password_field"));
			passwordField.sendKeys("Automation");
			//Find the sign in button and click on it
			WebElement signinButton = driver.findElement(By.name("submit_attempt"));
			signinButton.click();
	}

	public void css_practice() {
		
	 /*   WebDriver driver = new ChromeDriver();
	    driver.get("https://facebook.com");
	    driver.findElement(By.cssSelector("#email")).sendKeys("automation");
	    driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("password");
	    driver.findElement(By.cssSelector("button[data-testid=royal_login_button']"));
		*/
		
		
		
		
	
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.etsy.com/");
		    driver.findElement(By.cssSelector("#email")).sendKeys("jon.dow@gmail.com");
		    driver.findElement(By.cssSelector("#firstname")).sendKeys("Jon");
		    driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("password");
		    driver.findElement(By.cssSelector("data-testid=royal_login_button']")).click();
		    WebElement errorMessage = driver.findElement(By.cssSelector("div[class='alert error']"));
		    driver(errorMessage.getText(), "Sorry, the email you have entered is already in use.");
		}

		
		
		
		
	private void driver(String text, String string) {
		// TODO Auto-generated method stub
		
	}





	
		    
		    
		    
		
		public void xpath_contains()  throws InterruptedException {
	}

	
	}


