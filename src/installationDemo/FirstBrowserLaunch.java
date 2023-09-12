package installationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstBrowserLaunch {

	public static void main(String[] args) {
		
	// on windows computer this is how it look like 	
	System.setProperty("webdriver.chrome.driver", "/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");
	
	
	// we are creating an object here
	// webDriver is an interface being a reference type  
	// ChromeDriver is class being an object type here 
	WebDriver driver = new ChromeDriver();
	
	// navigate to amazon
	driver.get("https://amazon.com");
	//type for coffee mug in search field
	// 1. find the element of the search field
	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	// 2. sendKeys () to the element we found 
	searchBox.sendKeys("coffee mug");
	// click search button 
	// 1. find the search button element 
	WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	// 2. click on the element 
	searchButton.click();
	}
	
	
	
	
	}
