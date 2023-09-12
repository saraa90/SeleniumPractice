package day2_workingWithLocators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLocators {

	public static void main(String[] args) {
		
		
		// on windows computer this is how it look like 	
		System.setProperty("webdriver.chrome.driver", "/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");
		
		
		// we are creating an object here
		// webDriver is an interface being a reference type  
		// ChromeDriver is class being an object type here 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("automation");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("automation");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		
		driver.get("https://amazon.com");
		WebElement backToSchoolLink = driver.findElement(By.linkText("Music"));
		backToSchoolLink.click();
		
		
		driver.get("https://amazon.com");
		WebElement partialLinkText = driver.findElement(By.partialLinkText("footwear on Shopbop"));
		partialLinkText.click();
		

		driver.get("https://amazon.com");
		WebElement off = driver.findElement(By.("nav-swm-text"));
		partialLinkText.click();
		
		

	}

}
