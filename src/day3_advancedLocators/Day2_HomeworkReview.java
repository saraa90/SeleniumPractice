package day3_advancedLocators;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day2_HomeworkReview {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");

		/*WebDriver driver = new ChromeDriver();
	
		//Test case 1
		//Go to etsy.com
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

		
		
		WebDriver driver = new ChromeDriver();
		String searchCriteria = "SDET";
		//Test case 2:
			//1. go to indeed.com
		driver.get("https://indeed.com");
			//2. get the current URL and store it in a variable called homeURL.
		String homeURL = driver.getCurrentUrl();
		System.out.println("Home URL is: " + homeURL);
			//3. get the website title and store it in a variable homeTitle.
		String homeTitle = driver.getTitle();
		System.out.println("Home Title is: " + homeTitle);
			//4. find the input field for WHAT and type SDET
		WebElement whatField = driver.findElement(By.name("q"));
		whatField.sendKeys(searchCriteria); 
			//5. find the Search button and click on it.
		WebElement searchBtn = driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton"));
		searchBtn.click();
		Thread.sleep(1000);
			//6. get the current URL and store it as a variable searchURL.
		String searchURL = driver.getCurrentUrl();
		System.out.println("Search URL is: " + searchURL);
			//7. get the website title and store it in a variable searchTitle.
		String searchTitle = driver.getTitle();
		System.out.println("Search Title is: " + searchTitle);
			//8. verify that searchURL does not equal to homeURL and contains the search criteria.
		if ((!searchURL.equals(homeURL)) && searchURL.contains(searchCriteria)) {
			System.out.println("Search URL Test Pass!");
		}else {
			System.out.println("Search URL Test Fail!");
		}
			//9. verify that searchTitle does not equal to homeTitle and has the search criteria.
		if ((!searchTitle.equals(homeTitle)) && searchTitle.toLowerCase().contains(searchCriteria.toLowerCase())) {
			System.out.println("Search Title Test Pass!");
		}else {
			System.out.println("Search Title Test Fail!");
		}
			//10. Get Text of the JobsInLocation field, store it in a variable, 
		//then verify if it's equal to your search criteria.
		
		WebElement jobsInTextField = driver.findElement(By.className("css-novqjp"));
		String jobsInText = jobsInTextField.getText();
		System.out.println("Jobs in the area text is: " + jobsInText);
		
		// First approach: we could verify the text in this way
		if (jobsInText.contains(searchCriteria)) {
			System.err.println("Jobs in the area text verification pass.");
		}else {
			System.out.println("Jobs in the area text verification fail.");
		}
		
		
		// Second approach:  SDET jobs in Centreville, VA
         String cutText = jobsInText.substring(0, 4);
         System.out.println("SubStringed text is: " + cutText);
		if (cutText.equals(searchCriteria)) {
			System.err.println("Pass - Jobs in the area text verification");
		} else {
			System.err.println("Fail - Jobs in the area text verification");
		}
		
		
		
		//Test case:
		driver.get("https://www.etsy.com/signin");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();

		WebElement errorMessage = driver.findElement(By.xpath("//div[@class='wt-text-caption wt-text-caption--error wt-mt-xs-2']"));

		*/
		
		//Homework 2:  Work on the task

		//Go to indeed.com
		//Find the Where field and get value of attribute 'value', then verify it's based on your current location.
		//Find the Where field and get css value of color, then print it out.
		//Find the Where field and get tag name, then verify the tag name is equals to "input".
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.com");
		WebElement whereField = driver.findElement(By.id("text-input-where"));
		String value = whereField.getAttribute("value");
			System.out.println("The value of the 'Where field is : "+ value );
		String color = whereField.getCssValue("color");
			System.out.println("The color of the 'Where field is : "+ color );
		String tagName = whereField.getTagName();
			System.out.println("The name of the 'Where field is : "+ tagName );
		

		
		
		
		
		
		
	}
}
