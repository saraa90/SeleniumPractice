package day5_WorkingWithWbdElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/C://Users//saraa//OneDrive//Desktop//Web tools//chromedriver//chromedriver_win32//chromedriver.exe/");
/*
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.get("https://www.amazon.com/");
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.sendKeys("coffee mug");
	        searchBox.submit();
	        driver.navigate().back();
	        searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.clear();
	        searchBox.sendKeys("pretty coffee mug");
	        searchBox.submit();
	        driver.navigate().back();
	        driver.navigate().forward();
	        driver.navigate().refresh();
	*/
	
	        
	    		WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    	// go to https://saucedemo.com 
	    	 driver.get("https://www.saucedemo.com/");
	    	 // log in with userName = standard_user   password = secret_sauce
	         WebElement userName = driver.findElement(By.id("user-name"));
	         WebElement password = driver.findElement(By.id("password"));
	         WebElement loginButton = driver.findElement(By.id("login-button"));
	         userName.sendKeys("standard_user");
	         password.sendKeys("secret_sauce");
	         loginButton.click();
	         
	          //  find all the results.print the price of each result. 
	            // Hint: loop through the list, get index and get text
	         List<WebElement> products = driver.findElements(By.className("inventory_item_price"));
	         for (int i = 0; i < products.size(); i++) {
	             System.out.println(products.get(i).getText());
	             
	             
	             
	             // Test case 2 
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		     //go to https://saucedemo.com 
					driver.get("https://saucedemo.com");
		     //log in with username = standard_user   password = secret_sauce
					driver.findElement(By.id("user-name")).sendKeys("standard_user");
					driver.findElement(By.id("password")).sendKeys("secret_sauce");
					driver.findElement(By.id("login-button")).click();
		     //find all the results. print the price of each result. 
		     //Hint: loop through the list, get index and get text
					List<WebElement> itemsPrice = driver.findElements(By.cssSelector(".inventory_item_price"));
					
					for (int i1 = 0; i1 < itemsPrice.size(); i1++) {
					    System.out.println(itemsPrice.get(i1).getText());
					    // broken down steps.
//						WebElement singleItem = itemsPrice.get(i);
//						String priceofItem = singleItem.getText();
//						System.out.println(priceofItem);
					}
	         }
					
					// for each loop version  == demo purpose only
				//	for (WebElement singleItemPrice : itemsPrice) {
						//System.out.println(singleItemPrice.getText));
					
		}
	//JAVA
	public void findElementsDemo() {
			// Test case 1
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    // go to https://saucedemo.com
			driver.get("https://saucedemo.com");
		    // log in with username = standard_user   password = secret_sauce
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
		    // find all the results and get them in a list, and print the size of the list.
			List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item"));
			int sizeOfList = items.size();
			System.out.println(sizeOfList + " Items available on the page.");
			
		}
	//JAVA
	public void classActivity1() throws InterruptedException {
			// Test case 
			WebDriver driver = new ChromeDriver();
		    // maximize browser
			driver.manage().window().maximize();
		    // declare implicitly wait for 5 seconds
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    // go to amazon.com
			driver.get("https://amazon.com");
		    // Search coffee mug.
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys("Coffee mug", Keys.ENTER);
			Thread.sleep(1000);
		    // Navigate back then search pretty coffee mug. 
			driver.navigate().back();
			searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys("Pretty coffee mug", Keys.ENTER);
			
			// driver is page specific tool, whenever driver moves to a different page, driver loses the references to the 
			// elements within the previous page.
			
			Thread.sleep(1000);
		    // Navigate back then navigate forward
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
		    // Refresh the page.
			driver.navigate().refresh();
		}
	//JAVA
	public void navigateExamples() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			// window maximize
			driver.manage().window().maximize();
			
			// implicitly wait - Implicitly wait - waits the page (html elements / dom structure) to be loaded properly.
			// That doen't mean your element to be visible on the screen.
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// it doesn't wait 5 second if the page is loaded in 1 second, it just moves to next command.
			
			driver.navigate().to("https://google.com");
			WebElement inputBox = driver.findElement(By.name("q"));
			
			inputBox.sendKeys("Coffee mug", Keys.ENTER);
			Thread.sleep(2000);
			// navigate back to previous page
			driver.navigate().back();
			Thread.sleep(2000);
			// navigate forward to last visited page
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		}
	//JAVA
	public void KeyPressExample() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			// window maximize
			driver.manage().window().maximize();
			
			// implicitly wait - Implicitly wait - waits the page (html elements / dom structure) to be loaded properly.
			// That doen't mean your element to be visible on the screen.
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// it doesn't wait 5 second if the page is loaded in 1 second, it just moves to next command.
			
			// navigate to google.com
			driver.get("https://google.com");
			// search for coffee mug
			WebElement inputBox = driver.findElement(By.name("q"));
			inputBox.sendKeys("Coffee Mug");
			// hit enter
			inputBox.sendKeys(Keys.ENTER);
			// find the search box again
			WebElement searchInputBox = driver.findElement(By.name("q"));
			// select the text in it
			searchInputBox.sendKeys(Keys.chord(Keys.COMMAND, "a"));
			Thread.sleep(2000);
			// delete the selected text
			searchInputBox.sendKeys(Keys.DELETE);
			Thread.sleep(2000);
			// search new item
			searchInputBox.sendKeys("Pretty coffee mug", Keys.ENTER);
			
			
		
	         
	    		
	    		
	    		

	        
	            
	          
	           
	        }
}




